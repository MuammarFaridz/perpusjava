/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpus;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

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
        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        namalabel = new javax.swing.JLabel();
        mnbuku = new javax.swing.JButton();
        mnrwyt = new javax.swing.JButton();
        mnakun = new javax.swing.JButton();
        editprof = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        print = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setPreferredSize(new java.awt.Dimension(1250, 700));

        jPanel1.setBackground(new java.awt.Color(46, 196, 182));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 70));

        jPanel2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        namalabel.setFont(new java.awt.Font("Montserrat SemiBold", 1, 14)); // NOI18N
        namalabel.setForeground(new java.awt.Color(255, 255, 255));
        namalabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namalabel.setText("username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(namalabel)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(namalabel)
                .addGap(25, 25, 25))
        );

        mnbuku.setBackground(new java.awt.Color(255, 159, 28));
        mnbuku.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        mnbuku.setForeground(new java.awt.Color(255, 255, 255));
        mnbuku.setText("Buku");
        mnbuku.setBorder(null);
        mnbuku.setPreferredSize(new java.awt.Dimension(100, 40));
        mnbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbukuActionPerformed(evt);
            }
        });

        mnrwyt.setBackground(new java.awt.Color(255, 159, 28));
        mnrwyt.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        mnrwyt.setForeground(new java.awt.Color(255, 255, 255));
        mnrwyt.setText("Riwayat");
        mnrwyt.setBorder(null);
        mnrwyt.setPreferredSize(new java.awt.Dimension(100, 40));
        mnrwyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnrwytActionPerformed(evt);
            }
        });

        mnakun.setBackground(new java.awt.Color(255, 159, 28));
        mnakun.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        mnakun.setForeground(new java.awt.Color(255, 255, 255));
        mnakun.setText("Akun");
        mnakun.setBorder(null);
        mnakun.setPreferredSize(new java.awt.Dimension(100, 40));
        mnakun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnakunActionPerformed(evt);
            }
        });

        editprof.setBackground(new java.awt.Color(255, 159, 28));
        editprof.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        editprof.setForeground(new java.awt.Color(255, 255, 255));
        editprof.setText("Edit");
        editprof.setBorder(null);
        editprof.setPreferredSize(new java.awt.Dimension(100, 40));
        editprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editprofActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 159, 28));
        keluar.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Log out");
        keluar.setBorder(null);
        keluar.setPreferredSize(new java.awt.Dimension(100, 40));
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(255, 159, 28));
        print.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.setBorder(null);
        print.setPreferredSize(new java.awt.Dimension(100, 40));
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(mnbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(mnakun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(mnrwyt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(editprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editprof, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mnbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mnakun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mnrwyt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(578, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbukuActionPerformed
        // TODO add your handling code here:
        Barang a = new Barang();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
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
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_editprofActionPerformed

    private void mnakunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnakunActionPerformed
        // TODO add your handling code here:
        akun acc = new akun();
        acc.setVisible(true);
        acc.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnakunActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        Login z = new Login();
        z.setVisible(true);
        this.dispose();
        z.setLocationRelativeTo(null);
    }//GEN-LAST:event_keluarActionPerformed

    private void mnrwytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnrwytActionPerformed
        // TODO add your handling code here:
        historyadmin u = new historyadmin();
        u.setVisible(true);
        u.setLocationRelativeTo(null);
    }//GEN-LAST:event_mnrwytActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        print c = new print();
        c.setVisible(true);
        c.setLocationRelativeTo(null);
    }//GEN-LAST:event_printActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      try {
        UIManager.setLookAndFeel( new FlatLightLaf() );
    }catch( Exception ex ) {
        System.err.println( "Failed to initialize LaF" );
    }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton editprof;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton keluar;
    private javax.swing.JButton mnakun;
    private javax.swing.JButton mnbuku;
    private javax.swing.JButton mnrwyt;
    public static javax.swing.JLabel namalabel;
    private javax.swing.JButton print;
    // End of variables declaration//GEN-END:variables
}
