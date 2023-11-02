package org.faculty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Student {
    private String lastName;
    private String firstName;
    private int scorebookId;
    private Group group;
    private List<Exam> exams = new ArrayList<>();

    public Student(String lastName, String firstName, int scorebookId) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.scorebookId = scorebookId;
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getScorebookId() {
        return scorebookId;
    }

    public void setScorebookId(int scorebookId) {
        this.scorebookId = scorebookId;
    }
}