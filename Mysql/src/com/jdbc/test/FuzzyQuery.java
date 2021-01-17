package com.jdbc.test;

import java.sql.*;
import java.util.ResourceBundle;

public class FuzzyQuery {
    public static void main(String[] argv) {
        Connection conn = null;
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            conn = DBUtil.getConnection();
            //String sql = "select * from dept where dname like '_?%'";//错误写法，直接把？识别成字符串
            String sql = "select * from dept where dname like ?";
            statement = conn.prepareStatement(sql);
            //statement.setString(1, "A");
            statement.setString(1, "_A%");
            rs = statement.executeQuery();
            while (rs.next())//如果该行有数据，返回true，下标到下一行， 否则返回false
                System.out.println(rs.getString("dname")); //10 //JDBC中所有下标从1开始，第1列，
            // 也可以用select获取的字段取，获取int就getInt等等
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, statement, rs);
        }
    }
}
