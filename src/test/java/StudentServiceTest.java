import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @org.junit.jupiter.api.Test
    void findByIdUnvalidId() {
        //GIVEN
        StudentService studentService = new StudentService();
        String nonExistingId = "999-abc";


        //THEN
        assertThrows(IllegalArgumentException.class,
                //WHEN
                () -> studentService.findByID(nonExistingId));

    }

    @Test
    void findById_validId() {
        //GIVEN
        StudentService studentService = new StudentService();
        Student newStudent = new Student(null, "TestName", "TestSubject");

        Student savedStudent = studentService.addNewStudent(newStudent);

        //WHEN
        Student actual = studentService.findByID(savedStudent.id());

        //THEN
        Student expected = new Student(savedStudent.id(), "TestName", "TestSubject");
        assertEquals(expected, actual);
    }
}
