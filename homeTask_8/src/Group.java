import java.util.ArrayList;
import java.util.List;

/*
Написати клас, який репрезентує групу студентів з наступними полями:
староста (тип студент)
список студентів (тип студент)
список завдань

Група не може існувати без старости.
 */
public class Group {
    private Student groupLeader;
    List students = new ArrayList<Student>();
    List tasks = new ArrayList<String>();

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






}
