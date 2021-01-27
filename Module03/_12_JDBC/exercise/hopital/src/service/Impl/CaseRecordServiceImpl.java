package service.Impl;

import dao.ICaseRecordDAO;
import dao.impl.CaseRecordDAOImpl;
import model.CaseRecord;
import model.HospitalDTO;
import model.Patient;
import service.ICaseRecordService;
import service.IPatientService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CaseRecordServiceImpl implements ICaseRecordService {
    private ICaseRecordDAO caseRecordDAO = new CaseRecordDAOImpl();
    private IPatientService patientService = new PatientServiceImpl();

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

    @Override
    public List<HospitalDTO> getListHospital() throws SQLException {
        List<HospitalDTO> hospitalDTOS = new ArrayList<>();

        List<CaseRecord> caseRecordList =  caseRecordDAO.getAllCaseRecord();

        for (CaseRecord caseRecord: caseRecordList) {
            HospitalDTO hospitalDTO = new HospitalDTO();
            hospitalDTO.setId(caseRecord.getId());
            hospitalDTO.setEnd(caseRecord.getEnd());
            hospitalDTO.setReason(caseRecord.getReason());
            hospitalDTO.setStart(caseRecord.getStart());
            hospitalDTO.setIdPatient(caseRecord.getIdPatient());

            Patient patient = this.patientService.getPatientById(caseRecord.getIdPatient());
            hospitalDTO.setName(patient.getName());

            hospitalDTOS.add(hospitalDTO);
        }
        return hospitalDTOS;
    }
}
