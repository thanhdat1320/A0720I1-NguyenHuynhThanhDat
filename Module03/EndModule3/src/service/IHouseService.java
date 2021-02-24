package service;

import model.FullHouseDTO;
import model.House;

import java.sql.SQLException;
import java.util.List;

public interface IHouseService {
    void saveHouse(House house) throws SQLException;

    House getHouseById(String id) throws SQLException;

    List<House> getAllHouse() throws SQLException;

    boolean deleteHouse(String id) throws SQLException;

    boolean updateHouse(House house, String id) throws SQLException;

    List<FullHouseDTO> getAllFullHouseDTO() throws  SQLException;

    List<FullHouseDTO> search(String name) throws SQLException;

    List<FullHouseDTO> searchId(String id) throws  SQLException;

    List<FullHouseDTO> searchPhone(String phone) throws SQLException;
}
