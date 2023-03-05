/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Prasant
 */
public class dbConnection {
    private static final String user="root";
    private static final String url="jdbc:mysql://localhost:3306/supermarketdb";
    private static final String pass="Prasant@7978";
     static Connection con = null;

     dbConnection()
    {
        try{
                con = DriverManager.getConnection(url,user,pass);
                
        }catch(Exception e){
            System.out.println("DB Connection error...");
            e.printStackTrace();
        } 
    }
}
