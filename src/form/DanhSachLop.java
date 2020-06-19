/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import dao.SinhVienDAO;
import dao.ThoiKhoaBieuDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pojo.Lophoc;
import pojo.Monhoc;

/**
 *
 * @author Chen-Yang
 */
public class DanhSachLop extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachLop
     */
    public DanhSachLop() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbeDSLop = new javax.swing.JTable();
        btnXem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Xem danh sách lớp");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbeDSLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbeDSLop);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 85, 470, 347));

        btnXem.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnXem.setText("Xem danh sách Lớp");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });
        getContentPane().add(btnXem, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 34, 180, 33));

        setSize(new java.awt.Dimension(512, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        
        List<Lophoc> ds = (ArrayList<Lophoc>) SinhVienDAO.layDachSachLop();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[] {
            "STT","Lớp"
        });
        
        int j=1;
        ArrayList arrRows = new ArrayList();
        for(int i=0;i<ds.size();i++) {
            Lophoc lh = ds.get(i);
                arrRows.add(j);
                j++;
                arrRows.add(lh.getTenLop());               
                
                model.addRow(arrRows.toArray());
                arrRows.clear();
            }
        tbeDSLop.setModel(model);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXemActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachLop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbeDSLop;
    // End of variables declaration//GEN-END:variables
}
