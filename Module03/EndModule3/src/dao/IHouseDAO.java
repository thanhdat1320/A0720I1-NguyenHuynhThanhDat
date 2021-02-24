package dao;

import model.House;

import java.sql.SQLException;
import java.util.List;

public interface IHouseDAO {
    void saveHouse(House house) throws SQLException;

    House getHouseById(String id) throws SQLException;

    List<House> getAllHouse() throws SQLException;

    boolean deleteHouse(String id) throws SQLException;

    boolean updateHouse(House house) throws SQLException;

//    List<CS_CustomerUseDTO> getAllCustomerUseService() throws SQLException;
}
