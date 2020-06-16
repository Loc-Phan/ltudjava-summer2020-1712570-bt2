/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.DiemDAO;
import java.util.List;
import pojo.*;
import dao.SinhVienDAO;
import dao.ThoiKhoaBieuDAO;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Chen-Yang
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        List<Sinhvien> dsSinhVien = SinhVienDAO.layDachSachSinhVien();
        List<Lophoc> dsLop = SinhVienDAO.layDachSachLop();
        List<Monhoc> dsMonHoc = ThoiKhoaBieuDAO.layDachSachTKB();
        int id=1;
        for(int i=0;i<dsLop.size();i++) {
            for(int j=0;j<dsMonHoc.size();j++) {
                if(dsMonHoc.get(j).getLop().compareTo(dsLop.get(i).getMaLop())==0) {
                    
                    for(int k=0;k<dsSinhVien.size();k++) {
                        Loptheomon ltm = new Loptheomon();
                        if(dsSinhVien.get(k).getLop().compareTo(dsMonHoc.get(j).getLop())==0) {
                            ltm.setId(id++);
                            ltm.setMaLopTheoMon(dsMonHoc.get(j).getLop()+"-"+dsMonHoc.get(j).getMaMon());
                            ltm.setMon(dsMonHoc.get(j).getMaMon());
                            ltm.setLop(dsLop.get(i).getMaLop());
                            ltm.setSinhVien(dsSinhVien.get(k).getMssv());
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
        
    }

}
