package service;

import model.CaseRecord;
import model.HospitalDTO;

import java.sql.SQLException;
import java.util.List;

public interface ICaseRecordService {
    void saveCaseRecord(CaseRecord caseRecord) throws SQLException;

    CaseRecord getCaseRecordById(int id) throws SQLException;

    List<CaseRecord> getAllCaseRecord() throws SQLException;

    boolean deleteCaseRecord(int id) throws SQLException;

    boolean updateCaseRecord(int id, CaseRecord caseRecord) throws SQLException;

    boolean updateCaseRecord(int id, CaseRecord caseRecord, String name) throws SQLException;

    int findMaxId() throws SQLException;

    List<HospitalDTO> getListHospital()  throws SQLException;
}
