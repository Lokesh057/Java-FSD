

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ProductDisplay
 */
@WebServlet("/productDisplay")
public class ProductDisplay extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Product product = (Product) session.getAttribute("product");

        request.setAttribute("product", product);
        request.getRequestDispatcher("productDisplay.jsp").forward(request, response);
    }
}
