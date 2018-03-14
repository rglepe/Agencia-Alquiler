<%-- 
    Document   : alquiler
    Created on : 08-mar-2018, 12:19:24
    Author     : Raul
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Bienvenido ${sessionScope.miCliente.nombre}<br><br>
        <jsp:useBean id="miAlquiler" class="modelo.AlquilerVehiculo" />
        <jsp:useBean id="miVehiculo" class="modelo.Vehiculo" />
        <jsp:setProperty name="miVehiculo" property="*" />

        <% if(!miAlquiler.buscarVehiculo(miVehiculo)) {
                session.setAttribute("miVehiculo",miVehiculo);
                out.println("El vehículo seleccionado no está disponible, elija otro");
                request.getRequestDispatcher("alquiler.jsp").include(request, response);
        }
        %>
               Alquila un vehículo<br><br>

        <form action="alquiler.jsp">
            <select name="tipoVeh" value="Tipo de Vehículo" size="3">
                <option>Turismo</option>
                <option>Furgoneta</option>
                <option>Moto</option>
            </select>
            <select name="combustible" value="Tipo de Combustible" size="2">
                <option>gasolina</option>
                <option>diesel</option>
            </select>           
            </select>           
            <input type="submit" value="buscar" />
        </form>
    </body>
</html>
