package pojo;
// Generated Jun 6, 2020 4:56:18 PM by Hibernate Tools 4.3.1



/**
 * Giaovien generated by hbm2java
 */
public class Giaovien  implements java.io.Serializable {


     private int maGv;
     private String hoTen;
     private String tenDn;
     private String matKhau;
     private String sdt;
     private String diaChi;

    public Giaovien() {
    }

	
    public Giaovien(int maGv, String hoTen, String tenDn, String matKhau, String sdt) {
        this.maGv = maGv;
        this.hoTen = hoTen;
        this.tenDn = tenDn;
        this.matKhau = matKhau;
        this.sdt = sdt;
    }
    public Giaovien(int maGv, String hoTen, String tenDn, String matKhau, String sdt, String diaChi) {
       this.maGv = maGv;
       this.hoTen = hoTen;
       this.tenDn = tenDn;
       this.matKhau = matKhau;
       this.sdt = sdt;
       this.diaChi = diaChi;
    }
   
    public int getMaGv() {
        return this.maGv;
    }
    
    public void setMaGv(int maGv) {
        this.maGv = maGv;
    }
    public String getHoTen() {
        return this.hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getTenDn() {
        return this.tenDn;
    }
    
    public void setTenDn(String tenDn) {
        this.tenDn = tenDn;
    }
    public String getMatKhau() {
        return this.matKhau;
    }
    
    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
    public String getSdt() {
        return this.sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }




}


