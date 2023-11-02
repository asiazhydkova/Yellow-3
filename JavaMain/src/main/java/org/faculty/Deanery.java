package org.faculty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Deanery {
    private List<Group> groups = new ArrayList<>();


    public void createGroup(String groupName, LocalDate yearOfCreation) {
        groups.add(new Group(groupName, yearOfCreation));
    }


    public void addStudent(String groupName, String firstName, String lastName, int scorebookId) {
        findGroupByName(groupName).addStudent(new Student(firstName, lastName, scorebookId));
    }

    public void removeStudentFromGroup(String groupName, int scorebookId) {
        findGroupByName(groupName).deleteStudent(scorebookId);
    }

    public void addSubjectToStudent(String groupName, int studentId, Exam exam) {
        findGroupByName(groupName).findStudent(studentId).addExam(exam);
    }

    private Group findGroupByName(String groupName) {
        return groups.stream()
                .filter(group -> groupName.equals(group.getGroupName())).findFirst()
                .orElse(null);

    }

}