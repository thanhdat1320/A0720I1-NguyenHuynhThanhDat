package service.Impl;

import dao.IPatientDAO;
import dao.impl.PatientDAOImpl;
import model.Patient;
import service.IPatientService;

import java.sql.SQLException;
import java.util.List;

public class PatientServiceImpl implements IPatientService {
    public static IPatientDAO patientDAO = new PatientDAOImpl();

    @Override
    public void savePatient(Patient patient) throws SQLException {
        patientDAO.savePatient(patient);
    }

    @Override
    public Patient getPatientById(int id) throws SQLException {
        return patientDAO.getPatientById(id);
    }

    @Override
    public List<Patient> getAllPatient() throws SQLException {
        return patientDAO.getAllPatient();
    }

    @Override
    public List<Patient> getAllPatientName() throws SQLException {
        return patientDAO.getAllPatientName();
    }

    @Override
    public boolean deletePatient(int id) throws SQLException {
        return patientDAO.deletePatient(id);
    }

    @Override
    public boolean updatePatient(int id, Patient patient) throws SQLException {
        return patientDAO.updatePatient(patient);
    }
}
