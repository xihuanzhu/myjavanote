package com.jdbc.test;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest {
    public static void main(String[] argv){
        Connection conn = null;
        Statement statement = null;
        try {
            //1. 注册驱动
            //method 1:
//            Driver driver = new com.mysql.cj.jdbc.Driver();
//            DriverManager.registerDriver(driver);
            //method 2:
            //Class.forName("com.mysql.cj.jdbc.Driver");//因为注册驱动在Driver的静态代码块里，所以只要类加载就会执行
            //2. 获取连接
            /**
             * url:统一资源定位符（网络中某个资源的绝对路径）
             * URL包括：协议，IP，PORT， 资源名
             * localhost和127.0.0.1都是本机IP地址
             */
//            String url = "jdbc:mysql://127.0.0.1:3306/databaseforstudy";
//            String user = "root";
//            String password = "zhuxihuan";

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
            String sql = "insert into dept(deptno, dname, loc) value(90, '人事部', '北京')";
            //专门执行DML语句（insert delete update，  返回值是影响数据库中的记录条数
            int count = statement.executeUpdate(sql);
            System.out.println(count == 1? "update success": "update fail");
            //5. 处理查询结果集
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
