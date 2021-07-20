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
        <h1>PROCESO DE VENTA</h1>
        <% PresentadorGeneral pp = (PresentadorGeneral) session.getAttribute("pp");%>
        <% Object[] f = pp.getFila();%>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID-VENTA</th>
                    <th scope="col">FECHA</th>
                    <th scope="col">CODIGO EMPLEADO</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= f[0]%></td>
                    <td><%= f[1]%></td>
                    <td><%= f[4]%></td>
                </tr>
            </tbody>
        </table>

        <t:form action="VentaControl">
            <t:text property="cod" />
            <t:submit property="accion" value="Listar"/>
        </t:form>
    </body>
</html>
