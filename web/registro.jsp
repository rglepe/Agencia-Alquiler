<%-- 
    Document   : registro
    Created on : 08-mar-2018, 12:18:45
    Author     : Raul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import = "java.util.ArrayList" %>
<%@page import = "modelo.Cliente" %>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="miCliente" class="modelo.Cliente" />
        <jsp:setProperty name="miCliente" property="*" />

        <% if(miCliente.exist()) {
                session.setAttribute("miCliente",miCliente);
                request.getRequestDispatcher("alquiler.jsp").forward(request, response);
        }
        %>
        
        Regístrese para poder utilizar la aplicación<br>
        
        <form action="registro.jsp" scope ="session">
             Nombre: <input type="text" name="nombre" value="" />
            Usuario: <input type="text" name="usuario" value="" />
         Contraseña: <input type="text" name="contraseña" value="" />
            <input type="hidden" name="nuevo" value="true" />
            <input type="submit" value="registrarse" />
        </form>
    </body>
</html>

