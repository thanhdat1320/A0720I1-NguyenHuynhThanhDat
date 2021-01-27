package service.impl;

import dao.IEmployeeDAO;
import dao.impl.EmployeeDAOImpl;
import model.EP_DepartmentEmployee;
import model.EP_Employee;
import model.EP_LevelEmployee;
import model.EP_PositionEmployee;
import model.dto.EmployeeDTO;
import service.IEmployeeDepartmentService;
import service.IEmployeeLevelService;
import service.IEmployeePositionService;
import service.IEmployeeService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeDAO employeeDAO = new EmployeeDAOImpl();
    private IEmployeeDepartmentService employeeDepartmentService = new EmployeeDepartmentServiceImpl();
    private IEmployeePositionService employeePositionService = new EmployeePositionServiceImpl();
    private IEmployeeLevelService employeeLevelService = new EmployeeLevelServiceImpl();

    @Override
    public void saveEmployee(EP_Employee employee) throws SQLException {
        this.employeeDAO.saveEmployee(employee);
    }

    @Override
    public EP_Employee getEmployeeById(int id) throws SQLException {
        return this.employeeDAO.getEmployeeById(id);
    }

    @Override
    public List<EP_Employee> getAllEmployee() throws SQLException {
        return this.employeeDAO.getAllEmployee();
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        return this.employeeDAO.deleteEmployee(id);
    }

    @Override
    public boolean updateEmployee(EP_Employee employee, int id) throws SQLException {
        return this.employeeDAO.updateEmployee(employee);
    }

    @Override
    public List<EmployeeDTO> getAllEmployeeDTO() throws SQLException {

        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        List<EP_Employee> employeeList = this.employeeDAO.getAllEmployee();

        for (EP_Employee employee : employeeList) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setName(employee.getName());
            employeeDTO.setIdPosition(employee.getIdPositionEmployee());
            employeeDTO.setIdDepartment(employee.getIdDepartmentEmployee());
            employeeDTO.setIdLevel(employee.getIdLevelEmployee());

            EP_DepartmentEmployee departmentEmployee = this.employeeDepartmentService.getDepartmentEmployeeById(employee.getIdDepartmentEmployee());
            EP_PositionEmployee positionEmployee = this.employeePositionService.getPositionEmployeeById(employee.getIdPositionEmployee());
            EP_LevelEmployee levelEmployee = this.employeeLevelService.getLevelEmployeeById(employee.getIdLevelEmployee());
            employeeDTO.setNameDepartment(departmentEmployee.getName());
            employeeDTO.setNamePosition(positionEmployee.getName());
            employeeDTO.setNameLevel(levelEmployee.getName());

            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

    @Override
    public List<EmployeeDTO> searchEmployeeDTO(String name) throws SQLException {
        return this.getAllEmployeeDTO().stream().filter(employeeDTO -> employeeDTO.getName().contains(name)).collect(Collectors.toList());
    }
}
