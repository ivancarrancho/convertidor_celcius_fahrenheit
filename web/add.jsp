<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-family: monospace; font-size: 16px">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center">
        <h1 style="color:blue;">F° 2 C° / C° 2 F°</h1>
        <small>Por favor ingrese los valores a convertir</small>
        <br>
        <br>
        <form action="add.jsp" method="get">
           <span style="font-size: 20px">F°: </span> <input type="text" name="val1"><br>
           <span style="font-size: 20px">C°: </span> <input type="text" name="val2"><br>
           <br>
           <br>
           <input type="submit" value="convertir" style="background-color: black; color: white; width: 100px; height: 30px; font-size: 16px; border-radius: 10px;">
        </form>   

        <%
            double c = 0;
            double f = 0;
            double i = 0;
            double j = 0;
            if (request.getParameter("val1") != "") {
            
                try {
                    i = Double.parseDouble(request.getParameter("val1"));
                    c = (i - 32) * (0.555);
                } catch (NumberFormatException e) {
                    out.println("El F° no es un número válido<br><br>");
                }                
                
            }
            if (request.getParameter("val2") != "") {
                try {
                    j = Double.parseDouble(request.getParameter("val2"));
                    f = (j * (1.8)) + 32;
                } catch (NumberFormatException e) {
                    out.println("El C° no es un número válido<br><br>");
                }
            }
            
        if (c != 0) {
            out.println("<br>");
            out.println(i + " <b>Farenheit a Celcius:</b> " + c + "<br>");
            out.println("<br>");
        }
        if (f != 0) {
            out.println("<br>");
            out.println(j + " <b>Celcius a Farenheit:</b> " + f + "<br>");
            out.println("<br>");
        }
                
        %>
    </body>    
</html>
