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
import javax.swing.JTextField;
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
            
            String sql = "SELECT * FROM buku WHERE jumlah > 0";
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
                o [0] = r.getString("Kode Keranjang");
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

        BG = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_buku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        unamelabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        data_keranjang = new javax.swing.JTable();
        btn_del1 = new javax.swing.JButton();
        conf_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txJml = new javax.swing.JTextField();
        txidker = new javax.swing.JTextField();
        txKode = new javax.swing.JTextField();
        tglkkrj = new javax.swing.JTextField();
        tglpkrj = new javax.swing.JTextField();
        jdlkrj = new javax.swing.JTextField();
        txJudul = new javax.swing.JTextField();
        txtrans = new javax.swing.JTextField();
        btncanc = new javax.swing.JButton();
        txFind = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1022, 600));

        BG.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 400));

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
        data_buku.setPreferredSize(new java.awt.Dimension(450, 400));
        data_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_bukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_buku);

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 50, 65));
        jLabel1.setText("Keranjang.");
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 30));

        btn_add.setBackground(new java.awt.Color(46, 196, 182));
        btn_add.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("+Keranjang");
        btn_add.setBorder(null);
        btn_add.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        unamelabel.setText("username");

        jScrollPane2.setPreferredSize(new java.awt.Dimension(450, 400));

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
        data_keranjang.setPreferredSize(new java.awt.Dimension(450, 400));
        data_keranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_keranjangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(data_keranjang);

        btn_del1.setBackground(new java.awt.Color(255, 159, 28));
        btn_del1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        btn_del1.setForeground(new java.awt.Color(255, 255, 255));
        btn_del1.setText("Buang");
        btn_del1.setBorder(null);
        btn_del1.setPreferredSize(new java.awt.Dimension(100, 40));
        btn_del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_del1ActionPerformed(evt);
            }
        });

        conf_btn.setBackground(new java.awt.Color(46, 196, 182));
        conf_btn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        conf_btn.setForeground(new java.awt.Color(255, 255, 255));
        conf_btn.setText("Simpan");
        conf_btn.setBorder(null);
        conf_btn.setPreferredSize(new java.awt.Dimension(100, 40));
        conf_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conf_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(125, 220, 211));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Kode Buku");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Judul");

        jLabel8.setText("jumlah");

        txJml.setBorder(null);

        txidker.setBorder(null);

        txKode.setBorder(null);
        txKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txKodeActionPerformed(evt);
            }
        });

        tglkkrj.setBorder(null);

        tglpkrj.setBorder(null);

        jdlkrj.setBorder(null);

        txJudul.setBorder(null);

        txtrans.setBorder(null);
        txtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtransActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jdlkrj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtrans, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txidker, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txJml, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txJudul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txKode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tglpkrj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tglkkrj, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tglpkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txJml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txidker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtrans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jdlkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglkkrj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

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

        txFind.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        txFind.setForeground(new java.awt.Color(41, 50, 65));
        txFind.setText("Cari buku disini");
        txFind.setPreferredSize(new java.awt.Dimension(290, 40));
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

        jLabel2.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 50, 65));
        jLabel2.setText("Data Buku.");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(txFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(unamelabel)
                        .addGap(3, 3, 3)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(btncanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BGLayout.createSequentialGroup()
                                .addComponent(conf_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_del1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btncanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(20, 20, 20)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(BGLayout.createSequentialGroup()
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20))
                        .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(conf_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_del1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unamelabel))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Date date = new Date();
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
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
            p.setString(3, krj);

            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
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

    private void btncancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancActionPerformed
       Usermenu a = new Usermenu();
        this.dispose();
        
    }//GEN-LAST:event_btncancActionPerformed

    private void txFindFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txFindFocusGained
        JTextField textField = (JTextField) evt.getSource();
        textField.setText("");
    }//GEN-LAST:event_txFindFocusGained

    private void txFindFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txFindFocusLost
        JTextField textField = (JTextField) evt.getSource();
        if (textField.getText().isEmpty()) {
            textField.setText("Cari buku disini");
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
    private javax.swing.JPanel BG;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del1;
    private javax.swing.JButton btncanc;
    private javax.swing.JButton conf_btn;
    private javax.swing.JTable data_buku;
    private javax.swing.JTable data_keranjang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jdlkrj;
    private javax.swing.JTextField tglkkrj;
    private javax.swing.JTextField tglpkrj;
    private javax.swing.JTextField txFind;
    private javax.swing.JTextField txJml;
    private javax.swing.JTextField txJudul;
    private javax.swing.JTextField txKode;
    private javax.swing.JTextField txidker;
    private javax.swing.JTextField txtrans;
    public static javax.swing.JLabel unamelabel;
    // End of variables declaration//GEN-END:variables
}
