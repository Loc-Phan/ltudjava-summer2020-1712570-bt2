/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import pojo.*;
import dao.SinhVienDAO;
/**
 *
 * @author Chen-Yang
 */
public class Main {
    public static void main(String args[]) {
        String path = "data/17HCB.csv";
        SinhVienDAO.themDanhSachSinhVien(path);
        
        
//        Sinhvien sv = new Sinhvien();
//        sv.setMaSv(1);
//        sv.setMssv("1742001");
//        sv.setHoTen("Nguyễn Văn A");
//        sv.setGioiTinh("Nam");
//        sv.setCmnd("123456789");
//        sv.setMatKhau("1742001");
//        Lophoc lh = new Lophoc();
//        lh.setMaLop(1);
//        lh.setTenLop("17HCB");
//        lh.setLaLopHoc(1);
//        SinhVienDAO.themLopHoc(lh);
//        sv.setLophoc(lh);
//        boolean kq = SinhVienDAO.themSinhVien(sv);
//        if(kq=true) {
//            System.out.println("Them thanh cong");
//        }
//        else {
//            System.out.println("Them that bai");
//        }
//        Sinhvien sv_ = SinhVienDAO.layThongTinSinhVien(1);
//        if(sv_!=null) {
//                
//                
//                System.out.println("MaSV: "  + sv_.getMaSv());
//                System.out.println("MSSV: " + sv_.getMssv());
//                System.out.println("Ho ten: " + sv_.getHoTen());
//                System.out.println("Gioi tinh: " + sv_.getGioiTinh());
//                System.out.println("CMND: " + sv_.getCmnd());
//        }
//        else {
//            System.out.println("Sinh viên 1742001 không tồn tại");
//        }
//        List<Sinhvien> ds = SinhVienDAO.layDachSachSinhVien();
//        for(int i=0;i<ds.size();i++) {
//            Sinhvien sv = ds.get(i);
//            System.out.println("MaSV: " + sv.getMaSv());
//            System.out.println("MSSV: " + sv.getMssv());
//        }

    }
}
