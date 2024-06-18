import java.time.LocalDate;
public abstract class BankAccount {
    private double balance;
    private LocalDate openingDate;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.openingDate = LocalDate.now();
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    protected void setOpeningDate(LocalDate openingDate) {
        this.openingDate = openingDate;
    }

    public abstract double calculateInterest(LocalDate currentDate);

    public abstract double deposit(double amount);
}

