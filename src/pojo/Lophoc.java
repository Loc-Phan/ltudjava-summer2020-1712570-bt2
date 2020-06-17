package pojo;
// Generated Jun 17, 2020 9:20:06 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Lophoc generated by hbm2java
 */
public class Lophoc  implements java.io.Serializable {


     private String maLop;
     private String tenLop;
     private int laLopHoc;
     private Set monhocs = new HashSet(0);
     private Set loptheomons = new HashSet(0);
     private Set sinhviens = new HashSet(0);

    public Lophoc() {
    }

	
    public Lophoc(String maLop, String tenLop, int laLopHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.laLopHoc = laLopHoc;
    }
    public Lophoc(String maLop, String tenLop, int laLopHoc, Set monhocs, Set loptheomons, Set sinhviens) {
       this.maLop = maLop;
       this.tenLop = tenLop;
       this.laLopHoc = laLopHoc;
       this.monhocs = monhocs;
       this.loptheomons = loptheomons;
       this.sinhviens = sinhviens;
    }
   
    public String getMaLop() {
        return this.maLop;
    }
    
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public String getTenLop() {
        return this.tenLop;
    }
    
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public int getLaLopHoc() {
        return this.laLopHoc;
    }
    
    public void setLaLopHoc(int laLopHoc) {
        this.laLopHoc = laLopHoc;
    }
    public Set getMonhocs() {
        return this.monhocs;
    }
    
    public void setMonhocs(Set monhocs) {
        this.monhocs = monhocs;
    }
    public Set getLoptheomons() {
        return this.loptheomons;
    }
    
    public void setLoptheomons(Set loptheomons) {
        this.loptheomons = loptheomons;
    }
    public Set getSinhviens() {
        return this.sinhviens;
    }
    
    public void setSinhviens(Set sinhviens) {
        this.sinhviens = sinhviens;
    }




}


