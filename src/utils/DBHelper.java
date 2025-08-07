package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/?user=root";
    private static final String user = "JDBC";
    private static final String password = "@123";

    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("Problem in loading MySql Driver! "+e);
        }
    }
    public static Connection getConnection()  {
        try{
            System.out.println("Connecting to DataBase...");
            Connection c= DriverManager.getConnection(url, user, password);
            System.out.println("DataBase Connected Sucessfully!");
            return c;
        }
        catch (SQLException e){
            System.out.println("Problem to get connected with the DataBase "+ e);
        }
        return null;
    }
}
