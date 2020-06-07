/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import pojo.Sinhvien;
import pojo.Lophoc;
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

public class SinhVienDAO {
    public static List<Sinhvien> DocCSV(String path) 
    {
        ArrayList ds = new ArrayList<Sinhvien>();
        try{
            FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            line = br.readLine(); // bo qua dong dau chua thong tin
            while(line!=null) {
                String[] arr=line.split(",");
                Sinhvien sv = new Sinhvien();
                sv.setMaSv(Integer.parseInt(arr[0]));
                sv.setMssv(arr[1]);
                sv.setHoTen(arr[2]);
                sv.setGioiTinh(arr[3]);
                sv.setCmnd(arr[4]);
                ds.add(sv);
                line = br.readLine();
            }
            br.close();
            isr.close();
            fis.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return ds;
        //xuat thong tin ra console
        
//            for (int i = 0; i < ds.size(); i++) {
//                Sinhvien temp = new Sinhvien();
//                System.out.printf("Thong tin sinh vien thu %d\n", i + 1);
//                temp = (Sinhvien) ds.get(i);
//                System.out.println("MaSV: "  + temp.getMaSv());
//                System.out.println("MSSV: " + temp.getMssv());
//                System.out.println("Ho ten: " + temp.getHoTen());
//                System.out.println("Gioi tinh: " + temp.getGioiTinh());
//                System.out.println("CMND: " + temp.getCmnd());
//            }
    }
    public static List<Sinhvien> layDachSachSinhVien() {
        List<Sinhvien> ds = null;
        Session session = null;
        session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "select sv from Hocsinh sv";
            Query query = session.createQuery(hql);
            ds = query.list();
        } catch (HibernateException ex) {
    
        System.err.println(ex);
        } finally {
            session.close();
        }  
            return ds;
    }
    public static Sinhvien layThongTinSinhVien(int maso) {
        Sinhvien sv = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            sv = (Sinhvien) session.get(Sinhvien.class,maso);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return sv;
    }
    public static boolean themSinhVien(Sinhvien sv) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.layThongTinSinhVien(sv.getMaSv())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(sv);
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
    public static Lophoc layThongTinLopHoc(int malop) {
        Lophoc lh = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            lh = (Lophoc) session.get(Lophoc.class,malop);
        } catch (HibernateException ex) {
            //Log the exception
            System.err.println(ex);
        } finally {
            session.close();
        }
        return lh;
    }
    public static boolean themLopHoc(Lophoc lh) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        if (SinhVienDAO.layThongTinLopHoc(lh.getMaLop())!= null) {
            return false;
        }
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(lh);
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
//    public static boolean themDanhSachSinhVien(List<Sinhvien> ds) {
//        
//        
//    }
}
