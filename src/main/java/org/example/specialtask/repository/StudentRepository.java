package org.example.specialtask.repository;

import java.util.ArrayList;
import java.util.List;

import org.example.specialtask.model.Student;

public class StudentRepository implements IRepository<Student>{
	
    private List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }
    

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void add(Student student) {
        students.add(student);
    }
    @Override
    public void update(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGradeBook().getId()==(student.getGradeBook().getId())) {
                students.set(i, student);
                return;
            }
        }
    }
    @Override
    public void delete(Student student) {
        students.remove(student);
    }

	public Student getById(int Id) {
		for (Student student : students) {
            if (student.getGradeBook().getId() == Id) {
                return student;
            }
        }
		return null;
	}

}


