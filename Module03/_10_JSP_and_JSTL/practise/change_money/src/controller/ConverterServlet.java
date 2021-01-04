package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConverterServlet", urlPatterns = "/converter")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float result = 0;

        request.setAttribute("rate", rate);
        request.setAttribute("usd", usd);
        request.setAttribute("result", result);
        request.setAttribute("error", "error");

//        if (usd < 0) {
//            request.setAttribute("error", "error");
//        } else {
//            result = rate * usd;
//            request.setAttribute("result", result);
//        }
        request.getRequestDispatcher("jsp/Converter.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("result", 0);
        request.getRequestDispatcher("jsp/Converter.jsp").forward(request, response);
    }
}
