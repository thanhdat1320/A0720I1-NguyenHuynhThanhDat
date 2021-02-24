package service.impl;

import dao.ICostDAO;
import dao.impl.CostDAOImpl;
import model.Cost;
import service.ICostService;

import java.sql.SQLException;
import java.util.List;

public class CostServiceImpl  implements ICostService {
    private ICostDAO costDAO = new CostDAOImpl();

    @Override
    public void saveCost(Cost cost) throws SQLException {
        this.costDAO.saveCost(cost);
    }

    @Override
    public Cost getCostById(String id) throws SQLException {
        return this.costDAO.getCostById(id);
    }

    @Override
    public List<Cost> getAllCost() throws SQLException {
        return this.costDAO.getAllCost();
    }

    @Override
    public boolean deleteCost(String id) throws SQLException {
        return this.costDAO.deleteCost(id);
    }

    @Override
    public boolean updateCost(Cost cost, String id) throws SQLException {
        return this.costDAO.updateCost(cost);
    }
}
