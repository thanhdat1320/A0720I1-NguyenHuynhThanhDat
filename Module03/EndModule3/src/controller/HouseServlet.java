package controller;

import common.Validate;
import model.Cost;
import model.FullHouseDTO;
import model.House;
import service.ICostService;
import service.IHouseService;
import service.impl.CostServiceImpl;
import service.impl.HouseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "TestServlet", urlPatterns = "/house")
public class HouseServlet extends HttpServlet {
    private IHouseService houseService = new HouseServiceImpl();
    private ICostService costService = new CostServiceImpl();

    private void listHouse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<FullHouseDTO> fullHouseDTOList = this.houseService.getAllFullHouseDTO();
        request.setAttribute("fullHouseDTOList", fullHouseDTOList);
        request.getRequestDispatcher("jsp/house/list.jsp").forward(request, response);
    }

    private void viewCreateHouse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Cost> costList = this.costService.getAllCost();
        request.setAttribute("costList", costList);
        request.getRequestDispatcher("jsp/house/create.jsp").forward(request, response);
    }

    private void searchHouse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("nameSearch");
        List<FullHouseDTO> fullHouseDTOList = name == null ? this.houseService.getAllFullHouseDTO() : this.houseService.search(name);
        request.setAttribute("fullHouseDTOList", fullHouseDTOList);
        request.getRequestDispatcher("jsp/house/result.jsp").forward(request, response);
    }

    private void createHouse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String start = request.getParameter("start");
        String note = request.getParameter("note");
        String idCost = request.getParameter("typeCost");
        House house = new House(id, name, phone, start, note, idCost);

        String errorName = null;
        String errorId = null;
        String errorPhoneNumber = null;

        boolean flag = true;
        if (!Validate.checkPhoneNumber(phone)) {
            errorPhoneNumber = "(xxxxxxxxxx)";
            flag = false;
        }

        if (!Validate.checkIdCustomer(id)) {
            errorId = "PT-XXX";
            flag = false;
        }

        if (!Validate.checkName(name)) {
            errorName = "fail name";
            flag = false;
        }

        if (!flag) {
            request.setAttribute("house", house);
            request.setAttribute("errorPhoneNumber", errorPhoneNumber);
            request.setAttribute("errorId", errorId);
            request.setAttribute("errorName", errorName);
        } else {
            this.houseService.saveHouse(new House(id, name, phone, start, note, idCost));
            listHouse(request, response);
        }
        viewCreateHouse(request, response);
    }


    private void deleteHouse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String id = request.getParameter("id");
        this.houseService.deleteHouse(id);
        listHouse(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createHouse(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                try {
                    searchHouse(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listHouse(request, response);
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
                    viewCreateHouse(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    deleteHouse(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listHouse(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
