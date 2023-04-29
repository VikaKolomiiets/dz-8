import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/*
Написати мінімальний клас студент, який має: ідентифікатор студента (тобто, унікальний), ім'я, прізвище.
 */
public class Student {
    private UUID id;
    private String firstName;
    private String lastName;
    private List completedTasks;

    public Student(String firstName, String lastName) throws Exception {
        if (lastName == null || lastName.length() < 2)
            throw new Exception("Last name must contain more than one letter");
        if (firstName == null || firstName.length() < 2 )
            throw new Exception("Last name must contain more than one letter");
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = UUID.randomUUID();
        this.completedTasks = new ArrayList<Task>();
    }

    public UUID getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) throws Exception {
        if(firstName.length() < 2 || firstName == null)
            throw new Exception("First name must contain more than one letter");
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) throws Exception {
        if(lastName.length() < 2)
            throw new Exception("Last name must contain more than one letter");
        this.lastName = lastName;
    }

}
