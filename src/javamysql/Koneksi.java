package javamysql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

// import java.sql.* (untuk import semuanya tanpa harus panggil satu2 kayak diatas)

/**
 *
 * @author poncoe
 */


public class Koneksi {
    
    // Menyiapkan paramter JDBC untuk koneksi ke datbase
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; //Driver dari Java Database Connection
    static final String DB_URL = "jdbc:mysql://localhost/mahasiswa"; // Nama DB di localhost MySQL
    static final String USER = "root"; // Username DB Kalian
    static final String PASS = ""; // Pass DB Kalian

    // Menyiapkan objek yang diperlukan untuk mengelola database
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] args) {
        
        // Melakukan koneksi ke database
        // harus dibungkus dalam blok try/catch
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            
            // buat koneksi ke database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            
            // buat objek statement
            stmt = conn.createStatement();
            
            // buat query ke database
            String sql = "SELECT * FROM mahasiswa";
            
            // eksekusi query dan simpan hasilnya di obj ResultSet
            rs = stmt.executeQuery(sql);
            
            // tampilkan hasil query
            while(rs.next()){
                System.out.println("NIM: " + rs.getInt("nim"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("Jurusan: " + rs.getString("jurusan"));
                System.out.println("Fakultas: " + rs.getString("fakultas"));
            }
            
            stmt.close();
            conn.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
