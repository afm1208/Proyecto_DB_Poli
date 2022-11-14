
package com.mysql.conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conex1 {
    //Variables para la conexion
    public static Connection con;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String contraseña = "Fdbr14200136.";
    private static final String url = "jdbc:mysql://localhost:3306/cursobd";
    
    //Metodo para conectarse con MySQL
    public Connection conectar(){
        con=null;
        try {
            con=(Connection) DriverManager.getConnection(url, user, contraseña);
            if (con!=null){
                System.out.println("Conectado");
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Error"+ e.toString());
        }
            return con;
    }

   
}
