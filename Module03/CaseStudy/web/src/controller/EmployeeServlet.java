package controller;

import model.EP_DepartmentEmployee;
import model.EP_Employee;
import model.EP_LevelEmployee;
import model.EP_PositionEmployee;
import model.dto.CustomerDTO;
import model.dto.EmployeeDTO;
import service.IEmployeeDepartmentService;
import service.IEmployeeLevelService;
import service.IEmployeePositionService;
import service.IEmployeeService;
import service.impl.EmployeeDepartmentServiceImpl;
import service.impl.EmployeeLevelServiceImpl;
import service.impl.EmployeePositionServiceImpl;
import service.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService employeeService = new EmployeeServiceImpl();
    private IEmployeeLevelService employeeLevelService = new EmployeeLevelServiceImpl();
    private IEmployeePositionService employeePositionService = new EmployeePositionServiceImpl();
    private IEmployeeDepartmentService employeeDepartmentService = new EmployeeDepartmentServiceImpl();

    private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<EmployeeDTO> employeeDTOList = this.employeeService.getAllEmployeeDTO();
        request.setAttribute("employeeDTOList", employeeDTOList);
        request.getRequestDispatcher("jsp/employee/list.jsp").forward(request, response);
    }

    private void viewEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        EP_Employee employee = this.employeeService.getEmployeeById(id);
        EP_LevelEmployee levelEmployee = this.employeeLevelService.getLevelEmployeeById(employee.getIdLevelEmployee());
        EP_PositionEmployee positionEmployee = this.employeePositionService.getPositionEmployeeById(employee.getIdPositionEmployee());
        EP_DepartmentEmployee departmentEmployee = this.employeeDepartmentService.getDepartmentEmployeeById(employee.getIdDepartmentEmployee());
        request.setAttribute("levelEmployee", levelEmployee);
        request.setAttribute("positionEmployee", positionEmployee);
        request.setAttribute("departmentEmployee", departmentEmployee);
        request.setAttribute("employee", employee);
        request.getRequestDispatcher("jsp/employee/view.jsp").forward(request, response);
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.employeeService.deleteEmployee(id);
        listEmployee(request, response);
    }

    private void viewCreateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<EP_PositionEmployee> positionEmployeeList = this.employeePositionService.getAllPositionEmployee();
        List<EP_DepartmentEmployee> departmentEmployeeList = this.employeeDepartmentService.getAllDepartmentEmployee();
        List<EP_LevelEmployee> levelEmployeeList = this.employeeLevelService.getAllLevelEmployee();
        request.setAttribute("positionEmployeeList", positionEmployeeList);
        request.setAttribute("departmentEmployeeList", departmentEmployeeList);
        request.setAttribute("levelEmployeeList", levelEmployeeList);
        request.getRequestDispatcher("jsp/employee/create.jsp").forward(request, response);
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int  idLevel = Integer.parseInt(request.getParameter("levelEmployee"));
        int idDepartment = Integer.parseInt(request.getParameter("departmentEmployee"));
        int idPosition = Integer.parseInt(request.getParameter("positionEmployee"));
        String birthday = request.getParameter("birthday");
        String identity = request.getParameter("identity");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String salary = request.getParameter("salary");
        this.employeeService.saveEmployee(new EP_Employee(id, idLevel, idPosition, idDepartment, name, birthday, identity, phoneNumber, email, salary));
        listEmployee(request, response);
    }

    private void searchEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("nameEmployeeSearch");
        List<EmployeeDTO> employeeDTOList = name == null ? this.employeeService.getAllEmployeeDTO() : this.employeeService.searchEmployeeDTO(name);
        request.setAttribute("employeeDTOList", employeeDTOList);
        request.getRequestDispatcher("jsp/employee/result.jsp").forward(request, response);
    }

    private void viewEditEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        EP_Employee employee = this.employeeService.getEmployeeById(id);
        List<EP_PositionEmployee> positionEmployeeList = this.employeePositionService.getAllPositionEmployee();
        List<EP_DepartmentEmployee> departmentEmployeeList = this.employeeDepartmentService.getAllDepartmentEmployee();
        List<EP_LevelEmployee> levelEmployeeList = this.employeeLevelService.getAllLevelEmployee();
        request.setAttribute("employee", employee);
        request.setAttribute("positionEmployeeList", positionEmployeeList);
        request.setAttribute("departmentEmployeeList", departmentEmployeeList);
        request.setAttribute("levelEmployeeList", levelEmployeeList);
        request.getRequestDispatcher("jsp/employee/edit.jsp").forward(request, response);
    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int  idLevel = Integer.parseInt(request.getParameter("levelEmployee"));
        int idDepartment = Integer.parseInt(request.getParameter("departmentEmployee"));
        int idPosition = Integer.parseInt(request.getParameter("positionEmployee"));
        String birthday = request.getParameter("birthday");
        String identity = request.getParameter("identity");
        String phoneNumber = request.getParameter("phoneNumber");
        String email = request.getParameter("email");
        String salary = request.getParameter("salary");
        EP_Employee employee = new EP_Employee(id, idLevel, idPosition, idDepartment, name, birthday, identity, phoneNumber, email, salary);
        this.employeeService.updateEmployee(employee, employee.getId());
        viewEmployee(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                try {
                    editEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "create":
                try {
                    createEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                try {
                    searchEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listEmployee(request, response);
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
                    viewCreateEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    viewEditEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "view":
                try {
                    viewEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    deleteEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listEmployee(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}

