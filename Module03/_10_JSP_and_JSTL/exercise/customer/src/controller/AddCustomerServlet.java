package controller;

import models.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "AddCustomerServlet", urlPatterns = "/customer")
public class AddCustomerServlet extends HttpServlet {
    public static List<Customer> customerList = new ArrayList<>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer customer = new Customer();

        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String birthdayString = request.getParameter("birthday");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date birthday = simpleDateFormat.parse(birthdayString);
            customer.setBirthday(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        customer.setName(name);
        customer.setAddress(address);
        customer.setPhoto("images/4.jpg");

        if (customer.getName().equals("")  & customer.getAddress().equals("")) {
            request.setAttribute("Error", "Error");
        } else {
            customerList.add(customer);
        }
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("jsp/InputCustomer.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/InputCustomer.jsp").forward(request, response);
    }
}
