package com.jdbc.test;

import java.sql.*;

public class DBUtil {
    private DBUtil(){

    }
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/databaseforstudy", "root", "zhuxihuan");
    }

    public static void close(Connection conn, Statement ps, ResultSet rs){
        try{
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
