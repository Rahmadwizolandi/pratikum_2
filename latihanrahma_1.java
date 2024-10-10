/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratikum_1_2;
import java.sql.*;
/**
 *
 * @author PC 16
 */


public class latihanrahma_1 {
    public static void main(String[]args){
        
    }
    static final String db_rahma="jbdc:mysql:localhost:3306/db_rahma";
    public static Connection db_rahma() throws SQLException , ClassNotFoundException {
        try {
            Class.forName(db_rahma);
            System.out.println("PROSES Deteksi Drivcer Berhasil");
            DriverManager.getConnection(db_rahma);
            System.out.println("Koneksi Database Berhasil");
        }catch (final SQLException ex) {
            System.out.println("Koneksi Database Gagal");
        }
         return null;
        }
    }

 