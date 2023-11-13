package org.example.lab_03.hw_03;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    static final String path = "src/main/resources/Students.txt";

    static BufferedReader arrayStudents() {
        BufferedReader buffread = null;
        try {
            buffread = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        return buffread;
    }

    @Test
    void addStudents() throws IOException {
        BufferedReader br = arrayStudents();

        List<Student> list = new LinkedList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            list.add(new Student(s[0], Integer.parseInt(s[1])));
        }
        br.close();

        assertEquals(27, list.size());

    }

    @Test
    void outputListByCourse() throws IOException {
        BufferedReader br = arrayStudents();

        List<Student> list = new LinkedList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            list.add(new Student(s[0], Integer.parseInt(s[1])));
        }
        br.close();

        assertEquals(6, Student.printStudents(list,3).size());
    }

    @Test
    void compareByName() throws IOException {

        String expected = "Student{name='Aidan', course=2}\n" +
                "Student{name='Andriy', course=1}\n" +
                "Student{name='Antonio', course=1}\n" +
                "Student{name='Blake', course=3}\n" +
                "Student{name='Brian', course=3}\n" +
                "Student{name='Claude', course=4}";


        BufferedReader br = arrayStudents();

        List<Student> list = new LinkedList<>();

        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            list.add(new Student(s[0], Integer.parseInt(s[1])));
        }
        br.close();
        list.sort(new Student.compareByName());

        String actual = list.stream().limit(6).map(String::valueOf).collect(Collectors.joining("\n"));
        assertEquals(expected,actual);
    }

}