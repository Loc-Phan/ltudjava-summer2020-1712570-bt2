package pojo;
// Generated Jun 16, 2020 6:34:21 PM by Hibernate Tools 4.3.1



/**
 * Monhoc generated by hbm2java
 */
public class Monhoc  implements java.io.Serializable {


     private String maMon;
     private String tenMon;
     private String phongHoc;
     private String lop;

    public Monhoc() {
    }

    public Monhoc(String maMon, String tenMon, String phongHoc, String lop) {
       this.maMon = maMon;
       this.tenMon = tenMon;
       this.phongHoc = phongHoc;
       this.lop = lop;
    }
   
    public String getMaMon() {
        return this.maMon;
    }
    
    public void setMaMon(String maMon) {
        this.maMon = maMon;
    }
    public String getTenMon() {
        return this.tenMon;
    }
    
    public void setTenMon(String tenMon) {
        this.tenMon = tenMon;
    }
    public String getPhongHoc() {
        return this.phongHoc;
    }
    
    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }
    public String getLop() {
        return this.lop;
    }
    
    public void setLop(String lop) {
        this.lop = lop;
    }




}


