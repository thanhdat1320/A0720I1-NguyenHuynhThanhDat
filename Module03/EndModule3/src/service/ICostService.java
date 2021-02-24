package service;

import model.Cost;
import model.House;

import java.sql.SQLException;
import java.util.List;

public interface ICostService {
    void saveCost(Cost cost) throws SQLException;

    Cost getCostById(String id) throws SQLException;

    List<Cost> getAllCost() throws SQLException;

    boolean deleteCost(String id) throws SQLException;

    boolean updateCost(Cost cost, String id) throws SQLException;
}
