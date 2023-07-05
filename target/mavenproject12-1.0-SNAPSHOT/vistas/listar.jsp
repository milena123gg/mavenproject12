
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <!--bootstrap-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
            crossorigin="anonymous"
            />
        <title>Sedes</title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center mt-2">Sedes - Contactos</h1>
            <a class="btn btn-success" href="Controlador?accion=index">Volver</a>
            <br>
            <br>
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">NOMBRE SEDE</th>
                        <th class="text-center">CONTACTO</th>
                    </tr>
                </thead>
                <%
                    ClienteDAO dao=new ClienteDAO();
                    List<Cliente>list=dao.listar();
                    Iterator<Cliente>iter=list.iterator();
                    Cliente per=null;
                    while(iter.hasNext()){
                        per=iter.next();
                    
                %>
                <tbody>
                    <tr>
                        <td class="text-center"><%= per.getIdCliente()%></td>
                        <td class="text-center"><%= per.getNombre()%></td>
                        <td><%= per.getContacto()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>

        </div>
    </body>
</html>
