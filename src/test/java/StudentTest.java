import org.example.homeworkcollections.NameComparator;
import org.example.homeworkcollections.Student;
import org.example.homeworkcollections.StudentFormatter;
import org.example.homeworkcollections.StudentSorter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentGetName() {
        Student student = new Student("John",1);
        String expected="John";
        String actual=student.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testStudentGetCourse() {
        Student student = new Student("Jane",1);
        Integer expected=1;
        Integer actual=student.getCourse();

        assertEquals(expected, actual);
    }
    @Test
    public void testStudentPrintByCourse3(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3));
        students.add(new Student("Ive", 4));
        students.add(new Student("Oleg", 3));

        String expected="Name: Alice\nName: Oleg";

        String actual= StudentFormatter.getStudentsByCourse(students, 3);

        assertEquals(expected, actual);
    }

    @Test
    public void testStudentSorterByName() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", 1));
        students.add(new Student("David", 2));
        students.add(new Student("Ive", 3));

        StudentSorter.sortStudents(students, new NameComparator());

        List<String> expectedOrder = List.of("David", "Ive", "Oleg");


        for (int i = 0; i < students.size(); i++) {
            assertEquals(expectedOrder.get(i), students.get(i).getName());
        }
    }
    @Test
    public void testStudentSorterByCourse() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", 3));
        students.add(new Student("David", 1));
        students.add(new Student("Ive", 1));

        StudentSorter.sortStudents(students, new NameComparator());

        List<Integer> expectedOrder = List.of(1, 1, 3);

        for (int i = 0; i < students.size(); i++) {
            assertEquals(expectedOrder.get(i), students.get(i).getCourse());
        }
    }
}