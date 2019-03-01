<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="font-family: monospace; font-size: 16px; background-color: #f2fff3;">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center">
        <h1 style="color: #182719;">-- Convertir a radianes --</h1>
        <small>Por favor ingresa los grados entre 0° y 360°</small>
        <br>
        <br>
        <form action="add.jsp" method="get">
           <span style="font-size: 20px">Grados°: </span> <input type="text" name="val1" type="submit" style="width: 150px; height: 30px; border-radius: 22px; border-width: 2px; border-color: seagreen; outline-style: unset; font-size: 20px; padding-left: 10px;"><br>
           <br>
           <br>
           <input type="submit" value="convertir" style="background-color: #192618; color: white; width: 100px; height: 30px; font-size: 16px; border-radius: 10px;">
        </form>   

        <%
            double f = 0;
            
            ArrayList gradesArray = new ArrayList();
            ArrayList radianesArray = new ArrayList();
            String cuadrante=new String();
            Integer new_i = 0;

            if (request.getParameter("val1") != "") {

                try {
                    new_i = Integer.parseInt(request.getParameter("val1"));
                    if (new_i >= 0 && new_i <= 90){
                        cuadrante = "I";
                        for (int x = new_i; x <= 90; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }
                    } 
                    else if (new_i > 90 && new_i <= 180) {
                        cuadrante = "II";
                        for (int x = new_i; x <= 180; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }                        
                    }
                    else if (new_i > 180 && new_i <= 270) {
                        cuadrante = "III";
                        for (int x = new_i; x <= 270; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }                                                
                    }                    
                    else if (new_i > 270 && new_i <= 360) {
                        cuadrante = "IV";
                        for (int x = new_i; x <= 360; x++) {
                            gradesArray.add(x);
                            f = x * (Math.PI / 180);
                            radianesArray.add(f);
                        }                                                
                    }                  
            
                    if (new_i >= 0 && new_i <= 360) {
                        out.println("<br> <b>Ingresaste el número " + new_i + " que pertenece al cuadrante " + cuadrante + "</b><br><br>");

                        out.println("<br><b>-------------------------</b><br><br>");
                        for (int g = 0; g < gradesArray.size(); g++) {
                            if (g == 0) {
                                out.println(
                                    "<div style='color: #e2229b;;'><b>Grados</b>: " + (int) gradesArray.get(g) + "° - "+ 
                                    "<b>Radianes</b> : " + (double) radianesArray.get(g) + "<br></div>"  
                                );
                            } else {
                                out.println(
                                    "<b>Grados</b>: " + (int) gradesArray.get(g) + "° - "+ 
                                    "<b>Radianes</b>: " + (double) radianesArray.get(g) + "<br>"  
                                );                
                            }
                        }   
                        out.println("<br><b>-------------------------</b><br>");
                    } else {        
                        out.println("<br>El dato ingresado no es válidos<br><br>");
                    }
                } catch (NumberFormatException e) {
                    out.println("<br>El número de grados no es válido<br><br>");
                }                
            }
        %>
    </body>    
</html>
