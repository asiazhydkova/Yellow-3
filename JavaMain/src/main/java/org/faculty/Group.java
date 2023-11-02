package org.faculty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Group {
    private String groupName;
    private LocalDate yearOfCreation;
    private List<Student> students = new ArrayList<>();

    public Group(String groupName, LocalDate yearOfCreation) {
        this.groupName = groupName;
        this.yearOfCreation = yearOfCreation;
    }

    public void addStudent(Student student) {
        int newScorebookId = student.getScorebookId();
        boolean studentExist = false;
        for (Student existingStudent : students) {
            if (existingStudent.getScorebookId() == newScorebookId) {
                studentExist = true;
            }
        }
        if(studentExist == false){
            students.add(student);
        }
    }

    public void deleteStudent(int studentId) {
        students.removeIf(student -> student.getScorebookId() == studentId);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public LocalDate getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(LocalDate yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public Student findStudent(int scorebookId) {
        for (Student student : students) {
            if (student.getScorebookId() == scorebookId) {
                return student;
            }
        }
        return null;
    }

}