package service.Impl;

import dao.ICaseRecordDAO;
import dao.impl.CaseRecordDAOImpl;
import model.CaseRecord;
import service.ICaseRecordService;

import java.sql.SQLException;
import java.util.List;

public class CaseRecordServiceImpl implements ICaseRecordService {
    public static ICaseRecordDAO caseRecordDAO = new CaseRecordDAOImpl();

    @Override
    public void saveCaseRecord(CaseRecord caseRecord) throws SQLException {
        caseRecordDAO.saveCaseRecord(caseRecord);
    }

    @Override
    public CaseRecord getCaseRecordById(int id) throws SQLException {
        return caseRecordDAO.getCaseRecordById(id);
    }

    @Override
    public List<CaseRecord> getAllCaseRecord() throws SQLException {
        return caseRecordDAO.getAllCaseRecord();
    }

    @Override
    public boolean deleteCaseRecord(int id) throws SQLException {
        return caseRecordDAO.deleteCaseRecord(id);
    }

    @Override
    public boolean updateCaseRecord(int id, CaseRecord caseRecord) throws SQLException {
        return caseRecordDAO.updateCaseRecord(caseRecord);
    }

    @Override
    public boolean updateCaseRecord(int id, CaseRecord caseRecord, String name) throws SQLException {
        return caseRecordDAO.updateCaseRecord(caseRecord);
    }

    @Override
    public int findMaxId() throws SQLException {
        return caseRecordDAO.findMaxId();
    }
}
