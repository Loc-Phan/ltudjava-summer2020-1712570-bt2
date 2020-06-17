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
        String path = "data/svAccount.csv";
        List<Account> ds = AccountDAO.DocAccount(path);
        for(int i=0;i<ds.size();i++) {
            if(ds.get(i).getTenDN().compareTo("1742002")==0) {
                ds.get(i).setMatKhau("doimatkhau");
            }
        }
        boolean kq = AccountDAO.GhiAccount(path, ds);
        
    }

}
