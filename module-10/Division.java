

// Abstract superclass
public abstract class Division {
    private String divisionName;
    private int accountNumber;

    // Requires both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    // Must be overridden by each subclass
    public abstract void display();
}