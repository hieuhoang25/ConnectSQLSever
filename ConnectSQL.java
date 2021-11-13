/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hicode.dao;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;

/**
 *
 * @author HieuHoang
 */
public class ConnectSQL {
    public static Connection getConnectionSQL(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sqlConnec="jdbc:sqlserver://localhost:1433;databaseName=QLySanPham";
            return DriverManager.getConnection(sqlConnec, "sa", "2510");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
        
    }
    //cach 2
    public static Connection getConnectionSQL2(){
        String server = "DESKTOP-KQ451IS\\SQLEXPRESS";
        String user = "sa";
        String password = "2510";
        int port = 1433;
        String database = "QLySanPham";
        SQLServerDataSource dataSource = new SQLServerDataSource();
        dataSource.setServerName(server);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(database);
        try {
            return dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return null;
        
    }
}
