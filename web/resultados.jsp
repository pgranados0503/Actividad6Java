<%-- 
    Document   : index
    Created on : 14/05/2021, 07:53:32 PM
    Author     : Paul Granados
--%>

<%@page import="modelo.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
       
        
        <%
                Triangulo t=new Triangulo();
                t=(Triangulo) request.getAttribute("OnjetoJava");
                if(t!=null){
                    out.print("El perimetro es: ");
                    out.print(t.getPerimetro()+"<br>");
                    out.print("El area es: ");
                    out.print(t.getArea());
                }
                        
            %>
        
    </body>
</html>
