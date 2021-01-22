package dao;

import model.CS_TypeCustomer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerTypeDAO {
    void saveTypeCustomer(CS_TypeCustomer typeCustomer) throws SQLException;

    CS_TypeCustomer getTypeCustomerById(int id) throws SQLException;

    List<CS_TypeCustomer> getAllTypeCustomer() throws SQLException;

    boolean deleteTypeCustomer(int id) throws SQLException;

    boolean updateTypeCustomer(CS_TypeCustomer typeCustomer) throws SQLException;
}
