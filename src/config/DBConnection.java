
package config;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
    
     private static final String URL = "jdbc:sqlite:user.db"; // your SQLite DB

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch(Exception e) {
            System.out.println("DB connection failed: " + e.getMessage());
            return null;
        }
    }
    
}
