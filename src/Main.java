import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create a new AccountHolder with the given details
        AccountHolder johnDoe = new AccountHolder("John", "Doe", LocalDate.of(2000, 1, 1));

        // Set up a new savings account with an initial balance of £1000 and an interest rate of 5%
        LocalDate openingDate = LocalDate.now();
        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 0.05, openingDate);

        // Print the initial balance
        System.out.printf("Initial balance: £%.2f%n", savingsAccount.getBalance());

        // Deposit £1000 into the savings account every year for 10 years
        for (int i = 1; i <= 10; i++) {
            // Deposit the amount and calculate the interest for the next year
            double balanceAfterDeposit = savingsAccount.deposit(1000.0);
            System.out.printf("Year %d: Balance after deposit: £%.2f%n", i, balanceAfterDeposit);
        }
    }
}
