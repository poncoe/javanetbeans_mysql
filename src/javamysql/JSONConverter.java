///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */

//===========================================
// SILAHKAN DI UNCOMMENT, CUMA BACKUP AJA.
//===========================================

//package javamysql;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//
///**
// *
// * @author poncoe
// */
//public class JSONConverter {
//
//    static ArrayList<String> data = new ArrayList<String>();
//    static Connection conn = null;
//    static PreparedStatement ps = null;
//    static ResultSet rs = null;
//    static String path = "mahasiswa.json";
//    static String driver="com.mysql.jdbc.Driver";
//    static String url="jdbc:mysql://localhost/mahasiswa";
//    static String username="root";
//    static String password="";
//    static String query="select * from mahasiswa";
//
//    @SuppressWarnings({ "unchecked" })
//    public static void dataLoad(String path) {
//        JSONObject obj1 = new JSONObject();
//        JSONArray jsonArray = new JSONArray();
//        conn = Koneksi.getDbConnection(driver, url, username,
//                password);
//        try {
//            ps = conn.prepareStatement(query);
//            rs = ps.executeQuery();
//            ArrayList<String> columnNames = new ArrayList<String>();
//            if (rs != null) {
//                ResultSetMetaData columns = rs.getMetaData();
//                int i = 0;
//                while (i < columns.getColumnCount()) {
//                    i++;
//                    columnNames.add(columns.getColumnName(i));
//                }
//                while (rs.next()) {
//                    JSONObject obj = new JSONObject();
//                    for (i = 0; i < columnNames.size(); i++) {
//                        data.add(rs.getString(columnNames.get(i)));
//                        {
//                            for (int j = 0; j < data.size(); j++) {
//                                if (data.get(j) != null) {
//                                    obj.put(columnNames.get(i), data.get(j));
//                                }else {
//                                    obj.put(columnNames.get(i), "");
//                                }
//                            }
//                        }
//                    }
//
//                    jsonArray.add(obj);
//                    obj1.put("mahasiswa", jsonArray);
//                    FileWriter file = new FileWriter(path);
//                    file.write(obj1.toJSONString());
//                    file.flush();
//                    file.close();
//                }
//                ps.close();
//            } else {
//                JSONObject obj2 = new JSONObject();
//                obj2.put(null, null);
//                jsonArray.add(obj2);
//                obj1.put("mahasiswa", jsonArray);
//            }
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                    rs.close();
//                    ps.close();
//                } catch (SQLException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    @SuppressWarnings("static-access")
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        driver = "com.mysql.jdbc.Driver";
//        url = "jdbc:mysql://localhost/mahasiswa";
//        username = "root";
//        password = "";
//        path = "mahasiswa.json";
//        query = "select * from mahasiswa";
//
//        Koneksi dc = new Koneksi();
//        dc.getDbConnection(driver,url,username,password);
//        JSONConverter formatter = new JSONConverter();
//        formatter.dataLoad(path);
//
//    }
//
//}