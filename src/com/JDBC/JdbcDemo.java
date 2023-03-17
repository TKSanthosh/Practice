package com.JDBC;
import java.sql.*;
public class JdbcDemo {

    public static void main(String[] args) throws Exception{
       Class.forName("com.mysql.cj.jdbc.Driver");
       String url = "jdbc:mysql://localhost:3306/tk";
       Connection con = DriverManager.getConnection(url,"root","8925311194");
       Statement st = con.createStatement();
      // ResultSet rs = st.executeQuery("select naav from names where id =1");
        ResultSet rs = st.executeQuery("select * from names");
        while(rs.next()) {
            String data = rs.getInt(1) + " : "+ rs.getString(2);
            System.out.println(data);
        }

    }
}
