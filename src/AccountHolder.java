import java.time.LocalDate;

public class AccountHolder implements Person {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public AccountHolder(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    // Implement other methods from the Person interface if necessary
}
