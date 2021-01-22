package controller;

import dao.IPatientDAO;
import dao.impl.PatientDAOImpl;
import model.CaseRecord;
import model.HospitalDTO;
import model.Patient;
import service.ICaseRecordService;
import service.IPatientService;
import service.Impl.CaseRecordServiceImpl;
import service.Impl.PatientServiceImpl;
import validate.Validate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "HospitalServlet", urlPatterns = "/hospital")
public class HospitalServlet extends HttpServlet {
    ICaseRecordService recordService = new CaseRecordServiceImpl();
    IPatientService patientService = new PatientServiceImpl();

    private void listCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
//        List<CaseRecord> cases = recordService.getAllCaseRecord();
//        List<Patient> patientList = patientService.getAllPatient();
//        request.setAttribute("cases", cases);
//        request.setAttribute("patientList", patientList);
        List<HospitalDTO> hospitalDTOS = recordService.getListHospital();
        request.setAttribute("hospitalDTOS", hospitalDTOS);
        request.getRequestDispatcher("jsp/CaseRecord/list.jsp").forward(request, response);
    }

    private void viewCreateCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Patient> patientList = this.patientService.getAllPatientName();
        int id = recordService.findMaxId() + 1;
        request.setAttribute("id", id);
        request.setAttribute("patientList", patientList);
        request.getRequestDispatcher("jsp/CaseRecord/create.jsp").forward(request, response);
    }

    private void createCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        int idPatient = Integer.parseInt(request.getParameter("patient"));
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        String reason = request.getParameter("reason");

        String errorBirthdayS = null;
        String errorBirthdayE = null;
        boolean flag = true;
        if (!Validate.checkBirthday(start)) {
            errorBirthdayS = "yyyy/MM/dd";
            request.setAttribute("errorBirthdayS", errorBirthdayS);
            flag = false;
        }
        if (!Validate.checkBirthday(end)) {
            errorBirthdayE = "yyyy/MM/dd";
            request.setAttribute("errorBirthdayE", errorBirthdayE);
            flag = false;
        }
        if (!flag) {
            CaseRecord caseRecord = new CaseRecord(id, idPatient, start, end, reason);
            recordService.saveCaseRecord(caseRecord);
            listCase(request, response);
        }
        viewCreateCase(request, response);
    }

    private void viewPatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        Patient patient = this.patientService.getPatientById(id);
        request.setAttribute("patient", patient);
        request.getRequestDispatcher("jsp/CaseRecord/viewPatient.jsp").forward(request, response);
    }

    private void viewCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        List<Patient> patientList = this.patientService.getAllPatient();
        int id = Integer.parseInt(request.getParameter("id"));
        CaseRecord caseRecord = this.recordService.getCaseRecordById(id);
        request.setAttribute("patientList", patientList);
        request.setAttribute("caseRecord", caseRecord);
        request.getRequestDispatcher("jsp/CaseRecord/view.jsp").forward(request, response);
    }

    private void searchCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        String name = request.getParameter("nameSearch");
        List<CaseRecord> caseRecordList = this.recordService.getAllCaseRecord();
        List<Patient> patientList = this.patientService.getAllPatient();
        request.setAttribute("caseRecordList", caseRecordList);
        request.setAttribute("patientList", patientList);
        request.setAttribute("name", name);
        request.getRequestDispatcher("jsp/CaseRecord/result.jsp").forward(request, response);
    }

    private void deleteCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.recordService.deleteCaseRecord(id);
        listCase(request, response);
    }

    private void viewEditCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Patient> patientList = this.patientService.getAllPatient();
        CaseRecord caseRecord = this.recordService.getCaseRecordById(id);
        request.setAttribute("patientList", patientList);
        request.setAttribute("caseRecord", caseRecord);
        request.getRequestDispatcher("jsp/CaseRecord/edit.jsp").forward(request, response);
    }

    private void editCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        int idPatient = Integer.parseInt(request.getParameter("patient"));
        String start = request.getParameter("start");
        String end = request.getParameter("end");
        String reason = request.getParameter("reason");
        CaseRecord caseRecord = new CaseRecord(id, idPatient, start, end, reason);
        this.recordService.updateCaseRecord(caseRecord.getId(), caseRecord);
        listCase(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                try {
                    editCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "create":
                try {
                    createCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                try {
                    searchCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listCase(request, response);
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
                    viewCreateCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    viewEditCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "view":
                try {
                    viewCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                try {
                    deleteCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "viewPatient":
                try {
                    viewPatient(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            default:
                try {
                    listCase(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
