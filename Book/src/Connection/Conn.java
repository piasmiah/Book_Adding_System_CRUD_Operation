/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author best brand bd
 */
public class Conn {
    public static Connection connect(){
    
    try{
    
    Class.forName("com.mysql.jdbc.Driver");
    
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
    return con;
    }
    
    catch(ClassNotFoundException | SQLException e){
    
        {
        return null;
        }
    }
}
}