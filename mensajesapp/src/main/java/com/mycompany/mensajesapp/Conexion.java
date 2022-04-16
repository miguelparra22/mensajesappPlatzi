/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mensajesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author migue
 */
public class Conexion {
    
    public Connection get_connection(){
        Connection conection = null;
        
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root" ,"");
            if(conection != null){
                System.out.println("Conexion exitosa");
            }
        }catch(SQLException e){
            System.out.println(e);
            
        }
        
        return conection;
    }
    
}
