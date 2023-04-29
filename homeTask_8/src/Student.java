import java.util.UUID;
/*
Написати мінімальний клас студент, який має: ідентифікатор студента (тобто, унікальний), ім'я, прізвище.
 */
public class Student {
    private UUID id;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception {
        if(firstName.length() < 2) throw new Exception("First name must contain more than one letter");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws Exception {
        if(lastName.length() < 2) throw new Exception("Last name must contain more than one letter");
        this.lastName = lastName;
    }
}
