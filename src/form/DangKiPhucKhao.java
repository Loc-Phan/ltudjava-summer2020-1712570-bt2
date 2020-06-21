/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import dao.Account;
import dao.DangKiPhucKhaoDAO;
import dao.DiemDAO;
import dao.PhucKhaoDAO;
import dao.SinhVienDAO;
import dao.ThoiKhoaBieuDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import pojo.Chitietphuckhao;
import pojo.Loptheomon;
import pojo.Monhoc;
import pojo.Phuckhao;

/**
 *
 * @author Chen-Yang
 */
public class DangKiPhucKhao extends javax.swing.JFrame {

    /**
     * Creates new form DangKiPhucKhao
     */
    Account temp;
    public DangKiPhucKhao() {
        initComponents();
        setDefaultCloseOperation(XemDiem.DISPOSE_ON_CLOSE);
    }
    public DangKiPhucKhao(Account acc) {
        temp = new Account();
        temp = acc;
//        List<Loptheomon> ds = DiemDAO.layDachSachLopTheoMon();
//        cbbMon.removeAllItems();
//        Monhoc mh = new Monhoc();
//        for(int i=0;i<ds.size();i++) {
//            
//            if(temp.getTenDN().compareTo(ds.get(i).getSinhvien().getMssv())==0) {
//                mh = ThoiKhoaBieuDAO.layThongTinTKB(ds.get(i).getMonhoc().getMaMon());
//                String tenMon = mh.getTenMon();
//                String maMon = ds.get(i).getMonhoc().getMaMon();
//                System.out.println(tenMon+"-"+maMon);
//                if(mh==null) {
//                    JOptionPane.showMessageDialog(rootPane, "Sinh viên này không học môn nào");
//                }
//                else {
//                    cbbMon.addItem(tenMon+"-"+maMon);
//                    cbbMon.setVisible(true); 
//                }
//            }
//            
//        }
        initComponents();
        setDefaultCloseOperation(XemDiem.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiemMM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLyDo = new javax.swing.JTextField();
        cbbMon = new javax.swing.JComboBox<>();
        cbbDiem = new javax.swing.JComboBox<>();
        btnGui = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký phúc khảo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Môn:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 115, 91, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Cột điểm phúc khảo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 161, 158, 28));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Điểm mong muốn");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 207, 158, 28));

        txtDiemMM.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(txtDiemMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 207, 265, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Lý do:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 91, 28));

        txtLyDo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtLyDo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtLyDo.setInheritsPopupMenu(true);
        txtLyDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLyDoActionPerformed(evt);
            }
        });
        getContentPane().add(txtLyDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 253, 265, 60));

        cbbMon.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbbMon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thiết kế giao diện-CTT011", "Kiểm chứng phần mềm-CTT012", "Lập trình ứng dụng Java-CTT001", "Mạng máy tính-CTT002" }));
        cbbMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMonActionPerformed(evt);
            }
        });
        getContentPane().add(cbbMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 115, 265, 28));

        cbbDiem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbbDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Điểm giữa kỳ", "Điểm cuối kỳ", "Điểm khác", "Điểm tổng" }));
        getContentPane().add(cbbDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 161, 265, 28));

        btnGui.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGui.setText("Gửi");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });
        getContentPane().add(btnGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 73, -1));

        btnLamMoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ĐĂNG KÍ PHÚC KHẢO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 300, 40));

        setSize(new java.awt.Dimension(506, 454));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtDiemMM.setText("");
        txtLyDo.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtLyDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLyDoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLyDoActionPerformed

    private void cbbMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbMonActionPerformed

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        if(txtDiemMM.getText().equals("") || txtLyDo.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane,"Bạn cần nhập đầy đủ thông tin");
        }
        else {
            String[] tenMon = cbbMon.getSelectedItem().toString().split("-");
            String maMon = tenMon[1];
            String cotDiem = cbbDiem.getSelectedItem().toString();
            String diemMM = txtDiemMM.getText();
            String lyDo = txtLyDo.getText();
            
            List<Loptheomon> dsLTM = DiemDAO.layDachSachLopTheoMon();
            String idLTM = temp.getTenDN()+"-"+maMon;
            int check=0;
            for(int i=0;i<dsLTM.size();i++) {
                if(idLTM.compareTo(dsLTM.get(i).getId())==0) {
                    check=1; //sv co hoc mon nay
                }
            }
            if (check == 1) {
                Date dNow = new Date();
                SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
                List<Phuckhao> dsPK = PhucKhaoDAO.layDachSachPhucKhao();
                Chitietphuckhao ctpk = new Chitietphuckhao();
                int checkHetHan = 0 ;
                for (int i = 0; i < dsPK.size(); i++) {
                    if (ft.format(dNow).compareTo(ft.format(dsPK.get(i).getNgayBatDau())) >= 0 && ft.format(dNow).compareTo(ft.format(dsPK.get(i).getNgayKetThuc())) <= 0) {
                        int id = dsPK.get(i).getMaPhucKhao() + 1;
                        ctpk.setId(id++);
                        ctpk.setPhuckhao(dsPK.get(i));
                        ctpk.setMssv(temp.getTenDN());
                        ctpk.setHoTen(SinhVienDAO.layThongTinSinhVien(temp.getTenDN()).getHoTen());
                        ctpk.setMonhoc(ThoiKhoaBieuDAO.layThongTinTKB(maMon));
                        ctpk.setCotDiem(cotDiem);
                        ctpk.setDiemMongMuon(Float.parseFloat(diemMM));
                        ctpk.setLyDo(lyDo);
                        ctpk.setTrangThai(0);
                        check=1;
                    } 
                }
                if(check==0) {
                        JOptionPane.showMessageDialog(rootPane, "Đã hết hạn để đăng kí phúc khảo");
                }
                if (DangKiPhucKhaoDAO.themDangKiPhucKhao(ctpk) == true) {
                    JOptionPane.showMessageDialog(rootPane, "Gửi đăng kí phúc khảo thành công");
                } else if(DangKiPhucKhaoDAO.themDangKiPhucKhao(ctpk) == false){
                    JOptionPane.showMessageDialog(rootPane, "Đăng kí phúc khảo không thành công");
                }
                
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Sinh viên không học môn này");
            }
            

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangKiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKiPhucKhao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKiPhucKhao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGui;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JComboBox<String> cbbDiem;
    private javax.swing.JComboBox<String> cbbMon;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDiemMM;
    private javax.swing.JTextField txtLyDo;
    // End of variables declaration//GEN-END:variables
}
