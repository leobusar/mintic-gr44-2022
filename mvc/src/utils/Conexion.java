/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author leobusta
 */
public class Conexion {
    
    public static Connection getConnection(){
        Connection conn = null; 
        String dbURL = "jdbc:mysql://localhost:3306/libreria";
        String dbuser = "root";
        String dbpass = "hola1234";
        
        try{
            conn = DriverManager.getConnection(dbURL, dbuser, dbpass);
            if (conn != null)
                System.out.println("Conectado");
        } catch (SQLException ex) {
            System.out.println("No conectado");
            System.out.println(ex);
        }        
        
        return conn;
    }
    
}
