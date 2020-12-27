package controller;

import model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ShowInformationServlet", urlPatterns = "/showInfo")
public class ShowInformationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String birthdayString = request.getParameter("birthday");

        Person person = new Person();
        person.setName(firstName.concat(" ").concat(lastName));
        person.setAddress(address);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        try {
            Date birthday = simpleDateFormat.parse(birthdayString);
            person.setBirthday(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        request.setAttribute("person", person);
        request.getRequestDispatcher("jsp/form_output.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/form_input.jsp").forward(request, response);
    }
}
