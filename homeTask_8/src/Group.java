import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
Написати клас, який репрезентує групу студентів з наступними полями:
староста (тип студент)
список студентів (тип студент)
список завдань
Група не може існувати без старости.

Методи класу:
    змінити старосту
    додати/видалити/перейменувати студента,
    додати завдання (для всієї групи)

позначити завдання як виконане (для зазначеного студента)
 */
public class Group {
    private Student groupLeader;
    private List<Student> students = new ArrayList<Student>();
    private List tasks = new ArrayList<Task>();

    public Group(Student groupLeader) throws Exception {
        if (groupLeader == null){
            throw new Exception("Group can not exist without group leader");
        }
        this.students.add(groupLeader);
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public List getTasks() {
        return tasks;
    }


    public void changeGroupLeader(Student newGroupLeader) throws Exception {
        if (newGroupLeader == null){
            throw new Exception("Student can not be the null");
        }
        //todo check for present in group, and what to do?
        this.groupLeader = newGroupLeader;
    }
    public void addStudent(Student student) throws Exception {
        if (student == null) {
            throw new Exception("Student can not be the null");
        }
        //Check Id
        this.students.add(student);
    }
    public void removeStudent(Student student) throws Exception {
        if (student == null) {
            throw new Exception("Student can not be the null");
        }
        if (!this.students.contains(student)){
            throw new Exception("This student does not belong to this group");
        }
        //Check Student != Leader
        this.students.remove(student);
    }
    public Student renameStudent(UUID studentId, String firstName, String lastName) throws Exception {
        for(Student student: this.students){
            if (student.getId() == studentId ) {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                return student;
            }
        }
        throw new Exception();
    }
    public void addTaskForGroup(String task) throws Exception {
        if (task == null) {
            throw new Exception("Task can not be a null");
        }
        this.tasks.add(task);
    }





}
