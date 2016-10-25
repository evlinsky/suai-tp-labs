import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class TestingServlet extends HttpServlet {

  public void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {

    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Servlet Testing</title>");
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>I am dynamic page! Time: " + System.currentTimeMillis() + "</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
