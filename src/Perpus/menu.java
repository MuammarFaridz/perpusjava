/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author faridz
 */
public class menu extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        mnbuku = new javax.swing.JButton();
        mnrwyt = new javax.swing.JButton();
        mnakun = new javax.swing.JButton();
        mnshift = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        editprof = new javax.swing.JButton();
        namalabel = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        print = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnbuku.setText("Buku");
        mnbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbukuActionPerformed(evt);
            }
        });

        mnrwyt.setText("Riwayat");
        mnrwyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnrwytActionPerformed(evt);
            }
        });

        mnakun.setText("Akun");
        mnakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnakunActionPerformed(evt);
            }
        });

        mnshift.setText("Shift");
        mnshift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnshiftActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        editprof.setText("Edit");
        editprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofActionPerformed(evt);
            }
        });

        namalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namalabel.setText("Nama orang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(editprof))
                    .addComponent(namalabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namalabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editprof, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        keluar.setText("Log out");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(keluar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(print)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mnrwyt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mnbuku, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mnakun, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mnshift, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(mnbuku)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mnrwyt))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(mnakun))
                    .addComponent(keluar))
                .addGap(18, 18, 18)
                .addComponent(mnshift)
                .addGap(18, 18, 18)
                .addComponent(print)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbukuActionPerformed
        // TODO add your handling code here:
        Barang a = new Barang();
        a.setVisible(true);
    }//GEN-LAST:event_mnbukuActionPerformed

    private void editprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editprofActionPerformed
        // TODO add your handling code here:
        profil a = new profil();
        String show= namalabel.getText();
        Login ar = new Login(); 
        a.unametx.setText(show);
        try{
        con = Koneksi.getKoneksi();
        pst = con.prepareStatement("SELECT nim, nama, alamat, umur, jurusan from biodata WHERE username =?");
        pst.setString(1,show);
        rs = pst.executeQuery();
        if (rs.next()){
            String nim = rs.getString("nim");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            int umur = rs.getInt("umur");
            String jurusan = rs.getString("jurusan");
            a.nimtx.setText(nim);
            a.namatx.setText(nama);
            a.alamattx.setText(alamat);
            a.umurtx.setText(String.valueOf(umur));
            a.jurusantx.setText(jurusan);
            
        }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "", "ERROR", 1);
        }
        a.setVisible(true);                
    }//GEN-LAST:event_editprofActionPerformed

    private void mnakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnakunActionPerformed
        // TODO add your handling code here:
        akun acc = new akun();
        acc.setVisible(true);
    }//GEN-LAST:event_mnakunActionPerformed

    private void mnshiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnshiftActionPerformed
        // TODO add your handling code here:
        shift s = new shift ();
        s.setVisible(true);
    }//GEN-LAST:event_mnshiftActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        Login z = new Login();
        z.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void mnrwytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnrwytActionPerformed
        // TODO add your handling code here:
        historyadmin u = new historyadmin();
        u.setVisible(true);
    }//GEN-LAST:event_mnrwytActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        print c = new print();
        c.setVisible(true);
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editprof;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton mnakun;
    private javax.swing.JButton mnbuku;
    private javax.swing.JButton mnrwyt;
    private javax.swing.JButton mnshift;
    public static javax.swing.JLabel namalabel;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
