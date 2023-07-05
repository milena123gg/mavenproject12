
package ModeloDAO;

import Config.Conexion;
import Modelo.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente p=new Cliente();
    
    
    public List listar() {
        ArrayList<Cliente>list=new ArrayList<>();
        String sql="select * from clientes";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente cli=new Cliente();
                cli.setIdCliente(rs.getInt("id_cliente"));
                cli.setNombre(rs.getString("nombre"));
                cli.setContacto(rs.getString("contacto"));
                list.add(cli);
            }
        } catch (Exception e) {
        }
        return list;
    }

    
}