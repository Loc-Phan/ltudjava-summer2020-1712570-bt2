/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import static dao.SinhVienDAO.DocDSSV;
import pojo.*;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.hibernate.Session;
/**
 *
 * @author Chen-Yang
 */
public class DiemDAO {
    public static List<Loptheomon> layDachSachLopTheoMon() {
        List<Loptheomon> ds = null;
        Session session = null;
        session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select ltm from Loptheomon ltm";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
        System.err.println(ex);
        } finally {
            session.close();
        }  
            return ds;
    }
   
    
    public static Loptheomon layThongTinLopTheoMon(int id) {
        Loptheomon ltm = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            ltm = (Loptheomon) session.get(Loptheomon.class,id);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return ltm;
    }
    
    
    public static boolean themLopTheoMon(Loptheomon ltm) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (DiemDAO.layThongTinLopTheoMon(ltm.getId())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(ltm);
            transaction.commit();
        } catch (HibernateException ex) {
            //Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
        return true;
    }
    
    
    
    public static boolean themDanhSachLopTheoMon() throws IOException {
        List<Sinhvien> dsSinhVien = SinhVienDAO.layDachSachSinhVien();
        List<Lophoc> dsLop = SinhVienDAO.layDachSachLop();
        List<Monhoc> dsMonHoc = ThoiKhoaBieuDAO.layDachSachTKB();
        for(int i=0;i<dsLop.size();i++) {
            for(int j=0;j<dsMonHoc.size();j++) {
                if(dsLop.get(i).getMaLop()==dsMonHoc.get(j).getLophoc().getMaLop()) {
                    int id=1;
                    for(int k=0;k<dsSinhVien.size();k++) {
                        Loptheomon ltm = new Loptheomon();
                        if(dsSinhVien.get(k).getLophoc().getMaLop()==dsLop.get(i).getMaLop()) {
                            ltm.setId(id++);
                            ltm.setMaLopTheoMon(dsLop.get(i).getMaLop()+"-"+dsMonHoc.get(j).getMaMon());
//                            ltm.setMonHoc(dsMonHoc.get(j).getMaMon());
//                            ltm.setLop(dsLop.get(i).getMaLop());
//                            ltm.setSinhVien(dsSinhVien.get(k).getMssv());
                            ltm.setDiemGk(0);
                            ltm.setDiemCk(0);
                            ltm.setDiemKhac(0);
                            ltm.setDiemTong(0);
                            DiemDAO.themLopTheoMon(ltm);
                        }
                    }
                }
            }
        
        }
        return true;
    }
}


