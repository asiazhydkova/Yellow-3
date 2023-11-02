package org.faculty;

import java.util.Date;

class Exam {
private String subject;
private boolean isTest;
private Date examDate;
private int grade;
private boolean pass;
private Date dateOfGrade;

public Exam(String subject, boolean isTest, Date examDate, int grade, boolean pass, Date dateOfGrade) {
        this.subject = subject;
        this.isTest = isTest;
        this.examDate = examDate;
        this.grade = grade;
        this.pass = pass;
        this.dateOfGrade = dateOfGrade;
        }

        }