package controller;

import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "InforProductServlet", urlPatterns = "/product")
public class InforProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));
        Product product = new Product();
        product.setNameProduct(name);
        product.setPrice(price);
        product.setDiscount(discount);
        request.setAttribute("product", product);

        double priceDiscount = price * discount * 0.01;
        request.setAttribute("result", priceDiscount);

        request.getRequestDispatcher("jsp/CalculateDiscount.jsp").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/inputProduct.jsp").forward(request, response);
    }
}
