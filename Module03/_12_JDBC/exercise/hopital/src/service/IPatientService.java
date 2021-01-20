package service;

import model.Patient;

import java.sql.SQLException;
import java.util.List;

public interface IPatientService {
    void savePatient(Patient patient) throws SQLException;

    Patient getPatientById(int id) throws SQLException;

    List<Patient> getAllPatient() throws SQLException;

    List<Patient> getAllPatientName() throws SQLException;

    boolean deletePatient(int id) throws SQLException;

    boolean updatePatient(int id, Patient patient) throws SQLException;

}
