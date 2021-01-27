package dao;

import model.CaseRecord;

import java.sql.SQLException;
import java.util.List;

public interface ICaseRecordDAO {
    void saveCaseRecord(CaseRecord caseRecord) throws SQLException;

    CaseRecord getCaseRecordById(int id) throws SQLException;

    List<CaseRecord> getAllCaseRecord() throws SQLException;

    boolean deleteCaseRecord(int id) throws SQLException;

    boolean updateCaseRecord(CaseRecord caseRecord) throws SQLException;

    int findMaxId() throws SQLException;
}
