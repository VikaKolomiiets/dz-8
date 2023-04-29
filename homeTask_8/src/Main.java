public class Main {
    public static void main(String[] args) throws Exception {

        Student firstStudent = new Student("Mark", "Horn");
        Student secondStudent = new Student("Hanna", "Chong");
        Student thirdStudent = new Student("Oo", "Dack");
        Student forthStudent = new Student("Le", "Dacorta");

        Group group = new Group(new Student("Iryna", "Shtern"));
        group.addStudent(firstStudent);
        group.addStudent((secondStudent));
        group.addStudent(thirdStudent);
        group.addStudent(forthStudent);
        Task firstTask = new Task("Read new book every week");
        Task secondTask = new Task("Do the morning exercises");
        Task thirdTask = new Task("Go to bad in 10 p.m.");
        group.addTaskForGroup(firstTask);
        group.addTaskForGroup(secondTask);
        group.addTaskForGroup(thirdTask);
        thirdStudent.completeTask(secondTask);
        thirdStudent.completeTask(thirdTask);

        System.out.println(group.getGroupLeader().getFirstName());
        group.changeGroupLeader(secondStudent);
        System.out.println(group.getGroupLeader().getFirstName()  + " " + group.getGroupLeader().getLastName());
        for(Task task: thirdStudent.getCompletedTasks()){
            System.out.println(task.getDescription());
        }
    }
}