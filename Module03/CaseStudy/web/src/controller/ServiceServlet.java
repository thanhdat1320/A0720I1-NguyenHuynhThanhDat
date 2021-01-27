package controller;

import model.SV_Service;
import model.SV_TypeRent;
import model.SV_TypeService;
import model.dto.ServiceDTO;
import service.IService;
import service.IServiceType;
import service.IServiceTypeRent;
import service.impl.ServiceImpl;
import service.impl.ServiceTypeImpl;
import service.impl.ServiceTypeRent;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/service")
public class ServiceServlet extends HttpServlet {
    private IService service = new ServiceImpl();
    private IServiceType serviceType = new ServiceTypeImpl();
    private IServiceTypeRent serviceTypeRent = new ServiceTypeRent();

    private void listService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<ServiceDTO> serviceDTOList = this.service.getAllServiceDTO();
        request.setAttribute("serviceDTOList", serviceDTOList);
        request.getRequestDispatcher("jsp/service/list.jsp").forward(request, response);
    }

    private void viewCreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<SV_TypeRent> typeRentList = this.serviceTypeRent.getAllTypeRentService();
        List<SV_TypeService> typeServiceList = this.serviceType.getAllTypeService();
        request.setAttribute("typeRentList", typeRentList);
        request.setAttribute("typeServiceList", typeServiceList);
        request.getRequestDispatcher("jsp/service/create.jsp").forward(request, response);
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        int idTypeRent = Integer.parseInt(request.getParameter("typeRent"));
        int idTypeService = Integer.parseInt(request.getParameter("typeService"));
        String name = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        int floor = Integer.parseInt(request.getParameter("floor"));
        String amount = request.getParameter("amount");
        String price = request.getParameter("price");
        String status = request.getParameter("status");
        this.service.saveService(new SV_Service(id, idTypeRent, idTypeService, name, area, floor, amount, price, status));
        listService(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createService(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listService(request, response);
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
                    viewCreateService(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listService(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
