package javamysql;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class JavaMySQL {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/mahasiswa";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void showMenu() {
        System.out.println("\n========= MENU UTAMA =========");
        System.out.println("1. Insert Data");
        System.out.println("2. Show Data");
        System.out.println("3. Edit Data");
        System.out.println("4. Delete Data");
        System.out.println("0. Keluar");
        System.out.println("");
        System.out.print("PILIHAN> ");

        try {
            int pilihan = Integer.parseInt(input.readLine());

            switch (pilihan) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    insertMahasiswa();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateMahasiswa();
                    break;
                case 4:
                    deleteMahasiswa();
                    break;
                default:
                    System.out.println("Pilihan salah!");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void showData() {
        String sql = "SELECT * FROM mahasiswa";

        try {
            rs = stmt.executeQuery(sql);
            
            System.out.println("+--------------------------------+");
            System.out.println("|         DATA MAHASISWA         |");
            System.out.println("+--------------------------------+");

            System.out.println("NIM -- NAMA -- JURUSAN -- FAKULTAS");
            System.out.println("");
            
            while (rs.next()) {
                int nim = rs.getInt("nim");
                String nama = rs.getString("nama");
                String jurusan = rs.getString("jurusan");
                String fakultas = rs.getString("fakultas");

                System.out.println(String.format("%d. %s -- %s --- %s", nim, nama, jurusan, fakultas));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void insertMahasiswa() {
        try {
            // ambil input dari user
            System.out.print("NIM: ");
            String nim = input.readLine().trim();
            System.out.print("NAMA: ");
            String nama = input.readLine().trim();
            System.out.print("JURUSAN: ");
            String jurusan = input.readLine().trim();
            System.out.print("FAKULTAS: ");
            String fakultas = input.readLine().trim();
 
            // query simpan
            String sql = "INSERT INTO mahasiswa (nim, nama, jurusan, fakultas) VALUE('%s', '%s', '%s', '%s')";
            sql = String.format(sql, nim, nama, jurusan, fakultas);

            // simpan data
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static void updateMahasiswa() {
        try {
            
            // ambil input dari user
            System.out.print("NIM yang mau diedit: ");
            int nim = Integer.parseInt(input.readLine());
            System.out.print("Nama: ");
            String nama = input.readLine().trim();
            System.out.print("Jurusan: ");
            String jurusan = input.readLine().trim();
            System.out.print("Fakultas: ");
            String fakultas = input.readLine().trim();

            // query update
            String sql = "UPDATE mahasiswa SET nama='%s', jurusan='%s', fakultas='%s' WHERE nim=%d";
            sql = String.format(sql, nama, jurusan, fakultas, nim);

            // update data buku
            stmt.execute(sql);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void deleteMahasiswa() {
        try {
            
            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int nim = Integer.parseInt(input.readLine());
            
            // buat query hapus
            String sql = String.format("DELETE FROM mahasiswa WHERE nim=%d", nim);

            // hapus data
            stmt.execute(sql);
            
            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
