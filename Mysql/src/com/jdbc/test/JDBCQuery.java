package com.jdbc.test;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCQuery {
    public static void main(String[] argv){
        Connection conn = null;
        Statement statement = null;
        ResultSet rs;
        try {
            //使用资源绑定器绑定属性文件
            ResourceBundle bundle = ResourceBundle.getBundle("com/jdbc/test/jdbc");
            String driver = bundle.getString("driver");
            Class.forName(driver);
            String url = bundle.getString("url");
            String user = bundle.getString("user");
            String password = bundle.getString("password");

            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            //3. 获取数据库操作对象
            statement =  conn.createStatement();
            //4. 执行SQl语句
            String sql = "select * from dept";
            //专门执行DQL语句
            //5. 处理查询结果集
             rs = statement.executeQuery(sql);
             while(rs.next())//如果该行有数据，返回true，下标到下一行， 否则返回false
                System.out.println(rs.getString("dname")); //10 //JDBC中所有下标从1开始，第1列，
            // 也可以用select获取的字段取，获取int就getInt等等
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //6. 释放资源, 在finally中保证其一定关闭，遵循从小到大关闭，分别对其try...catch
            try{
                if(statement != null){
                    statement.close();
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
}
