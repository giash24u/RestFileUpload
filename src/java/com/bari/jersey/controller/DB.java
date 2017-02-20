package com.bari.jersey.controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {

    public DB() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/webservice","root","123");
            ps=(PreparedStatement) conn.createStatement();
            ResultSet rs=ps.executeQuery("select * from mycountry"); 
            
            
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            
        }
    }

}
