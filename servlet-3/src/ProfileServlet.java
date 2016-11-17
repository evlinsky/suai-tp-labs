import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
                      throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        request.getRequestDispatcher("link.html").include(request, response);

        HttpSession session = request.getSession(false);
        if(session != null){
            String name = (String)session.getAttribute("name");
            out.print("Hello, " + name + " Welcome to Profile");
        }
        else{
            out.print("Please login first");
            request.getRequestDispatcher("login.html").include(request, response);
        }

        out.println("</html></body>");
        out.close();
    }
}
