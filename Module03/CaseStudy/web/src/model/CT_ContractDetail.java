package model;

public class CT_ContractDetail {
    private int id;
    private int idContract;
    private int idServiceInclude;
    private int amount;

    public CT_ContractDetail() {
    }

    public CT_ContractDetail(int id, int idContract, int idServiceInclude, int amount) {
        this.id = id;
        this.idContract = idContract;
        this.idServiceInclude = idServiceInclude;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public int getIdServiceInclude() {
        return idServiceInclude;
    }

    public void setIdServiceInclude(int idServiceInclude) {
        this.idServiceInclude = idServiceInclude;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
