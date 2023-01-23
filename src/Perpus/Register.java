/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author faridz
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        TxId.setVisible(false);
        jLabel5.setVisible(false);
        autonumber();
    }
    private void autonumber(){
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM akun ORDER BY id DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()) {
                String NoID = r.getString("id").substring(2);
                String ID = "" +(Integer.parseInt(NoID)+1);
                String Zero = "";
                
                if (ID.length()==1) 
                {Zero = "00";}
                else if(ID.length()==2)
                {Zero = "0";}
                else if(ID.length()==3)
                {Zero = "";}
                
                TxId.setText("FK" + Zero + ID);
            }else{
                TxId.setText("FK001");
            }
            r.close();
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxUname = new javax.swing.JTextField();
        TxPwd = new javax.swing.JTextField();
        btnreg = new javax.swing.JButton();
        btncanc = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TxCon = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Txnama = new javax.swing.JTextField();
        txalamat = new javax.swing.JTextField();
        txnim = new javax.swing.JTextField();
        txumur = new javax.swing.JTextField();
        txjurusan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LOGIN");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        TxUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxUnameActionPerformed(evt);
            }
        });

        TxPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPwdActionPerformed(evt);
            }
        });

        btnreg.setText("Register");
        btnreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregActionPerformed(evt);
            }
        });

        btncanc.setText("Batal");
        btncanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancActionPerformed(evt);
            }
        });

        jLabel4.setText("Confirm");

        TxCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxConActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        TxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxIdActionPerformed(evt);
            }
        });

        jLabel6.setText("Nama");

        jLabel7.setText("NIM");

        jLabel8.setText("Alamat");

        jLabel9.setText("Umur");

        jLabel10.setText("Jurusan");

        Txnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxnamaActionPerformed(evt);
            }
        });

        txalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txalamatActionPerformed(evt);
            }
        });

        txnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnimActionPerformed(evt);
            }
        });

        txumur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txumurActionPerformed(evt);
            }
        });

        txjurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txjurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnreg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncanc)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)
                        .addComponent(txjurusan))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(42, 42, 42)
                        .addComponent(txumur))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34)
                        .addComponent(txalamat))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(48, 48, 48)
                        .addComponent(txnim))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(40, 40, 40)
                        .addComponent(Txnama))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                            .addComponent(TxUname)
                            .addComponent(TxCon)
                            .addComponent(TxId, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Txnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txumur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txjurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreg, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncanc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxUnameActionPerformed

    private void TxPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPwdActionPerformed

    private void btnregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregActionPerformed
        // TODO add your handling code here:
        String id = TxId.getText().toString().trim();
        String username = TxUname.getText().toString().trim();
        String password = TxPwd.getText().toString().trim();
        String conPassword = TxCon.getText().toString().trim();
        String nama = Txnama.getText().toString().trim();
        String nim = txnim.getText().toString().trim();
        String alamat = txalamat.getText().toString().trim();
        String umur = txumur.getText().toString().trim();
        String jurusan = txjurusan.getText().toString().trim();
        String otoritas = "User";
        
        if (!password.equals(conPassword)){
            JOptionPane.showMessageDialog(null, "Password tidak sama");
        }else if (password.equals("") || username.equals("")){
            JOptionPane.showMessageDialog(null, "Password atau Username masih kosong");
        }else{
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "INSERT INTO akun VALUES (?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id);
                p.setString(2, username);
                p.setString(3, password);
                p.setString(4, otoritas);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Create Account Successfully");
            }catch(SQLException e){
                System.out.println("Error" + e.getMessage());
            }finally{
                this.dispose();
                Login a = new Login();
                a.setVisible(true);
            }
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "INSERT INTO biodata VALUES (?,?,?,?,?,?)";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, nim);
                p.setString(2, username);
                p.setString(3, nama);
                p.setString(4, alamat);
                p.setString(5, umur);
                p.setString(6, jurusan);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Create Account Successfully");
            }catch(SQLException e){
                System.out.println("Error" + e.getMessage());
            }finally{
                this.dispose();
                Login a = new Login();
                a.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnregActionPerformed

    private void btncancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_btncancActionPerformed

    private void TxConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxConActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxConActionPerformed

    private void TxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxIdActionPerformed

    private void TxnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxnamaActionPerformed

    private void txalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txalamatActionPerformed

    private void txnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnimActionPerformed

    private void txumurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txumurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txumurActionPerformed

    private void txjurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txjurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txjurusanActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxCon;
    private javax.swing.JTextField TxId;
    private javax.swing.JTextField TxPwd;
    private javax.swing.JTextField TxUname;
    private javax.swing.JTextField Txnama;
    private javax.swing.JButton btncanc;
    private javax.swing.JButton btnreg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txalamat;
    private javax.swing.JTextField txjurusan;
    private javax.swing.JTextField txnim;
    private javax.swing.JTextField txumur;
    // End of variables declaration//GEN-END:variables
}
