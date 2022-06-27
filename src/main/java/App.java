import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = CRUDUtils.getStudentData("SELECT + FROM students");
        System.out.println(students);

        Student student = new Student();
        student.setName("Name");
        student.setSurname("Surname");
        student.setCourse_name("Java");
        System.out.println(CRUDUtils.saveStudent(student));

        System.out.println(CRUDUtils.updateStudent(1, "Cpp"));

        CRUDUtils.deleteStudent(1);
    }
}
