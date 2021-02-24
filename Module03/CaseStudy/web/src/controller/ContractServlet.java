package controller;

import model.CS_Customer;
import model.CT_Contract;
import model.EP_Employee;
import model.SV_Service;
import model.dto.ContractDTO;
import service.IContractService;
import service.ICustomerService;
import service.IEmployeeService;
import service.IService;
import service.impl.ContractServiceImpl;
import service.impl.CustomerServiceImpl;
import service.impl.EmployeeServiceImpl;
import service.impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ContractServlet", urlPatterns = "/contract")
public class ContractServlet extends HttpServlet {
    private IContractService contractService = new ContractServiceImpl();
    private IService service = new ServiceImpl();
    private ICustomerService customerService = new CustomerServiceImpl();
    private IEmployeeService employeeService = new EmployeeServiceImpl();

    private void listContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<ContractDTO> contractDAOList = this.contractService.getAllContractDTO();
        request.setAttribute("contractDAOList", contractDAOList);
        request.getRequestDispatcher("jsp/contract/list.jsp").forward(request, response);
    }

    private void viewCreateContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<SV_Service> serviceList = this.service.getAllService();
        List<CS_Customer> customerList = this.customerService.getAllCustomer();
        List<EP_Employee> employeeList = this.employeeService.getAllEmployee();
        request.setAttribute("serviceList", serviceList);
        request.setAttribute("customerList", customerList);
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("jsp/contract/create.jsp").forward(request, response);
    }

    private void createContract(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String start_date = request.getParameter("startDate");
        String end_date = request.getParameter("endDate");
        int deposit = Integer.parseInt(request.getParameter("deposit"));
        int total = Integer.parseInt(request.getParameter("total"));
        int idNameService = Integer.parseInt(request.getParameter("nameService"));
        int idNameCustomer = Integer.parseInt(request.getParameter("nameCustomer"));
        int idNameEmployee = Integer.parseInt(request.getParameter("nameEmployee"));
        this.contractService.saveContract(new CT_Contract(id, idNameService, idNameCustomer, idNameEmployee, start_date, end_date, deposit, total));
        listContract(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listContract(request, response);
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
                    viewCreateContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listContract(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
