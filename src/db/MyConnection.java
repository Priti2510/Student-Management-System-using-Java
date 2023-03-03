    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Priti
 */
public class MyConnection {
    private static final String username = "root";
    private static final String password = "aniketpriti";
    private static final String dataConn = "jdbc:mysql://localhost:3306/student_management";
    private static Connection con = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(dataConn, username, password);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
