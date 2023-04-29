import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Student {
    //region id
    private UUID id;
    public UUID getId() {
        return id;
    }
    //endregion

    //region firstName
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) throws Exception {
        Guard.checkString(firstName);
        this.firstName = firstName;
    }
    //endregion

    //region lastName
    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) throws Exception {
        Guard.checkString(lastName);
        this.lastName = lastName;
    }
    //endregion

    //region completedTasks
    private List<Task> completedTasks;
    public List<Task> getCompletedTasks() {
        return completedTasks;
    }
    //endregion

    public Student(String firstName, String lastName) throws Exception {
        Guard.checkString(lastName);
        Guard.checkString(firstName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = UUID.randomUUID();
        this.completedTasks = new ArrayList<Task>();
    }
    public void completeTask(Task completedTask) throws Exception {
        if (completedTask == null){
            throw  new Exception("Task can not be a null");
        }
        this.completedTasks.add(completedTask);
    }
}
