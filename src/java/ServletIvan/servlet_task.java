package ServletIvan;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ivan
 */
@WebServlet("/add")
public class servlet_task extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("Entro1");
        int i = Integer.parseInt(request.getParameter("val1"));
        int j = Integer.parseInt(request.getParameter("val2"));
        System.out.println("Entro2");    
        int k = i + j;
        System.out.println("Entro3");    
        PrintWriter out = response.getWriter();
        out.println("convert" + k);
    
    }
}
