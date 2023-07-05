package Config;

import java.sql.*;

public class Conexion {
    Connection con;
    public Conexion(){ //DEFINIMOS EN EL CONSTRUCTOR LA CONEXION A LA BBDD
        //SI EL ATRIBUTO CON NO LLEGA A TENER NADA, ENTONCES DEVOLVERA UN OBJETO VACIO
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/clientesdb","root","clarita");            
        } catch (Exception e) {
            System.err.println("Error"+e);
        }
    }
    
    //METODO PARA PEDIR EL OBJETO CONNECTION
    public Connection getConnection(){
        return con;
    }
}