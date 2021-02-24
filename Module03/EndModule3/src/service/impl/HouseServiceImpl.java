package service.impl;

import dao.IHouseDAO;
import dao.impl.HouseDAOImpl;
import model.Cost;
import model.FullHouseDTO;
import model.House;
import service.ICostService;
import service.IHouseService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HouseServiceImpl implements IHouseService {
    private IHouseDAO houseDAO = new HouseDAOImpl();
    private ICostService costService = new CostServiceImpl();

    @Override
    public void saveHouse(House house) throws SQLException {
        this.houseDAO.saveHouse(house);
    }

    @Override
    public House getHouseById(String id) throws SQLException {
        return this.houseDAO.getHouseById(id);
    }

    @Override
    public List<House> getAllHouse() throws SQLException {
        return this.houseDAO.getAllHouse();
    }

    @Override
    public boolean deleteHouse(String id) throws SQLException {
        return this.houseDAO.deleteHouse(id);
    }

    @Override
    public boolean updateHouse(House house, String id) throws SQLException {
        return this.houseDAO.updateHouse(house);
    }

    @Override
    public List<FullHouseDTO> getAllFullHouseDTO() throws SQLException {
        List<FullHouseDTO> fullHouseDTOList = new ArrayList<>();
        List<House> houseList = this.houseDAO.getAllHouse();

        for (House house : houseList) {
            FullHouseDTO fullHouseDTO = new FullHouseDTO();
            fullHouseDTO.setId(house.getId());
            fullHouseDTO.setName(house.getName());
            fullHouseDTO.setPhone(house.getPhone());
            fullHouseDTO.setStart(house.getStart());
            fullHouseDTO.setNote(house.getNote());
            fullHouseDTO.setIdCost(house.getIdCost());

            Cost cost = this.costService.getCostById(house.getIdCost());
            fullHouseDTO.setNameCost(cost.getName());

            fullHouseDTOList.add(fullHouseDTO);
        }
        return fullHouseDTOList;
    }

    @Override
    public List<FullHouseDTO> search(String name) throws SQLException {
        return this.getAllFullHouseDTO()
                .stream()
                .filter(fullHouseDTO -> fullHouseDTO.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<FullHouseDTO> searchId(String id) throws SQLException {
        return this.getAllFullHouseDTO()
                .stream()
                .filter(fullHouseDTO -> fullHouseDTO.getId().contains(id)).collect(Collectors.toList());
    }

    @Override
    public List<FullHouseDTO> searchPhone(String phone) throws SQLException {
        return this.getAllFullHouseDTO()
                .stream()
                .filter(fullHouseDTO -> fullHouseDTO.getPhone().contains(phone)).collect(Collectors.toList());
    }
}
