package com.JDBC;
import java.sql.*;

public class Preparedstatement {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String uname="root";
        String password="8925311194";
        String url ="jdbc:mysql://localhost:3306/tk";
        String query = "update names set naav = (?) where id = (?)";
        String querytoView = "Select * from names";
        int no = 4;
        String name = "Anusuya kanmani";
        Connection con = DriverManager.getConnection(url,uname,password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(2,no);
        ps.setString(1,name);
        int count = ps.executeUpdate();

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(querytoView);
        while (rs.next()) {
            System.out.println(rs.getInt(1)+" - "+rs.getString(2));
        }




    }
}
