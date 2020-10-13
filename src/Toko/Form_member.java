/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author DBSS_050
 */
public class Form_member extends javax.swing.JFrame {

    /**
     * Creates new form Form_member
     */
    private DefaultTableModel model;
    public Form_member() throws SQLException {
        initComponents();
        showData();
        sort();
    }
    
    public DefaultTableModel saction() throws SQLException{
        DefaultTableModel tm = (DefaultTableModel) Tabel_member.getModel();
        return tm;
    }
    
    private void sort() throws SQLException{
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(saction());
        Tabel_member.setRowSorter(sorter);
    }

    public void showData(){
        Object header[]={"Id_Member","Nama","No_KTP","No_hp"};
        model = new DefaultTableModel(null , header);
        Tabel_member.setModel(model);
        model.setRowCount(0);
        Koneksi.Konek();
        if (Koneksi.conn != null) {
            StatusKoneksi.setText("Koneksi Sukses");
        }else{
            StatusKoneksi.setText("Koneksi Gagal");
        }
            try {
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Member";
            ResultSet rs = stmt.executeQuery(query);
            Object [] n = new Object[4];
            while (rs.next()) {
                n[0] = rs.getString("Id_Member");
                n[1]  = rs.getString("Nama");
                n[2] = rs.getString("No_Ktp");
                n[3]  = rs.getString("No_Telepon");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_member = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Id_member = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        No_KTP = new javax.swing.JTextField();
        No_hp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InsertQuery = new javax.swing.JButton();
        UpdateQuery = new javax.swing.JButton();
        DeleteQuery = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Tutup = new javax.swing.JButton();
        StatusKoneksi = new javax.swing.JLabel();
        BatalQuery = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        SearchId = new javax.swing.JButton();
        SearchNama = new javax.swing.JButton();
        SearchHp = new javax.swing.JButton();
        SearchKTP = new javax.swing.JButton();
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

        Tabel_member.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabel_member.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id_member", "Nama", "No_KTP", "No_hp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Tabel_member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel_memberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel_member);

        jLabel1.setText("Id_member");

        jLabel2.setText("Nama");

        jLabel3.setText("No_KTP");

        jLabel4.setText("No_hp");

        InsertQuery.setText("INSERT");
        InsertQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertQueryActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setText("FORM MEMBER");

        Home.setText("HOME");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Tutup.setText("TUTUP");
        Tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TutupActionPerformed(evt);
            }
        });

        StatusKoneksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StatusKoneksi.setText("STATUS KONEKSI");

        BatalQuery.setText("BATAL");
        BatalQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalQueryActionPerformed(evt);
            }
        });

        Refresh.setText("REFRESH");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        SearchId.setText("Search");
        SearchId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchIdActionPerformed(evt);
            }
        });

        SearchNama.setText("Search");
        SearchNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNamaActionPerformed(evt);
            }
        });

        SearchHp.setText("Search");
        SearchHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchHpActionPerformed(evt);
            }
        });

        SearchKTP.setText("Search");
        SearchKTP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchKTPActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(InsertQuery)
                                    .addComponent(DeleteQuery)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Id_member, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No_hp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(No_KTP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UpdateQuery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BatalQuery, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SearchId, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SearchNama)
                                    .addComponent(SearchHp)
                                    .addComponent(SearchKTP)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(StatusKoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(Home))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                        .addComponent(Refresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tutup))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addComponent(Home)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Tutup)
                        .addComponent(Refresh)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchId)
                            .addComponent(Id_member, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(No_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchHp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SearchKTP)
                            .addComponent(No_KTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(InsertQuery)
                            .addComponent(UpdateQuery))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteQuery)
                            .addComponent(BatalQuery))
                        .addGap(18, 18, 18)
                        .addComponent(StatusKoneksi, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 97, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        Form_Home_Toko hom = new Form_Home_Toko();
        hom.setVisible(true);
        dispose();
    }//GEN-LAST:event_HomeActionPerformed

    private void TutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TutupActionPerformed
        dispose();
        try {
            Koneksi.Tutup();
        } catch (SQLException ex) {
            Logger.getLogger(Form_Home_Toko.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TutupActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            Form_produk prd = new Form_produk();
            prd.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Form_member mbr = null;
        try {
            mbr = new Form_member();
        } catch (SQLException ex) {
            Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            Form_penjualan p = new Form_penjualan();
            p.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        try {
            Form_pembelian p = new Form_pembelian();
            p.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void Tabel_memberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel_memberMouseClicked
        int baris = Tabel_member.getSelectedRow();
        Id_member.setText( Tabel_member.getValueAt(baris, 0).toString());
        Nama.setText(Tabel_member.getValueAt(baris, 1).toString());
        No_KTP.setText(Tabel_member.getValueAt(baris, 2).toString());
        No_hp.setText(Tabel_member.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_Tabel_memberMouseClicked

    private void InsertQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertQueryActionPerformed
        try {
        Koneksi.Konek();
        String Query_T = "Insert Into Member values (?,?,?,?)";
            PreparedStatement ps = Koneksi.conn.prepareStatement(Query_T);
            ps.setString(1,Nama.getText());
            ps.setString(2,Id_member.getText());
            ps.setString(3,No_hp.getText());
            ps.setString(4,No_KTP.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Insert Succsessfully");   
            //After query
            Refresh();
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Insert Fail");
        }
    }//GEN-LAST:event_InsertQueryActionPerformed

    private void UpdateQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateQueryActionPerformed
        try {
            String Id_mem = Id_member.getText();
            Koneksi.Konek();
            String Query_T = "Update Member set Id_Member = ?,Nama = ?,No_Telepon = ?,No_Ktp=? where Id_Member = ?";   
            PreparedStatement ps = Koneksi.conn.prepareStatement(Query_T);
            ps.setString(1,Id_member.getText());
            ps.setString(2,Nama.getText());
            ps.setString(3,No_hp.getText());
            ps.setString(4,No_KTP.getText());
            ps.setString(5,Id_mem);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update Succsessfully");
            //After query
            Refresh();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Update Failed\n Eror : "+ex);
        }
    }//GEN-LAST:event_UpdateQueryActionPerformed

    private void BatalQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalQueryActionPerformed
        setBatal();
    }//GEN-LAST:event_BatalQueryActionPerformed
    public void setBatal(){
            Id_member.setText("");
            Nama.setText("");
            No_KTP.setText("");
            No_hp.setText("");

    }
    private void DeleteQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteQueryActionPerformed
        String query = "DELETE FROM Member WHERE Id_Member = '" + Id_member.getText() +"';";
        try {
            PreparedStatement stmt = Koneksi.conn.prepareStatement(query);
            if (stmt.execute()) {
                JOptionPane.showMessageDialog(null,"Delete Fail");
            }else{
                JOptionPane.showMessageDialog(null,"Delete Succes");
                //After query
                Refresh();
            }
        } catch (SQLException e ) {
            JOptionPane.showMessageDialog(null,"Delete Fail");
        }
    }//GEN-LAST:event_DeleteQueryActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        Refresh();
    }//GEN-LAST:event_RefreshActionPerformed
    public void Refresh(){
        dispose();
        Form_member m = null;
        try {
            m = new Form_member();
        } catch (SQLException ex) {
            Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
    
    }
    private void SearchIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchIdActionPerformed
        try {
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Member WHERE Id_Member='"+Id_member.getText()+"';";
            ResultSet rs = stmt.executeQuery(query);
            Object [] n = new Object[4];
            cleanTable();
            while (rs.next()) {
                n[0] = rs.getString("Id_Member");
                n[1]  = rs.getString("Nama");
                n[2] = rs.getString("No_Ktp");
                n[3]  = rs.getString("No_Telepon");
                model.addRow(n);
            }        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }
    }//GEN-LAST:event_SearchIdActionPerformed
    
    public void cleanTable(){
	int baris = model.getRowCount();
	for(int i = 0 ; i < baris ; i++){
            model.removeRow(0);
        }
    }

    private void SearchNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNamaActionPerformed
        try {
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Member WHERE Nama='"+Nama.getText()+"';";
            ResultSet rs = stmt.executeQuery(query);
            Object [] n = new Object[4];
            cleanTable();
            while (rs.next()) {
                n[0] = rs.getString("Id_Member");
                n[1]  = rs.getString("Nama");
                n[2] = rs.getString("No_Ktp");
                n[3]  = rs.getString("No_Telepon");
                model.addRow(n);
            }        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }
    }//GEN-LAST:event_SearchNamaActionPerformed

    private void SearchHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchHpActionPerformed
        try {
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Member WHERE No_Telepon='"+No_hp.getText()+"';";
            ResultSet rs = stmt.executeQuery(query);
            Object [] n = new Object[4];
            cleanTable();
            while (rs.next()) {
                n[0] = rs.getString("Id_Member");
                n[1]  = rs.getString("Nama");
                n[2] = rs.getString("No_Ktp");
                n[3]  = rs.getString("No_Telepon");
                model.addRow(n);
            }        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }
    }//GEN-LAST:event_SearchHpActionPerformed

    private void SearchKTPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchKTPActionPerformed
        try {
            Statement stmt = Koneksi.conn.createStatement();
            String query = "SELECT * FROM Member WHERE No_Ktp='"+No_KTP.getText()+"';";
            ResultSet rs = stmt.executeQuery(query);
            Object [] n = new Object[4];
            cleanTable();
            while (rs.next()) {
                n[0] = rs.getString("Id_Member");
                n[1]  = rs.getString("Nama");
                n[2] = rs.getString("No_Ktp");
                n[3]  = rs.getString("No_Telepon");
                model.addRow(n);
            }        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Data tidak ditemukan");
        }
    }//GEN-LAST:event_SearchKTPActionPerformed

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
            java.util.logging.Logger.getLogger(Form_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Form_member().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Form_member.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalQuery;
    private javax.swing.JButton DeleteQuery;
    private javax.swing.JButton Home;
    private javax.swing.JTextField Id_member;
    private javax.swing.JButton InsertQuery;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField No_KTP;
    private javax.swing.JTextField No_hp;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SearchHp;
    private javax.swing.JButton SearchId;
    private javax.swing.JButton SearchKTP;
    private javax.swing.JButton SearchNama;
    private javax.swing.JLabel StatusKoneksi;
    private javax.swing.JTable Tabel_member;
    private javax.swing.JButton Tutup;
    private javax.swing.JButton UpdateQuery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
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
