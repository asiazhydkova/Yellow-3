package org.example.specialtask.Repository;

import java.util.ArrayList;
import java.util.List;

import org.example.specialtask.Model.Student;

public class StudentRepository implements IRepository<Student>{
	
    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }
    @Override
    public List<Student> getAll() {
        return students;
    }
    
    public Student getByGradeBookId(String id) {
        for (Student student : students) {
            if (student.getGradeBook().getId() == id) {
                return student;
            }
        }

        return null;
    }
    @Override
    public void create(Student student) {
        students.add(student);
    }
    @Override
    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGradeBook().getId().equals(student.getGradeBook().getId())) {
                students.set(i, student);
                return;
            }
        }
    }
    @Override
    public void delete(Student student) {
        students.remove(student);
    }

}


