package dao.impl;

import dao.IPatientDAO;
import model.Patient;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements IPatientDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_Patient = "insert into patient(id, name, email, address) value(?, ?, ?, ?)";
    public static final String GET_Patient_BY_ID = "select * from patient where id = ?";
    public static final String GET_ALL_Patient = "select * from patient";
    public static final String DELETE_Patient = "delete from patient where id = ?";
    public static final String UPDATE_Patient = "update patient set name = ?, email = ?, address = ?";
    public static final String UPDATE_NAME_PATIENT = "update patient set  patient.name = ? where patient.name = ?";
    @Override
    public void savePatient(Patient patient) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_Patient);
        preparedStatement.setInt(1, patient.getId());
        preparedStatement.setString(2, patient.getEmail());
        preparedStatement.setString(3, patient.getAddress());
        preparedStatement.executeUpdate();
    }

    @Override
    public Patient getPatientById(int id) throws SQLException {
        Patient patient = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_Patient_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            patient = new Patient(id, name, email, address);
        }
        return patient;
    }

    @Override
    public List<Patient> getAllPatient() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_Patient);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            patients.add(new Patient(id, name, email, address));
        }
        return patients;
    }

    @Override
    public List<Patient> getAllPatientName() throws SQLException {
        List<Patient> patients = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM patient ORDER BY name");

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            patients.add(new Patient(id, name, email, address));
        }
        return patients;
    }

    @Override
    public boolean deletePatient(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_Patient);
        preparedStatement.setInt(1, id);

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updatePatient(Patient patient) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_Patient);
        preparedStatement.setString(1, patient.getName());
        preparedStatement.setString(2, patient.getEmail());
        preparedStatement.setString(3, patient.getAddress());
        return preparedStatement.executeUpdate() > 0;
    }
}
