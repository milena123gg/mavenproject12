
package Controlador;

//import Modelo.Cliente;
//import ModeloDAO.ClienteDAO;
import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet { //es una clase abstracta 
    //proporcionada por la API de servlets 
    //de Java que simplifica la implementación de un servlet compatible 
    //con el protocolo HTTP. 


    
    String listar="vistas/listar.jsp"; //definimos la ruta donde se encuentra la vista


    //sobreescribimos el metodo doGet
    /*
    HttpServlet proporciona objetos 
    HttpServletRequest y HttpServletResponse que contienen información 
    sobre la solicitud entrante y permiten al servlet generar una 
    respuesta adecuada. Estos objetos facilitan el acceso a los 
    parámetros, encabezados, contenido y otras propiedades de la solicitud
    y la respuesta HTTP.
    */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String acceso= ""; 
        
        String action= request.getParameter("accion"); //obtenemos el dato por el parametro
        
        if(action.equalsIgnoreCase("listar")){ //verificamos si el dato del parametro es listar
            acceso=listar;  //si es asi, entonces actualizamos acceso con el atributo listar 
            //que tiene la url de la vista          
        }
        
        /*
        para redirigir la solicitud a otro recurso web (en este caso, un archivo JSP) 
        y transferir el control a ese recurso para generar la respuesta. El archivo JSP será 
        responsable de generar el contenido de la respuesta final basado en la lógica y los 
        datos proporcionados.
        
        */
        
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        
        /*
        se pasa el objeto request y el objeto response al archivo JSP, lo que permite acceder 
        a la información de la solicitud y generar una respuesta dinámica en el archivo JSP.
        */
        vista.forward(request, response);
    }


   

}