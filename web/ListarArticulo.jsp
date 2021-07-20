<%-- 
    Document   : ListarArticulo
    Created on : 20/07/2021, 03:49:39 AM
    Author     : Microsoft
--%>

<%@page import="Presentadores.PresentadorGeneral"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="t" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Listado Articulos</h1>
        <% PresentadorGeneral pp = (PresentadorGeneral) session.getAttribute("pp");%>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">CODIGO</th>
                    <th scope="col">NOMBRE</th>
                    <th scope="col">PRECIO</th>
                    <th scope="col">CANTIDAD</th>
                    <th scope="col"></th>
                </tr>
            </thead>
            <tbody>

                <% for (int i = 0; i < pp.getLista().size(); i++) { %>
                <% Object[] f = (Object[])pp.getLista().get(i);%>
                <tr>
                    <t:form action="VentaControl">
                        <td><t:text property="codArt" value="<%= f[0].toString()%>"/></td>
                        <td><t:text property="nombre" value="<%= f[1].toString()%>"/></td>
                        <td><t:text property="precio" value="<%= f[2].toString()%>"/></td>
                        <td><t:text property="cantidad" value="<%= f[3].toString()%>"/></td>
                        <td><t:submit property="accion" value="Agregar"/></td>
                    </t:form>
                </tr>
                <% }%>
            </tbody>
        </table>
    </body>
</html>
