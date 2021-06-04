/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aksa.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
public class Config {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException{
        
        try {
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6417098","sql6417098","GUc1C82gWx"); 
        } catch(SQLException e) {
            System.out.println("Koneksi Ke Database Gagal " +e.getMessage());
        }
        return MySQLConfig;
    }
    
    
    
}
