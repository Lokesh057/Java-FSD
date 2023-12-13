import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/DashboardServlet")
public class Dashboard extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().println("<html><head><title>Dashboard</title></head><body>");
        response.getWriter().println("<h1>Welcome to the Dashboard!</h1>");
        response.getWriter().println("<a href='LogoutServlet'>Logout</a>");
        response.getWriter().println("</body></html>");
    }
}