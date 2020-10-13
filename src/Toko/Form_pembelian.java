/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DBSS_050
 */
public class Form_pembelian extends javax.swing.JFrame {

    /**
     * Creates new form Form_pembelian
     */
    private DefaultTableModel model;
    public Form_pembelian() throws SQLException {
        initComponents();                
        showData();
        sort();
    }
    public DefaultTableModel saction() throws SQLException{
        DefaultTableModel tm = (DefaultTableModel) Tabel_beli.getModel();
        return tm;
    }
    
    private void sort() throws SQLException{
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(saction());
        Tabel_beli.setRowSorter(sorter);
    }
    
    public void showData(){
        Object header[]={"No_faktur","Tanggal","Id_produk","Id_supplier","Jumlah","Harga","Total"};
        model = new DefaultTableModel(null , header);
        Tabel_beli.setModel(model);
        model.setRowCount(0);
        Koneksi.Konek();
        if (Koneksi.conn != null) {
            StatusKoneksi.setText("Koneksi Sukses");
        }else{
            StatusKoneksi.setText("Koneksi Gagal");
        }
        try {
        Statement stmt = Koneksi.conn.createStatement();
        String query = "SELECT * FROM Pembelian";
        ResultSet rs = stmt.executeQuery(query);
        Object [] n = new Object[7];
            while (rs.next()) {
                n[0] = rs.getString("No_faktur");
                n[1]  = rs.getString("Tanggal");
                n[2] = rs.getString("Id_produk");
                n[3]  = rs.getString("Id_supplier");
                n[4]  = rs.getString("Jumlah");
                n[5]  = rs.getString("Harga");
                n[6]  = rs.getString("Total");
                model.addRow(n);
            }
        } catch (SQLException e ) {
            StatusKoneksi.setText("Gagal query");
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        StatusKoneksi = new javax.swing.JLabel();
        BatalQuery = new javax.swing.JButton();
        Jumlah = new javax.swing.JTextField();
        UpdateQuery = new javax.swing.JButton();
        DeleteQuery = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_beli = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Id_Barang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InsertQuery = new javax.swing.JButton();
        No_trans = new javax.swing.JTextField();
        Tanggal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Refresh = new javax.swing.JButton();
        Id_supp = new javax.swing.JTextField();
        SearchNo = new javax.swing.JButton();
        SearchNo1 = new javax.swing.JButton();
        SearchNo2 = new javax.swing.JButton();
        SearchNo3 = new javax.swing.JButton();
        SearchNo4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TUTUP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FORM PEMBELIAN");

        StatusKoneksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusKoneksi.setText("STATUS KONEKSI");

        BatalQuery.setText("BATAL");
        BatalQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalQueryActionPerformed(evt);
            }
        });

        UpdateQuery.setText("UPDATE");
        UpdateQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateQueryActionPerformed(evt);
            }
        });

        DeleteQuery.setText("DELETE");
        DeleteQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteQueryActionPerformed(evt);
            }
        });

        jLabel3.setText("Tanggal");

        Tabel_beli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No_transaksi", "Tanggal", "Id_Barang", "Id_supplier", "Jumlah", "Harga", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel_beli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_beliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_beli);

        jLabel1.setText("No_transaksi");

        jLabel2.setText("Id_Barang");

        jLabel4.setText("Jumlah");

        InsertQuery.setText("INSERT");
        InsertQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertQueryActionPerformed(evt);
            }
        });

        jLabel8.setText("Id_supplier");

        Refresh.setText("REFRESH");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        SearchNo.setText("Search");
        SearchNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNoActionPerformed(evt);
            }
        });

        SearchNo1.setText("Search");
        SearchNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNo1ActionPerformed(evt);
            }
        });

        SearchNo2.setText("Search");
        SearchNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNo2ActionPerformed(evt);
            }
        });

        SearchNo3.setText("Search");
        SearchNo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNo3ActionPerformed(evt);
            }
        });

        SearchNo4.setText("Search");
        SearchNo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNo4ActionPerformed(evt);
            }
        });

        jMenu1.setText("PENDATAAN");

        jMenuItem1.setText("Data Produk");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Data Member");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Data Supplier");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("TRANSAKSI");

        jMenuItem4.setText("Penjualan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Pembelian");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(139, 139, 139)
                .addComponent(Refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusKoneksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteQuery)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(BatalQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(InsertQuery))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Id_Barang, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(Id_supp, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(No_trans)
                                    .addComponent(Tanggal)
                                    .addComponent(Jumlah)
                                    .addComponent(UpdateQuery))))
                        .addGap(2, 2, 2)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SearchNo1)
                    .addComponent(SearchNo2)
                    .addComponent(SearchNo3)
                    .addComponent(SearchNo4))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2)
                        .addComponent(Refresh))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(No_trans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchNo1)
                            .addComponent(Id_Barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchNo2)
                            .addComponent(jLabel3)
                            .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchNo3)
                            .addComponent(Jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchNo4)
                            .addComponent(jLabel8)
                            .addComponent(Id_supp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateQuery)
                            .addComponent(InsertQuery))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteQuery)
                            .addComponent(BatalQuery))
                        .addGap(18, 18, 18)
                        .addComponent(StatusKoneksi))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Form_Home_Toko hom = new Form_Home_Toko();
        hom.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        try {
            Koneksi.Tutup();
        } catch (SQLException ex) {
            Logger.getLogger(Form_Home_Toko.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Form_produk prd = new Form_produk();
            prd.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Form_member mbr = null;
        try {
            mbr = new Form_member();
        } catch (SQLException ex) {
            Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
        mbr.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            Form_supplier supp = new Form_supplier();
            supp.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Form_penjualan p = new Form_penjualan();
            p.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Form_pembelian p = new Form_pembelian();
            p.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        Refresh();
    }//GEN-LAST:event_RefreshActionPerformed
    public void Refresh(){
        try {
            dispose();
            Form_pembelian m = new Form_pembelian();
            m.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void BatalQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalQueryActionPerformed
        setBatal();
    }//GEN-LAST:event_BatalQueryActionPerformed

    private void InsertQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertQueryActionPerformed
        try {
        int jumlah = 0 , harga = 0 , total = 0;
        jumlah = Integer.parseInt(Jumlah.getText());
        harga  = getHarga(Id_Barang.getText());
        total  = jumlah * harga;
        Koneksi.Konek();
            String Query_T = "Insert Into Pembelian values (?,?,?,?,?,?,?)";
            PreparedStatement ps = Koneksi.conn.prepareStatement(Query_T);
            ps.setString(1,Id_Barang.getText());
            ps.setString(2,No_trans.getText());
            ps.setString(3,Id_supp.getText());
            ps.setString(4,Tanggal.getText());
            ps.setString(5,Jumlah.getText());
            ps.setString(6,String.valueOf(harga));
            ps.setString(7,String.valueOf(total));
            ps.executeUpdate();
            
            Statement stmt = Koneksi.conn.createStatement();
            String Query_Select_prod = "Select * FROM Produk where Id_produk = "+Id_Barang.getText();   
            ResultSet rs = stmt.executeQuery(Query_Select_prod);
            Object [] n = new Object[1];
            while (rs.next()) {
                n[0] = rs.getString("Stok");
            }
            int stok  = Integer.parseInt(n[0].toString());
                stok += Integer.parseInt(Jumlah.getText());
            
            Koneksi.Konek();
            String QueryUPDET     = "Update Produk set Stok=? where Id_produk = ?";   
            PreparedStatement ps2 = Koneksi.conn.prepareStatement(QueryUPDET);
            ps2.setString(1,String.valueOf(stok));
            ps2.setString(2,Id_Barang.getText());
            ps2.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Insert Succsessfully");   
            Refresh();
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Insert Fail");
        }
    }//GEN-LAST:event_InsertQueryActionPerformed

    private void SearchNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNoActionPerformed
        showSearchData("No_faktur", No_trans.getText());
    }//GEN-LAST:event_SearchNoActionPerformed

    private void SearchNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNo1ActionPerformed
        showSearchData("Id_produk", Id_Barang.getText());
    }//GEN-LAST:event_SearchNo1ActionPerformed

    private void SearchNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNo2ActionPerformed
        showSearchData("Tanggal", Tanggal.getText());
    }//GEN-LAST:event_SearchNo2ActionPerformed

    private void SearchNo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNo3ActionPerformed
        showSearchData("Jumlah", Jumlah.getText());
    }//GEN-LAST:event_SearchNo3ActionPerformed

    private void SearchNo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNo4ActionPerformed
        showSearchData("Id_supplier", Id_supp.getText());
    }//GEN-LAST:event_SearchNo4ActionPerformed

    private void UpdateQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQueryActionPerformed
        try {
            String No_trans = this.No_trans.getText();
            Koneksi.Konek();
            String Query_T = "Update Pembelian set No_faktur = ?,Id_produk = ?,Tanggal = ?,Jumlah=?,Id_supplier=? where No_faktur = ?;";   
            PreparedStatement ps = Koneksi.conn.prepareStatement(Query_T);
            ps.setString(1,this.No_trans.getText());
            ps.setString(2,Id_Barang.getText());
            ps.setString(3,Tanggal.getText());
            ps.setString(4,Jumlah.getText());
            ps.setString(5,Id_supp.getText());
            ps.setString(6,No_trans);
            ps.executeUpdate();
            DefaultTableModel tM = (DefaultTableModel) Tabel_beli.getModel();
            JOptionPane.showMessageDialog(null,"Update Succsessfully");
            tM.setRowCount(0);            
            Refresh();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Update Failed\n Eror : "+ex);
        }
    }//GEN-LAST:event_UpdateQueryActionPerformed

    private void DeleteQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteQueryActionPerformed
        String query = "DELETE FROM Pembelian WHERE No_faktur = '" + No_trans.getText() +"';";
        try {
            PreparedStatement stmt = Koneksi.conn.prepareStatement(query);
            if (stmt.execute()) {
                JOptionPane.showMessageDialog(null,"Delete Failed");
            }else{
                JOptionPane.showMessageDialog(null,"Delete Success");
                Refresh();
            }
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Delete Failed\n Eror : "+e);
        }
    }//GEN-LAST:event_DeleteQueryActionPerformed

    private void Tabel_beliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_beliMouseClicked
        int baris = Tabel_beli.getSelectedRow();
        No_trans.setText(Tabel_beli.getValueAt(baris, 0).toString());
        Id_Barang.setText( Tabel_beli.getValueAt(baris, 2).toString());
        Tanggal.setText(Tabel_beli.getValueAt(baris, 1).toString());
        Jumlah.setText(Tabel_beli.getValueAt(baris, 4).toString());
        Id_supp.setText(Tabel_beli.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_Tabel_beliMouseClicked
    public void showSearchData(String kolom , String param){
        try {
            model.setRowCount(0);
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Pembelian WHERE "+ kolom+"='"+param+"';";
            ResultSet rs = stmt.executeQuery(query);
            Object [] n = new Object[7];
            while (rs.next()) {
                n[0]  = rs.getString("No_faktur");
                n[1]  = rs.getString("Tanggal");
                n[2]  = rs.getString("Id_produk");
                n[3]  = rs.getString("Id_supplier");
                n[4]  = rs.getString("Jumlah");
                n[5]  = rs.getString("Harga");
                n[6]  = rs.getString("Total");
                model.addRow(n);
            }
                    
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }    
    }
    
    public void setBatal(){
        No_trans.setText("");
        Id_Barang.setText("");
        Tanggal.setText("");
        Jumlah.setText("");   
        Id_supp.setText("");   
    }
    public int getHarga(String IdProd){
        int harga = 0;
        try {
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Produk Where Id_produk = '"+IdProd+"';";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                harga = Integer.parseInt(rs.getString("Harga"));
            }
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Data salah");
        }
        return harga;
    }
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
            java.util.logging.Logger.getLogger(Form_pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form_pembelian().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Form_pembelian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalQuery;
    private javax.swing.JButton DeleteQuery;
    private javax.swing.JTextField Id_Barang;
    private javax.swing.JTextField Id_supp;
    private javax.swing.JButton InsertQuery;
    private javax.swing.JTextField Jumlah;
    private javax.swing.JTextField No_trans;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SearchNo;
    private javax.swing.JButton SearchNo1;
    private javax.swing.JButton SearchNo2;
    private javax.swing.JButton SearchNo3;
    private javax.swing.JButton SearchNo4;
    private javax.swing.JLabel StatusKoneksi;
    private javax.swing.JTable Tabel_beli;
    private javax.swing.JTextField Tanggal;
    private javax.swing.JButton UpdateQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

