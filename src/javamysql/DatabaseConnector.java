/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author poncoe
 */

public class DatabaseConnector {

    static Connection conn1 = null;

    public static Connection getDbConnection(String driver, String url,
            String username, String password) {
        // TODO Auto-generated constructor stub
        try {

            Class.forName(driver);

            conn1 = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn1;
    }

}