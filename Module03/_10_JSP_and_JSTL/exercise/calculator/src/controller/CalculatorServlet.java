package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double num1 = Double.parseDouble(request.getParameter("num1"));
        Double num2 = Double.parseDouble(request.getParameter("num2"));
        Double result = null;

        if (("add").equals(request.getParameter("calculator"))) {
            result = num1 + num2;
        } else if (("sub").equals(request.getParameter("calculator"))) {
            result = num1 - num2;
        } else if (("mul").equals(request.getParameter("calculator"))) {
            result = num1 * num2;
        } else if (("div").equals(request.getParameter("calculator"))) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                throw new RuntimeException("Can't divide by zero");
            }
        }
        request.setAttribute("result", result);
        request.getRequestDispatcher("jsp/InputCalculator.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/InputCalculator.jsp").forward(request, response);
    }
}
