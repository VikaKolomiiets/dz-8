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
    private List<Task> completedTasks;

    public Student(String firstName, String lastName) throws Exception {
        this.checkName(lastName);
        this.checkName(firstName);
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
        this.checkName(firstName);
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) throws Exception {
        this.checkName(lastName);
        this.lastName = lastName;
    }

    private void checkName(String name) throws Exception {
        if (name == null || name.length() < 2)
            throw new Exception("Name is invalid: null or length less than 2 letters");
    }
}
