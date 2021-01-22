package dao.impl;

import dao.ICaseRecordDAO;
import dao.IPatientDAO;
import model.CaseRecord;
import model.Patient;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CaseRecordDAOImpl implements ICaseRecordDAO {
    public static Connection connection = DBConnection.getConnection();
    public static final String INSERT_CaseRecord = "insert into case_record(id, id_patient, start, end, reason) value(?, ?, ?, ?, ?)";
    public static final String GET_CaseRecord_BY_ID = "select * from case_record where id = ?";
    public static final String GET_ALL_CaseRecord = "select * from case_record";
    public static final String DELETE_CaseRecord = "delete from case_record where id = ?";
    public static final String UPDATE_CaseRecord = "update case_record set  id_patient = ?, start = ?, end = ?, reason = ? where id = ?";

    @Override
    public void saveCaseRecord(CaseRecord caseRecord) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CaseRecord);
        int idMax = this.findMaxId();
        preparedStatement.setInt(1, idMax + 1);
        preparedStatement.setInt(2, caseRecord.getIdPatient());
        preparedStatement.setString(3, caseRecord.getStart());
        preparedStatement.setString(4, caseRecord.getEnd());
        preparedStatement.setString(5, caseRecord.getReason());
        preparedStatement.executeUpdate();
    }

    @Override
    public CaseRecord getCaseRecordById(int id) throws SQLException {
        CaseRecord caseRecord = null;
        PreparedStatement preparedStatement = connection.prepareStatement(GET_CaseRecord_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            int id_patient = resultSet.getInt("id_patient");
            String start = resultSet.getString("start");
            String end = resultSet.getString("end");
            String reason = resultSet.getString("reason");
            caseRecord = new CaseRecord(id, id_patient, start, end, reason);
        }
        return caseRecord;
    }

    @Override
    public List<CaseRecord> getAllCaseRecord() throws SQLException {
        List<CaseRecord> caseRecordList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_CaseRecord);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            int id_patient = resultSet.getInt("id_patient");
            String start = resultSet.getString("start");
            String end = resultSet.getString("end");
            String reason = resultSet.getString("reason");
            caseRecordList.add(new CaseRecord(id, id_patient, start, end, reason));
        }
        return caseRecordList;
    }

    @Override
    public boolean deleteCaseRecord(int id) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CaseRecord);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateCaseRecord(CaseRecord caseRecord) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CaseRecord);
        preparedStatement.setInt(1, caseRecord.getIdPatient());
        preparedStatement.setString(2, caseRecord.getStart());
        preparedStatement.setString(3, caseRecord.getEnd());
        preparedStatement.setString(4, caseRecord.getReason());
        preparedStatement.setInt(5, caseRecord.getId());
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public int findMaxId() throws SQLException {
        int id = 0;
        PreparedStatement preparedStatement = connection.prepareStatement("select max(id) as max from case_record");
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            id = resultSet.getInt("max");
        }
        return id;
    }
}
