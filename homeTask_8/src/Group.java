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
    private List tasks = new ArrayList<String>();

    public Group(Student groupLeader) throws Exception {
        if (groupLeader == null){
            throw new Exception("Group can not exist without group leader");
        }
        this.groupLeader = groupLeader;
    }

    public Student getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public List getTasks() {
        return tasks;
    }
    public List<Student> getStudents() {
        return students;
    }

    public void changeGroupLeader(Student newGroupLeader) throws Exception {
        if (newGroupLeader == null){
            throw new Exception("Student can not be the null");
        }
        this.groupLeader = newGroupLeader;
    }
    public void addStudent(Student student) throws Exception {
        if (student == nul) {
            throw new Exception("Student can not be the null");
        }
        this.students.add(student);
    }
    public void removeStudent(Student student) throws Exception {
        if (student == nul) {
            throw new Exception("Student can not be the null");
        }
        if (!this.students.contains(student)){
            throw new Exception("This student does not belong to this group");
        }
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






}
