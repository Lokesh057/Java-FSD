import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/InterfaceDemo")
public class InterfaceDemo extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Initialization complete");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pwriter = res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }

    @Override
    public void destroy() {
        System.out.println("In destroy() method");
    }

    @Override
    public String getServletInfo() {
        return "This is a sample servlet info";
    }
}

