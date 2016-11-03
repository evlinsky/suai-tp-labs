import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class TestingServlet extends HttpServlet {
    Names names = new Names();

    public void init(ServletConfig config) {
        names.add("Masha");
        names.add("Annya");
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String uri = request.getRequestURI();
        if( uri.equals("/servlet-2/servlet/Testing/add") ) {
            names.add(request.getParameter("name"));
        }
        else if( uri.equals("/servlet-2/servlet/Testing/reset") ) {
            names.reset();
        }
        PrintWriter out = response.getWriter();
        out.println("<html>\n<body>\n");
        out.println("Last request URI was:" + uri);
        out.println(getMainPage());
        out.println("</body>\n</html>");
    }

    public String getMainPage() {
        StringBuilder sb = new StringBuilder();
        String strNames[] = names.getNamesStrings();
        for(int i = 0; i < strNames.length; i++) {
            sb.append("<p>" + strNames[i] + "</p>\n");
        }
        sb.append("<form method=\"GET\" action=\"/servlet-2/servlet/Testing/add\">\n");
        sb.append("Name: <input type=\"text\" name=\"name\">\n"); 
        sb.append("<input type=\"submit\" value=\"add\">\n");
        sb.append("</form>");
        sb.append("<a href=\"/servlet-2/servlet/Testing/reset\">reset</a>");
        return sb.toString();
    }
}
