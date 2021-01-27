package model;

public class HospitalDTO {
    private int id;
    private int idPatient;
    private String name;
    private String start;
    private String end;
    private String reason;

    public HospitalDTO() {
    }

    public HospitalDTO(int id, int idPatient, String name, String start, String end, String reason) {
        this.id = id;
        this.idPatient = idPatient;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
