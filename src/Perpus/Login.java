/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpus;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author faridz
 */
public class Login extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
//        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        BG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxUname = new javax.swing.JTextField();
        TxPwd = new javax.swing.JPasswordField();
        optionbox = new javax.swing.JComboBox<>();
        tbllogin = new javax.swing.JButton();
        tblreg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Image = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1200, 700));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setMaximumSize(new java.awt.Dimension(700, 32767));
        BG.setPreferredSize(new java.awt.Dimension(450, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 65));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 50, 65));
        jLabel3.setText("Password");

        TxUname.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        TxUname.setForeground(new java.awt.Color(41, 50, 65));
        TxUname.setMinimumSize(new java.awt.Dimension(340, 30));
        TxUname.setPreferredSize(new java.awt.Dimension(340, 40));
        TxUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxUnameActionPerformed(evt);
            }
        });

        TxPwd.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        TxPwd.setForeground(new java.awt.Color(41, 50, 65));
        TxPwd.setMinimumSize(new java.awt.Dimension(340, 30));
        TxPwd.setPreferredSize(new java.awt.Dimension(340, 40));
        TxPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxPwdActionPerformed(evt);
            }
        });

        optionbox.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        optionbox.setForeground(new java.awt.Color(41, 50, 65));
        optionbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "User" }));
        optionbox.setMinimumSize(new java.awt.Dimension(340, 30));
        optionbox.setPreferredSize(new java.awt.Dimension(340, 40));
        optionbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionboxActionPerformed(evt);
            }
        });

        tbllogin.setBackground(new java.awt.Color(46, 196, 182));
        tbllogin.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        tbllogin.setForeground(new java.awt.Color(255, 255, 255));
        tbllogin.setText("Login");
        tbllogin.setBorder(null);
        tbllogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbllogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblloginActionPerformed(evt);
            }
        });

        tblreg.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        tblreg.setForeground(new java.awt.Color(41, 50, 65));
        tblreg.setText("Register");
        tblreg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(125, 220, 211), 2));
        tblreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblregActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(41, 50, 65));
        jLabel4.setText("or");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 50, 65));
        jLabel5.setText("Otoritas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tblreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbllogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(optionbox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxUname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(TxUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(optionbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addComponent(TxPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tbllogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tblreg, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jLabel7.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 50, 65));
        jLabel7.setText("Login.");

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 50, 65));
        jLabel6.setText("Login menggunakan data yang anda");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 50, 65));
        jLabel8.setText("masukkan pada laman registrasi.");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        Image.setBackground(new java.awt.Color(255, 255, 255));
        Image.setPreferredSize(new java.awt.Dimension(800, 700));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bgimg.jpg"))); // NOI18N
        jLabel1.setText("??? ");
        jLabel1.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 1200));

        javax.swing.GroupLayout ImageLayout = new javax.swing.GroupLayout(Image);
        Image.setLayout(ImageLayout);
        ImageLayout.setHorizontalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImageLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(255, 255, 255))
        );
        ImageLayout.setVerticalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TxUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxUnameActionPerformed

    private void tblloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblloginActionPerformed
        // TODO add your handling code here:
        String uname = TxUname.getText();
        String pwd = TxPwd.getText();
        String option = optionbox.getSelectedItem().toString();
        profil p = new profil();
        if (uname.equals("")||pwd.equals("")||option.equals("SELECT")){
            JOptionPane.showMessageDialog(rootPane, "Beberapa kolom masih kosong", "Error", 1);
        }else{
            try{
                con = Koneksi.getKoneksi();
                pst = con.prepareStatement("select * from akun where username =? and password =?");
                pst.setString(1,uname);
                pst.setString(2,pwd);
                rs = pst.executeQuery();
                
                
                if(rs.next()){
                    String s1 = rs.getString("otoritas");
                   String un = rs.getString("username");
                   if(option.equalsIgnoreCase("Admin")&& s1.equalsIgnoreCase("Admin")){
                       menu ad = new menu();
                       ad.setVisible(true);                       
                       ad.namalabel.setText(uname);                     
                       this.dispose();
                       ad.setLocationRelativeTo(null);

                   }
                   if (option.equalsIgnoreCase("User")&& s1.equalsIgnoreCase("User")){
                       Usermenu um = new Usermenu();
                       um.userlabel.setText(uname);
                       um.setVisible(true);
                       this.dispose();
                       um.setLocationRelativeTo(null);
                   }
                   if (option.equalsIgnoreCase("Admin")&& s1.equalsIgnoreCase("User")){
                       JOptionPane.showMessageDialog(null, "Username, Password, atau Otoritas masih salah", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                   if (option.equalsIgnoreCase("User")&& s1.equalsIgnoreCase("Admin")){
                       JOptionPane.showMessageDialog(null, "Username, Password, atau Otoritas masih salah", "Error", JOptionPane.ERROR_MESSAGE);

                   }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Username atau password anda salah", "Error", 1);
                }
            }catch(Exception e){
                System.out.println("lala"+e.getMessage());
            }
        }

    }//GEN-LAST:event_tblloginActionPerformed

    private void tblregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblregActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Register a = new Register();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_tblregActionPerformed

    private void optionboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionboxActionPerformed

    private void TxPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxPwdActionPerformed

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
                new Login().setVisible(true);
            }
        
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JPanel Image;
    public static javax.swing.JPasswordField TxPwd;
    public static javax.swing.JTextField TxUname;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> optionbox;
    private javax.swing.JButton tbllogin;
    private javax.swing.JButton tblreg;
    // End of variables declaration//GEN-END:variables

    private String TxUname() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
