/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.Account;
import dao.AccountDAO;
import dao.DiemDAO;
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
        List<Account> dsAccount = AccountDAO.DocAccount("data/svAccount.csv");
        try {
            FileOutputStream fos = new FileOutputStream("data/svAccount.csv");
            OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw = new BufferedWriter(osw);
            //bw.newLine();
            for(Account acc:dsAccount) {
                String line=acc.getTenDN()+","+acc.getMatKhau();
                bw.write(line);
                bw.newLine();
            }
            
            bw.close();
            osw.close();
            fos.close();
            
        }catch(IOException e) {
            e.printStackTrace();
        }
        
    }

}
