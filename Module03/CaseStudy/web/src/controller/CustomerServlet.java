package controller;

import model.CS_Customer;
import model.CS_TypeCustomer;
import model.dto.CustomerDTO;
import service.ICustomerService;
import service.ICustomerTypeService;
import service.impl.CustomerServiceImpl;
import service.impl.CustomerTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    ICustomerService customerService = new CustomerServiceImpl();
    ICustomerTypeService typeCustomerService = new CustomerTypeServiceImpl();

    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<CustomerDTO> customerDTOList = this.customerService.getAllCustomerDTO();
        request.setAttribute("customerDTOList", customerDTOList);
        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request, response);
    }

    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        CS_Customer customer = this.customerService.getCustomerById(id);
        CS_TypeCustomer typeCustomer = this.typeCustomerService.getTypeCustomerById(customer.getIdTypeCustomer());
        request.setAttribute("typeCustomer", typeCustomer);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request, response);
    }

    private void viewEditCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<CS_TypeCustomer> typeCustomerList = this.typeCustomerService.getAllTypeCustomer();
        CS_Customer customer = this.customerService.getCustomerById(id);
        request.setAttribute("typeCustomerList", typeCustomerList);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/edit.jsp").forward(request, response);
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int idTypeCustomer = Integer.parseInt(request.getParameter("typeCustomer"));
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String identity = request.getParameter("identity");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");

        this.customerService.updateCustomer(new CS_Customer(id, name, birthday, gender, identity, phoneNumber, email, address, idTypeCustomer), id);
        viewCustomer(request, response); // hoi tutor sao id lay getParameter duoc
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.deleteCustomer(id);
        listCustomer(request, response);
    }

    private void viewCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
      List<CS_TypeCustomer> typeCustomerList = this.typeCustomerService.getAllTypeCustomer();
      request.setAttribute("typeCustomerList", typeCustomerList);
      request.getRequestDispatcher("jsp/customer/create.jsp").forward(request, response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String gender = request.getParameter("gender");
        String identity = request.getParameter("identity");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idTypeCustomer = Integer.parseInt(request.getParameter("typeCustomer"));
        this.customerService.saveCustomer(new CS_Customer(id, name, birthday, gender, identity, phoneNumber, email, address, idTypeCustomer));
        listCustomer(request, response);
    }

    private void searchCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("nameSearch");
        List<CustomerDTO> customerDTOList = name == null ? this.customerService.getAllCustomerDTO() : this.customerService.searchCustomerDTO(name);
        request.setAttribute("customerDTOList", customerDTOList);
        request.getRequestDispatcher("jsp/customer/result.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                try {
                    editCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "create":
                try {
                    createCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                try {
                    searchCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    viewCreateCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    viewEditCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "view":
                try {
                    viewCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    deleteCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
