package pojo;
// Generated Jun 20, 2020 8:26:29 AM by Hibernate Tools 4.3.1



/**
 * Loptheomon generated by hbm2java
 */
public class Loptheomon  implements java.io.Serializable {


     private String id;
     private Lophoc lophoc;
     private Monhoc monhoc;
     private Sinhvien sinhvien;
     private String maLopTheoMon;
     private float diemGk;
     private float diemCk;
     private float diemKhac;
     private float diemTong;

    public Loptheomon() {
    }

    public Loptheomon(String id, Lophoc lophoc, Monhoc monhoc, Sinhvien sinhvien, String maLopTheoMon, float diemGk, float diemCk, float diemKhac, float diemTong) {
       this.id = id;
       this.lophoc = lophoc;
       this.monhoc = monhoc;
       this.sinhvien = sinhvien;
       this.maLopTheoMon = maLopTheoMon;
       this.diemGk = diemGk;
       this.diemCk = diemCk;
       this.diemKhac = diemKhac;
       this.diemTong = diemTong;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public Lophoc getLophoc() {
        return this.lophoc;
    }
    
    public void setLophoc(Lophoc lophoc) {
        this.lophoc = lophoc;
    }
    public Monhoc getMonhoc() {
        return this.monhoc;
    }
    
    public void setMonhoc(Monhoc monhoc) {
        this.monhoc = monhoc;
    }
    public Sinhvien getSinhvien() {
        return this.sinhvien;
    }
    
    public void setSinhvien(Sinhvien sinhvien) {
        this.sinhvien = sinhvien;
    }
    public String getMaLopTheoMon() {
        return this.maLopTheoMon;
    }
    
    public void setMaLopTheoMon(String maLopTheoMon) {
        this.maLopTheoMon = maLopTheoMon;
    }
    public float getDiemGk() {
        return this.diemGk;
    }
    
    public void setDiemGk(float diemGk) {
        this.diemGk = diemGk;
    }
    public float getDiemCk() {
        return this.diemCk;
    }
    
    public void setDiemCk(float diemCk) {
        this.diemCk = diemCk;
    }
    public float getDiemKhac() {
        return this.diemKhac;
    }
    
    public void setDiemKhac(float diemKhac) {
        this.diemKhac = diemKhac;
    }
    public float getDiemTong() {
        return this.diemTong;
    }
    
    public void setDiemTong(float diemTong) {
        this.diemTong = diemTong;
    }




}


