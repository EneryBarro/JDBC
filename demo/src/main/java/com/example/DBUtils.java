package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// import java.util.Properties;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.IOException;

public class DBUtils {
    private static String dbURL = "jdbc:mem:test;INIT=RUNSCRIPT FROM 'classpath:init.sql'";
    private static String dbUsername = "sa";
    private static String dbPassword = "";

    public static Connection getConnection() {
        // String dbURL = null;
        // String dbUsername = "sa";
        // String dbPassword = "";

        // FileInputStream fis ;
        // Properties properties = new Properties();
        // try {
        //     fis = new FileInputStream("java/demo/src/main/java/resources/config.properties");
        //     properties.load(fis);

        //     dbURL = properties.getProperty("bd.host");

        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return connection;
    }
}
