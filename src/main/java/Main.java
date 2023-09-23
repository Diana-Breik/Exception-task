public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .name("Diana")
                .subject("Mathe")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        System.out.println(studentService.findByID("aa"));
    }
}
