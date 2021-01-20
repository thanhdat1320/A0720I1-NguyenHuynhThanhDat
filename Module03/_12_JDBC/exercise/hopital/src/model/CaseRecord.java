package model;

public class CaseRecord {
    private int id;
    private int idPatient;
    private String start;
    private String end;
    private String reason;

    public CaseRecord() {
    }

    public CaseRecord(int id, int idPatient, String start, String end, String reason) {
        this.id = id;
        this.idPatient = idPatient;
        this.start = start;
        this.end = end;
        this.reason = reason;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
