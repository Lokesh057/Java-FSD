// ProductFormServlet.java
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/productForm")
public class ProductForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        double price = Double.parseDouble(request.getParameter("price"));

        Product product = new Product();
        product.setProductId(productId);
        product.setProductId(productName);
        product.setPrice(price);

        HttpSession session = request.getSession();
        session.setAttribute("product", product);

        response.sendRedirect("productDisplay");
    }
}
