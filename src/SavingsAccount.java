import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    private LocalDate lastInterestCalculatedDate;

    public SavingsAccount(double initialBalance, double interestRate, LocalDate openingDate) {
        super(initialBalance);
        this.interestRate = interestRate;
        this.lastInterestCalculatedDate = openingDate;
    }

    /**
     * Calculates the interest earned by the savings account up to the specified date.
     *
     * @param currentDate the date up to which the interest should be calculated
     * @return the interest earned by the savings account up to the specified date
     */
    @Override
    public double calculateInterest(LocalDate currentDate) {
        long numYears = ChronoUnit.YEARS.between(lastInterestCalculatedDate, currentDate);
        if (numYears > 0) {
            double interest = getBalance() * (Math.pow(1 + interestRate, numYears) -1);
            lastInterestCalculatedDate = currentDate;
            return interest;
        }
        return 0;
    }

    /**
     * Deposits the specified amount into the savings account and calculates the interest.
     *
     * @param amount the amount to deposit
     * @return the new balance of the savings account
     */
    @Override
    public double deposit(double amount) {
        LocalDate currentDate = lastInterestCalculatedDate.plusYears(1);
        double interest = calculateInterest(currentDate);
        double newBalance1 = getBalance() + interest;
        double newBalance= newBalance1 + amount;
        setBalance(newBalance);
        lastInterestCalculatedDate = currentDate;
        return newBalance;
    }
}
