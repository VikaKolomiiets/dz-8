import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Group {

    //region groupLeader
    private Student groupLeader;

    public Student getGroupLeader() {
        return groupLeader;
    }

    //endregion
    private List<Student> students;
    private List<Task> tasks = new ArrayList<Task>();

    public Group(Student groupLeader) throws Exception {
        if (groupLeader == null) {
            throw new Exception("Group Leader can not be a null");
        }
        this.students = new ArrayList<Student>();
        this.students.add(groupLeader);
        this.groupLeader = groupLeader;
    }

    public void changeGroupLeader(Student newGroupLeader) throws Exception {
        this.checkStudentForNull(newGroupLeader);
        if (!this.students.contains(newGroupLeader)) {
            throw new Exception("Add new Group Leader to this Group");
        }
        this.groupLeader = newGroupLeader;
    }

    public void addStudent(Student student) throws Exception {
        this.checkStudentForNull(student);
        for (Student item : this.students) {
            if (item.getId() == student.getId()) {
                throw new Exception("Student with same Id is existed in the Group");
            }
        }
        this.students.add(student);
    }

    public void removeStudent(Student student) throws Exception {
        this.checkStudentForNull(student);
        if (!this.students.contains(student)) {
            throw new Exception("This student does not belong to this group");
        }
        if (student.getId() == this.groupLeader.getId()) {
            throw new Exception("This Student is the Group Leader, you should change Group Leader before removing current Student");
        }
        this.students.remove(student);
    }

    public Student renameStudent(UUID studentId, String firstName, String lastName) throws Exception {

        for (Student student : this.students) {
            if (student.getId() == studentId) {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                return student;
            }
        }
        throw new Exception("Student with this Id does not exist in this group");
    }

    public void addTaskForGroup(Task task) throws Exception {
        if (task == null) {
            throw new Exception("Task can not be a null");
        }
        this.tasks.add(task);
    }

    private void checkStudentForNull(Student student) throws Exception {
        if (student == null) {
            throw new Exception("Student can not be a null");
        }
    }
}
