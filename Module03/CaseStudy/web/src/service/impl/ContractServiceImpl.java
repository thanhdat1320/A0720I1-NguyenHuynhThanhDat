package service.impl;

import dao.IContractDAO;
import dao.impl.ContractDAOImpl;
import model.CS_Customer;
import model.CT_Contract;
import model.EP_Employee;
import model.SV_Service;
import model.dto.ContractDTO;
import service.IContractService;
import service.ICustomerService;
import service.IEmployeeService;
import service.IService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractServiceImpl implements IContractService {
    private IContractDAO contractDAO = new ContractDAOImpl();
    private IService service = new ServiceImpl();
    private ICustomerService customerService = new CustomerServiceImpl();
    private IEmployeeService employeeService  = new EmployeeServiceImpl();

    @Override
    public void saveContract(CT_Contract contract) throws SQLException {
        this.contractDAO.saveContract(contract);
    }

    @Override
    public CT_Contract getContractById(int id) throws SQLException {
        return this.contractDAO.getContractById(id);
    }

    @Override
    public List<CT_Contract> getAllContract() throws SQLException {
        return this.contractDAO.getAllContract();
    }

    @Override
    public boolean deleteContract(int id) throws SQLException {
        return this.contractDAO.deleteContract(id);
    }

    @Override
    public boolean updateContract(CT_Contract contract, int id) throws SQLException {
        return this.contractDAO.updateContract(contract);
    }

    @Override
    public List<ContractDTO> getAllContractDTO() throws SQLException {
        List<ContractDTO> contractDAOList = new ArrayList<>();
        List<CT_Contract> contractList = this.contractDAO.getAllContract();

        for (CT_Contract contract : contractList) {
            ContractDTO contractDAO = new ContractDTO();
            contractDAO.setId(contract.getId());
            contractDAO.setStart_date(contract.getStart());
            contractDAO.setEnd_date(contract.getEnd());

            SV_Service service = this.service.getServiceById(contract.getIdServices());
            contractDAO.setId_services(service.getId());
            contractDAO.setNameService(service.getName());

            CS_Customer customer = this.customerService.getCustomerById(contract.getIdCustomer());
            contractDAO.setId_customer(customer.getId());
            contractDAO.setNameCustomer(customer.getName());

            EP_Employee employee = this.employeeService.getEmployeeById(contract.getIdEmployee());
            contractDAO.setId_employee(employee.getId());
            contractDAO.setNameEmployee(employee.getName());

            contractDAOList.add(contractDAO);
        }
        return contractDAOList;
    }
}
