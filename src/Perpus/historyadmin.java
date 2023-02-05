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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author faridz
 */
public class historyadmin extends javax.swing.JFrame {

    /**
     * Creates new form Barang
     */
        Koneksi koneksi = new Koneksi();

    private DefaultTableModel model;
    
    private void autonumber(){
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM history ORDER BY id_history DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String NoBarang = r.getString("id_history");
                String FK = "" +(Integer.parseInt(NoBarang) + 1);
                
                txid.setText(FK);
                
            }else{
                txid.setText("1");
            }
            r.close(); 
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error"+ e.getMessage());
        }
    }
    
    public void clear(){
        txuname.setText("");
        txbuku.setText("");
    }
    
    public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM history";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                Object[] o = new Object[5];
                o [0] = r.getString("id_history");
                o [1] = r.getString("username");
                o [2] = r.getString("judul");
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
    public historyadmin() {
        initComponents();
  //              this.setLocationRelativeTo(null);
        
        txid.setEnabled(false);
        
        model = new DefaultTableModel();
        
        data_buku.setModel(model);
        
        model.addColumn("id");
        model.addColumn("username");
        model.addColumn("buku");
        model.addColumn("tanggal pinjam");
        model.addColumn("tanggal kembali");
        
        loadData();
        autonumber();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        data_buku = new javax.swing.JTable();
        txid = new javax.swing.JTextField();
        txuname = new javax.swing.JTextField();
        txbuku = new javax.swing.JTextField();
        btn_del = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtglp = new javax.swing.JTextField();
        txtglk = new javax.swing.JTextField();
        txFind = new javax.swing.JTextField();
        btncanc1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(550, 300));

        data_buku.setModel(new javax.swing.table.DefaultTableModel(
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
        data_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_buku);

        txid.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txid.setForeground(new java.awt.Color(41, 50, 65));
        txid.setPreferredSize(new java.awt.Dimension(330, 40));

        txuname.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txuname.setForeground(new java.awt.Color(41, 50, 65));
        txuname.setPreferredSize(new java.awt.Dimension(330, 40));

        txbuku.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txbuku.setForeground(new java.awt.Color(41, 50, 65));
        txbuku.setPreferredSize(new java.awt.Dimension(330, 40));

        btn_del.setBackground(new java.awt.Color(255, 159, 28));
        btn_del.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setText("DELETE");
        btn_del.setBorder(null);
        btn_del.setPreferredSize(new java.awt.Dimension(160, 40));
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 50, 65));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID History");

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 50, 65));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 50, 65));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tanggal pinjam");

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 50, 65));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Buku");

        btn_clear.setBackground(new java.awt.Color(255, 159, 28));
        btn_clear.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("CLEAR");
        btn_clear.setBorder(null);
        btn_clear.setPreferredSize(new java.awt.Dimension(160, 40));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 50, 65));
        jLabel7.setText("Tanggal kembali");

        txtglp.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtglp.setForeground(new java.awt.Color(41, 50, 65));
        txtglp.setPreferredSize(new java.awt.Dimension(330, 40));
        txtglp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtglpActionPerformed(evt);
            }
        });

        txtglk.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txtglk.setForeground(new java.awt.Color(41, 50, 65));
        txtglk.setPreferredSize(new java.awt.Dimension(330, 40));

        txFind.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txFind.setForeground(new java.awt.Color(144, 144, 144));
        txFind.setText("Cari history disini");
        txFind.setPreferredSize(new java.awt.Dimension(330, 40));
        txFind.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txFindFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txFindFocusLost(evt);
            }
        });
        txFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txFindActionPerformed(evt);
            }
        });
        txFind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txFindKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txFindKeyTyped(evt);
            }
        });

        btncanc1.setFont(new java.awt.Font("Montserrat Light", 0, 36)); // NOI18N
        btncanc1.setText("<");
        btncanc1.setBorder(null);
        btncanc1.setBorderPainted(false);
        btncanc1.setPreferredSize(new java.awt.Dimension(50, 50));
        btncanc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanc1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 50, 65));
        jLabel9.setText("Manage History.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btncanc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(txFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtglp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtglk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncanc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(txid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(txuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(txbuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(txtglp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(txtglk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void data_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_bukuMouseClicked
        // TODO add your handling code here:
        int i = data_buku.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String id = (String)model.getValueAt(i, 0);
        txid.setText(id);
        String uname = (String)model.getValueAt(i, 1);
        txuname.setText(uname);
        String buku = (String)model.getValueAt(i, 2);
        txbuku.setText(buku);
        String tglp = (String)model.getValueAt(i, 3);
        txtglp.setText(tglp); 
        String tglk = (String)model.getValueAt(i, 4);
        txtglk.setText(tglk); 
    }//GEN-LAST:event_data_bukuMouseClicked

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        int i = data_buku.getSelectedRow();
        if(i == -1){
            return;
        }
        
        String id = (String)model.getValueAt(i, 0);
        
        int question = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(question == JOptionPane.OK_OPTION){
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "DELETE FROM history WHERE id_history = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, id);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }catch(SQLException e){
                System.out.println("Terjadi Kesalahab");
            }finally{
                loadData();
                autonumber();
                clear();
            }
        }
        if(question == JOptionPane.CANCEL_OPTION){
        }
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
        loadData();
        autonumber();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txtglpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtglpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtglpActionPerformed

    private void txFindFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txFindFocusGained
        JTextField textField = (JTextField) evt.getSource();
        textField.setText("");
        txFind.setForeground(new java.awt.Color(41, 50, 65));
    }//GEN-LAST:event_txFindFocusGained

    private void txFindFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txFindFocusLost
        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().isEmpty()) {
            textField.setText("Cari history disini");
            txFind.setForeground(new java.awt.Color(144, 144, 144));
        }
    }//GEN-LAST:event_txFindFocusLost

    private void txFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFindActionPerformed

    private void txFindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txFindKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txFindKeyPressed

    private void txFindKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txFindKeyTyped
        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("Kode Buku");
        tabel.addColumn("Judul");
        tabel.addColumn("Pengarang");
        tabel.addColumn("Penerbit");
        tabel.addColumn("Tahun");
        tabel.addColumn("Jumlah");

        try{
            Connection c = Koneksi.getKoneksi();
            String sql = "Select * from buku where judul like '%" + txFind.getText() + "%'";
            Statement stat = c.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                tabel.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                });
            }
            data_buku.setModel(tabel);
            loadData();
        }catch(Exception e){
            System.out.println("Cari Data Error");
        }finally{
        }
    }//GEN-LAST:event_txFindKeyTyped

    private void btncanc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanc1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btncanc1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
        UIManager.setLookAndFeel( new FlatLightLaf() );
    }catch( Exception ex ) {
        System.err.println( "Failed to initialize LaF" );
    }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new historyadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btncanc1;
    private javax.swing.JTable data_buku;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txFind;
    private javax.swing.JTextField txbuku;
    private javax.swing.JTextField txid;
    private javax.swing.JTextField txtglk;
    private javax.swing.JTextField txtglp;
    private javax.swing.JTextField txuname;
    // End of variables declaration//GEN-END:variables
}
