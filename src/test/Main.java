/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.*;
import dao.Account;
import dao.AccountDAO;
import dao.DiemDAO;
import dao.DocFileDiemCSV;
import java.util.List;
import pojo.*;
import dao.SinhVienDAO;
import dao.ThoiKhoaBieuDAO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
/**
 *
 * @author Chen-Yang
 */
public class Main {
    public static void main(String args[]) throws FileNotFoundException, IOException {
//        List<Sinhvien> dsSinhVien = SinhVienDAO.layDachSachSinhVien();
//        List<Lophoc> dsLop = SinhVienDAO.layDachSachLop();
//        List<Monhoc> dsMonHoc = ThoiKhoaBieuDAO.layDachSachTKB();
//        for(int i=0;i<dsLop.size();i++) {
//            
//            for(int j=0;j<dsMonHoc.size();j++) {
//                if(dsMonHoc.get(j).getLophoc().getMaLop().compareTo(dsLop.get(i).getMaLop())==0) {
//                    
//                    int id=1;
//                    for(int k=0;k<dsSinhVien.size();k++) {
//                        
//                        Loptheomon ltm = new Loptheomon();
//                        if(dsSinhVien.get(k).getLophoc().getMaLop().compareTo(dsLop.get(i).getMaLop())==0) {
//                            
//                            ltm.setId(id++);
//                            ltm.setMaLopTheoMon(dsLop.get(i).getMaLop()+"-"+dsMonHoc.get(j).getMaMon());
//                            ltm.setMonhoc(dsMonHoc.get(j));
//                            ltm.setLophoc(dsLop.get(i));
//                            ltm.setSinhvien(dsSinhVien.get(k));
//                            ltm.setDiemGk(0);
//                            ltm.setDiemCk(0);
//                            ltm.setDiemKhac(0);
//                            ltm.setDiemTong(0);
//                            DiemDAO.themLopTheoMon(ltm);
//                        }
//                    }
//                }
//            }
//        
//        }
//        ArrayList<Account> dsAccount = new ArrayList<Account>();
//        FileInputStream fis = null;
//        InputStreamReader isr = null;
//        BufferedReader br = null;
//        try{
//            fis = new FileInputStream("data/svAccount.csv");
//            isr = new InputStreamReader(fis);
//            br = new BufferedReader(isr);
//            //int brr = br.read();
//
//            String line = br.readLine(); 
//            
//            while(line!=null) {
//                String[] arr=line.split(",");
//                Account acc = new Account();
//                acc.setMatKhau(arr[1]);
//                acc.setTenDN(arr[0]);
//                dsAccount.add(acc);
//                line = br.readLine();
//            }
//            br.close();
//            isr.close();
//            fis.close();
//        } catch(IOException e) {
//            e.printStackTrace();
//        }  finally {
//            br.close();
//            isr.close();
//            fis.close();
//        } 
//        for(int i=0;i<dsAccount.size();i++) {
//            System.out.println(dsAccount.get(i).getTenDN());
//        }
//        List<Account> dsAccount = AccountDAO.DocAccount("data/svAccount.csv");
//        try {
//            FileOutputStream fos = new FileOutputStream("data/svAccount.csv");
//            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
//            BufferedWriter bw = new BufferedWriter(osw);
//            //bw.newLine();
//            for(Account acc:dsAccount) {
//                String line=acc.getTenDN()+","+acc.getMatKhau();
//                bw.write(line);
//                bw.newLine();
//            }
//            
//            bw.close();
//            osw.close();
//            fos.close();
//            
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
//        
//    }
//        String path = "data/Diem17HCB.csv";
//        List<DocFileDiemCSV> ds = new ArrayList<DocFileDiemCSV>();
//        FileInputStream fis = null;
//        InputStreamReader isr = null;
//        BufferedReader br = null;
//        try{
//            fis = new FileInputStream(path);
//            isr = new InputStreamReader(fis);
//            br = new BufferedReader(isr);
//            int brr = br.read();
//            String line = br.readLine();
//            String[] lopHoc_ = line.split(",");
//            String lopHoc = lopHoc_[0];
//            
//            line = br.readLine(); // bo qua dong chua thong tin
//            line = br.readLine(); 
//            while(line!=null) {
//                String[] arr=line.split(",");
//                DocFileDiemCSV diem = new DocFileDiemCSV();
//                
//                diem.setLop(lopHoc);
//                diem.setMssv(arr[1]);
//                diem.setDiemGK(Float.parseFloat(arr[3]));
//                diem.setDiemCK(Float.parseFloat(arr[4]));
//                diem.setDiemKhac(Float.parseFloat(arr[5]));
//                diem.setDiemTong(Float.parseFloat(arr[6]));
//                
//                ds.add(diem);
//                line = br.readLine();
//            }
//            br.close();
//            isr.close();
//            fis.close();
//        } catch(IOException e) {
//            e.printStackTrace();
//        }  finally {
//            br.close();
//            isr.close();
//            fis.close();
//        }  
//        List<DocFileDiemCSV> ds = DocDiem.DocDSSV("data/Diem17HCB.csv");
//        if(ds.size()==0) {
//            
//        }
//        else {
//            List<Loptheomon> dsLop = DiemDAO.layDachSachLopTheoMon();
//            for(int j=0;j<ds.size();j++) {
//                for(int i=0;i<dsLop.size();i++) {
//                    if(ds.get(0).getLop().compareTo(dsLop.get(i).getMaLopTheoMon())==0){
//                        if(ds.get(j).getMssv().compareTo(dsLop.get(i).getSinhvien().getMssv())==0) {
//                            Loptheomon ltm = DiemDAO.layThongTinLopTheoMon(dsLop.get(i).getId());
//                            if(ltm!=null) {
//                                ltm.setDiemGk(ds.get(j).getDiemGK());
//                                ltm.setDiemCk(ds.get(j).getDiemCK());
//                                ltm.setDiemKhac(ds.get(j).getDiemKhac());
//                                ltm.setDiemTong(ds.get(j).getDiemTong());
//                                DiemDAO.capNhatThongTinDiem(ltm);
//                            }
//                        }
//                    }
//                } 
//            }
//        }
//        String mon = "Thiết kế giao diện - CTT011";
//        if(mon.contains("CTT011")==true) {
//            System.out.println("Đúng rồi");
//        }
        List<Sinhvien> dsSinhVien = SinhVienDAO.layDachSachSinhVien();
        List<Lophoc> dsLop = SinhVienDAO.layDachSachLop();
        List<Monhoc> dsMonHoc = ThoiKhoaBieuDAO.layDachSachTKB();
        for(int i=0;i<dsLop.size();i++) {
            //System.out.println(dsLop.get(i).getMaLop());

            for(int j=0;j<dsMonHoc.size();j++) {

                if(dsMonHoc.get(j).getLophoc().getMaLop().compareTo(dsLop.get(i).getMaLop())==0) {
                    //System.out.println(i+ " Đúng rồi "+j);
                    //int id=1;
                    for(int k=0;k<dsSinhVien.size();k++) {
                        
                        Loptheomon ltm = new Loptheomon();
                        if(dsSinhVien.get(k).getLophoc().getMaLop().compareTo(dsLop.get(i).getMaLop())==0) {
                            //System.out.println(i+ " Đúng rồi "+j);
                            String id = dsSinhVien.get(k).getMssv()+"-"+dsMonHoc.get(j).getMaMon();
                            ltm.setId(id);
                            ltm.setMaLopTheoMon(dsLop.get(i).getMaLop()+"-"+dsMonHoc.get(j).getMaMon());
                            ltm.setMonhoc(dsMonHoc.get(j));
                            ltm.setLophoc(dsLop.get(i));
                            ltm.setSinhvien(dsSinhVien.get(k));
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
