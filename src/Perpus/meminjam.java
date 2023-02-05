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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date; 
import javax.swing.UIManager;
/**
 *
 * @author faridz
 */
public class meminjam extends javax.swing.JFrame {

    /**
     * Creates new form Barang
     */
        Koneksi koneksi = new Koneksi();

    private DefaultTableModel model;
    private DefaultTableModel model1;
    
    /*private void autohistory(){
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM history ORDER BY id_history DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String NoBarang = r.getString("id_history");
                String FK = "" +(Integer.parseInt(NoBarang) + 1);
                
                txtrans.setText(FK);
                
            }else{
                txtrans.setText("1");
            }
            r.close(); 
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error"+ e.getMessage());
        }
    }*/
    
    private void autonumber(){
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM buku ORDER BY kode_buku DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String NoBarang = r.getString("kode_buku").substring(2);
                String SC = "" + (Integer.parseInt(NoBarang) + 1);
                String Nol = "";
                
                if(SC.length()==1){
                    Nol = "00";
                }else if(SC.length()==2){
                    Nol = "0";
                }else if(SC.length()==3){
                    Nol = "";
                }
                
                txKode.setText("SC" + Nol + SC);
                
            }else{
                txKode.setText("SC001");
            }
            r.close(); 
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error"+ e.getMessage());
        }
    }
    
    private void autokeranjang()
    {
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM keranjang1 ORDER BY id_keranjang DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String NoBarang = r.getString("id_keranjang").substring(2);
                String KR = "" + (Integer.parseInt(NoBarang) + 1);
                String Nol = "";
                
                if(KR.length()==1){
                    Nol = "00";
                }else if(KR.length()==2){
                    Nol = "0";
                }else if(KR.length()==3){
                    Nol = "";
                }
                
                txidker.setText("KR" + Nol + KR);
                
            }else{
                txidker.setText("KR001");
            }
            r.close(); 
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error"+ e.getMessage());
        }
    }
    
    private void autotrans()
    {
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM transaksi ORDER BY id_transaksi DESC";
            ResultSet r = s.executeQuery(sql);
            if (r.next()){
                String NoBarang = r.getString("id_transaksi").substring(2);
                String KR = "" + (Integer.parseInt(NoBarang) + 1);
                String Nol = "";
                
                if(KR.length()==1){
                    Nol = "00";
                }else if(KR.length()==2){
                    Nol = "0";
                }else if(KR.length()==3){
                    Nol = "";
                }
                
                txtrans.setText("TR" + Nol + KR);
                
            }else{
                txtrans.setText("TR001");
            }
            r.close(); 
            s.close();
        }catch(Exception e){
            System.out.println("autonumber error"+ e.getMessage());
        }
    }
    
    public void clear(){
        txJudul.setText("");
        txJml.setText("");
    }
    
    public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();
            
            String sql = "SELECT * FROM buku";
            ResultSet r = s.executeQuery(sql);
            
            while(r.next()){
                Object[] o = new Object[6];
                o [0] = r.getString("kode_buku");
                o [1] = r.getString("judul");
                o [2] = r.getString("pengarang");
                o [3] = r.getString("penerbit");
                o [4] = r.getString("tahun");
                o [5] = r.getString("jumlah");
                
                model.addRow(o);
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("terjadi kesalahan"+ e.getMessage());
        }
    }
    
    public void loadkeranjang()
    {

        model1.getDataVector().removeAllElements();
        model1.fireTableDataChanged();
        String label = unamelabel.getText();
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement();          
            String sql = "SELECT * from keranjang1";
            ResultSet r = s.executeQuery(sql);
           
            while(r.next()){
                
                Object[] o = new Object[4];
                o [0] = r.getString("id_keranjang");
                o [1] = r.getString("judul");
                o [2] = r.getString("tanggal_pinjam");
                o [3] = r.getString("tanggal_kembali");

                
                
                model1.addRow(o);
            }
            r.close();
            s.close();
        }catch(SQLException e){
            System.out.println("terjadi kesalahan"+ e.getMessage());
        }
    }
    
    public meminjam() {
        initComponents();
  //              this.setLocationRelativeTo(null);
       jdlkrj.setVisible(false);
       tglpkrj.setVisible(false);
       tglkkrj.setVisible(false);
        txKode.setEnabled(false);
        txtrans.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel8.setVisible(false);
        txKode.setVisible(false);
        txJudul.setVisible(false);
        txJml.setVisible(false);
        txidker.setVisible(false);
        unamelabel.setVisible(false);
        
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        
        data_buku.setModel(model);
        data_keranjang.setModel(model1);
        
        model.addColumn("Kode buku");
        model.addColumn("judul");
        model.addColumn("pengarang");
        model.addColumn("penerbit");
        model.addColumn("tahun");
        model.addColumn("jumlah");        
        loadData();
        autonumber();
        
        model1.addColumn("id_keranjang");
        model1.addColumn("judul");
        model1.addColumn("tanggal pinjam");
        model1.addColumn("tanggal kembali");
        loadkeranjang();
        autokeranjang();
        autotrans();
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
        data_buku = new javax.swing.JTable();
        txKode = new javax.swing.JTextField();
        txJudul = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txJml = new javax.swing.JTextField();
        unamelabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        data_keranjang = new javax.swing.JTable();
        txidker = new javax.swing.JTextField();
        btn_add1 = new javax.swing.JButton();
        jdlkrj = new javax.swing.JTextField();
        tglpkrj = new javax.swing.JTextField();
        tglkkrj = new javax.swing.JTextField();
        btn_del1 = new javax.swing.JButton();
        conf_btn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        txtrans = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        txKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txKodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DATA BUKU");

        btn_add.setText("ADD To Cart");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kode Buku");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Judul");

        jLabel8.setText("jumlah");

        unamelabel.setText("username");

        data_keranjang.setModel(new javax.swing.table.DefaultTableModel(
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
        data_keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_keranjangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(data_keranjang);

        btn_add1.setText("ADD Date");
        btn_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add1ActionPerformed(evt);
            }
        });

        btn_del1.setText("DELETE From Cart");
        btn_del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_del1ActionPerformed(evt);
            }
        });

        conf_btn.setText("CONFIRM");
        conf_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conf_btnActionPerformed(evt);
            }
        });

        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        txtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn)
                .addGap(44, 44, 44)
                .addComponent(unamelabel)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(382, 809, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(btn_add)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txJml, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txKode, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txidker, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrans, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdlkrj, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglpkrj, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglkkrj, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_add1)
                                    .addComponent(btn_del1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(conf_btn)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(unamelabel))
                                .addComponent(backbtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_add)
                                    .addGap(36, 36, 36))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(btn_add1)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_del1)
                                    .addGap(0, 122, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(txJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(txidker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jdlkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tglpkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tglkkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conf_btn))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void data_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_bukuMouseClicked
        // TODO add your handling code here:

        int i = data_buku.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String kod_b = (String)model.getValueAt(i, 0);
        txKode.setText(kod_b);
        String jdl = (String)model.getValueAt(i, 1);
        txJudul.setText(jdl);
        String jml = (String)model.getValueAt(i, 5);
        txJml.setText(jml);
    }//GEN-LAST:event_data_bukuMouseClicked

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String kod_b = txKode.getText();
        String jdl = txJudul.getText();
        String krj = txidker.getText();
            try {
            Connection c = Koneksi.getKoneksi();
            String sql = "UPDATE buku SET jumlah = jumlah -1 WHERE kode_buku = ?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, kod_b);           
            p.executeUpdate();
            p.close();
            }catch (Exception e){
              System.out.println("Terjadi Kesalahan"+ e.getMessage());  
            }finally{
            loadData();
            autonumber();
            autokeranjang();
            loadkeranjang();
            clear();            
        }
                try{
            Connection c = Koneksi.getKoneksi();
            String sql = "INSERT IGNORE INTO keranjang1 values (?,?,'000-00-00','0000-00-00')";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, krj);
            p.setString(2, jdl);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            DefaultTableModel model = (DefaultTableModel)data_keranjang.getModel();
            model.setRowCount(0);
            
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan"+ e.getMessage());
        }finally{
            loadData();
            autonumber();
            autokeranjang();
            loadkeranjang();
            clear();            
        }

    }//GEN-LAST:event_btn_addActionPerformed

    private void txKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txKodeActionPerformed

    private void btn_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add1ActionPerformed
        // TODO add your handling code here:
        String id = txidker.getText();
        Date date = new Date();
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
               try{
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.DAY_OF_WEEK,7);
            String strDate= formatter.format(cal.getTime());
            String datenow = formatter.format(date);
            Connection c = Koneksi.getKoneksi();
            String sql = "UPDATE keranjang1 SET tanggal_pinjam = ? , tanggal_kembali = ?  WHERE id_keranjang = ?";
            PreparedStatement p = c.prepareStatement(sql);
             
            p.setString(1, datenow);
            p.setString(2, strDate);
            p.setString(3, id);

            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan"+ e.getMessage());
        }finally{
            loadkeranjang();
            autokeranjang();
            clear();
        }
    }//GEN-LAST:event_btn_add1ActionPerformed

    private void data_keranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_keranjangMouseClicked
        // TODO add your handling code here:
        int i = data_keranjang.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String krj = (String)model1.getValueAt(i, 0);
        txidker.setText(krj);
        String jdl = (String)model1.getValueAt(i, 1);
        jdlkrj.setText(jdl);
        String tglp = (String)model1.getValueAt(i, 2);
        tglpkrj.setText(tglp);
        String tglk = (String)model1.getValueAt(i, 3);
        tglkkrj.setText(tglk);
        
    }//GEN-LAST:event_data_keranjangMouseClicked

    private void btn_del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_del1ActionPerformed
        // TODO add your handling code here:
        int i = data_keranjang.getSelectedRow();
        if(i == -1){
            return;
        }
        
        String krj = (String)model1.getValueAt(i, 0);
        String jdl = (String)model1.getValueAt(i, 1);
        
        int question = JOptionPane.showConfirmDialog(null, "Yakin Data Akan Dihapus?","Konfirmasi", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if(question == JOptionPane.OK_OPTION){
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "DELETE FROM keranjang1 WHERE id_keranjang = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, krj);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }catch(SQLException e){
                System.out.println("Terjadi Kesalahab");
            }finally{
                loadkeranjang();
                autonumber();
                clear();
            }
            try{
                Connection c = Koneksi.getKoneksi();
                String sql = "UPDATE buku SET jumlah = jumlah +1 WHERE judul = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, jdl);
                p.executeUpdate();
                p.close();
                
            }catch(SQLException e){
                System.out.println("Terjadi Kesalahab");
            }finally{
                autokeranjang();
                loadData();
                autonumber();
                clear();
            }
        }
        if(question == JOptionPane.CANCEL_OPTION){
        }
    }//GEN-LAST:event_btn_del1ActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        Usermenu a = new Usermenu();
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void conf_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conf_btnActionPerformed
        // TODO add your handling code here:
        String trans = txtrans.getText();
        String user = unamelabel.getText();
        String jdl = jdlkrj.getText();
        String krj = txidker.getText();
        String tglp = tglpkrj.getText();
        String tglk = tglkkrj.getText();
        try{
            Connection c = Koneksi.getKoneksi();
            String sql = "INSERT IGNORE INTO transaksi values (?,?,?,?,?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, trans);
            p.setString(2, user);
            p.setString(3, jdl);
            p.setString(4, tglp);
            p.setString(5, tglk);
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
            DefaultTableModel model = (DefaultTableModel)data_keranjang.getModel();
            model.setRowCount(0);
            
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan"+ e.getMessage());
        }finally{
            loadData();
            autonumber();
            autokeranjang();
            loadkeranjang();
            clear();   
            autotrans();
        }
        try{
                Connection c = Koneksi.getKoneksi();
                String sql = "DELETE FROM keranjang1 WHERE id_keranjang = ?";
                PreparedStatement p = c.prepareStatement(sql);
                p.setString(1, krj);
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }catch(SQLException e){
                System.out.println("Terjadi Kesalahab");
            }finally{
            loadData();
            autonumber();
            autokeranjang();
            loadkeranjang();
            clear();   
            autotrans();
            }
    }//GEN-LAST:event_conf_btnActionPerformed

    private void txtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtransActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtransActionPerformed

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
                new meminjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_add1;
    private javax.swing.JButton btn_del1;
    private javax.swing.JButton conf_btn;
    private javax.swing.JTable data_buku;
    private javax.swing.JTable data_keranjang;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jdlkrj;
    private javax.swing.JTextField tglkkrj;
    private javax.swing.JTextField tglpkrj;
    private javax.swing.JTextField txJml;
    private javax.swing.JTextField txJudul;
    private javax.swing.JTextField txKode;
    private javax.swing.JTextField txidker;
    private javax.swing.JTextField txtrans;
    public static javax.swing.JLabel unamelabel;
    // End of variables declaration//GEN-END:variables
}
