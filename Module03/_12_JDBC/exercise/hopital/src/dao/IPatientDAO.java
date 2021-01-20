package dao;

import model.Patient;

import java.sql.SQLException;
import java.util.List;

public interface IPatientDAO {
    void savePatient(Patient patient) throws SQLException;

    Patient getPatientById(int id) throws SQLException;

    List<Patient> getAllPatient() throws SQLException;

    List<Patient> getAllPatientName() throws SQLException;

    boolean deletePatient(int id) throws SQLException;

    boolean updatePatient(Patient patient) throws SQLException;

}
