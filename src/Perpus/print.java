/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Perpus;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author faridz
 */
public class print extends javax.swing.JFrame {

    /**
     * Creates new form print
     */Koneksi koneksi = new Koneksi();

    private DefaultTableModel model;
   
        public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM transaksi";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                Object[] o = new Object[5];
                o [0] = r.getString("id_transaksi");
                o [1] = r.getString("username");
                o [2] = r.getString("buku");
                o [3] = r.getString("tanggal_pinjam");
                o [4] = r.getString("tanggal_kembali");
                
                model.addRow(o);
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("terjadi kesalahan"+ e.getMessage());
        }
    }
        
    public print() {
        initComponents();
        model = new DefaultTableModel();
        
        data_trans.setModel(model);
        
        model.addColumn("Id transaksi");
        model.addColumn("username");
        model.addColumn("buku");
        model.addColumn("tanggal pinjam");
        model.addColumn("tanggal kembali");
        
        loadData();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncanc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_trans = new javax.swing.JTable();
        btnprint = new javax.swing.JButton();
        searchfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(842, 577));

        btncanc.setFont(new java.awt.Font("Montserrat Light", 0, 36)); // NOI18N
        btncanc.setText("<");
        btncanc.setBorder(null);
        btncanc.setBorderPainted(false);
        btncanc.setPreferredSize(new java.awt.Dimension(50, 50));
        btncanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 65));
        jLabel1.setText("Print History.");

        jScrollPane1.setPreferredSize(new java.awt.Dimension(712, 412));

        data_trans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        data_trans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_transMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_trans);

        btnprint.setBackground(new java.awt.Color(255, 159, 28));
        btnprint.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btnprint.setForeground(new java.awt.Color(255, 255, 255));
        btnprint.setText("Print");
        btnprint.setBorder(null);
        btnprint.setPreferredSize(new java.awt.Dimension(100, 40));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        searchfield.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        searchfield.setForeground(new java.awt.Color(144, 144, 144));
        searchfield.setText("Cari akun disini");
        searchfield.setPreferredSize(new java.awt.Dimension(330, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btncanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncanc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        // TODO add your handling code here:
        String search = searchfield.getText();        
        MessageFormat header = new MessageFormat("header");
        MessageFormat footer = new MessageFormat("footer");
        
        try{
            data_trans.print(JTable.PrintMode.NORMAL,header,footer);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        try{
            Connection c = Koneksi.getKoneksi();
            String sql = "INSERT ignore INTO history (username,judul,tanggal_pinjam,tanggal_kembali) SELECT username,buku,transaksi.tanggal_pinjam,transaksi.tanggal_kembali FROM transaksi where transaksi.username LIKE '%"+ searchfield.getText()+ "%'";
            PreparedStatement p = c.prepareStatement(sql);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan"+ e.getMessage());
        }
        try{
            Connection c = Koneksi.getKoneksi();
            String sql = "delete FROM transaksi where transaksi.username LIKE '%"+ searchfield.getText()+ "%'";
            PreparedStatement p = c.prepareStatement(sql);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Terhapus");
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan"+ e.getMessage());
        }finally{
            loadData();
        }
        
    }//GEN-LAST:event_btnprintActionPerformed

    private void data_transMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_transMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_data_transMouseClicked

    private void btncancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancActionPerformed
        Usermenu a = new Usermenu();
        this.dispose();
    }//GEN-LAST:event_btncancActionPerformed

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
                new print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncanc;
    private javax.swing.JButton btnprint;
    private javax.swing.JTable data_trans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchfield;
    // End of variables declaration//GEN-END:variables
}
