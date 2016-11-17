import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
                    throws ServletException, IOException {
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        request.getRequestDispatcher("link.html").include(request, response);

        if( password.equals("admin123") ){
            out.print("Welcome, " + name);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
        }
        else{
            out.print("Sorry, username or password error!");
            request.getRequestDispatcher("login.html").include(request, response);
        }

        out.println("</html></body>");
        out.close();
    }

}
