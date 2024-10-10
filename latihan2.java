/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratikum1;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rahma
 */
public class latihan2 {
    public static void main(String[] args){
        static final String db_rahma="jdbc:mysql://localhost:3306/db_rahma";
        private static Connection Test_Konek;
        public static Connection db_rahma() throws SQLException, ClassNotFoundException {
          try {
              Driver myDriver = new com.mysql.jdbc.Driver();
              DriverManager.registerDriver(myDriver);
              System.out.println("Koneksi Database Berhasil");
          } catch (final SQLException ex){
              System.out.println("Koneksi Database Gagal");
          }
        return null;  
        }
}
