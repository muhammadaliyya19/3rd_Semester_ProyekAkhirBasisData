/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Toko;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author DBSS_050
 */
public class Koneksi {
    public static Connection conn;
    public static void Konek(){
        try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String ConnectionURL = "jdbc:sqlserver://localhost:1433;"
                + "databaseName=Toko_proj_akhir;user=ProjekAkhir;password=bernad!@#";
        conn = DriverManager.getConnection(ConnectionURL);
        } catch (SQLException ex){
        } catch (ClassNotFoundException ex) {}
    }
    public static void Tutup() throws SQLException{
        conn.close();
    }
}
