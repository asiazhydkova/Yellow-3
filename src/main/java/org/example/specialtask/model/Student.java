package org.example.specialtask.model;

public class Student {

	private String firstname;
	private String secondName;
	private String lastName;

	private GradeBook gradeBook;
	private Group group;
	

	public Student(String firstname, String secondName, String lastName, Group group, GradeBook grade) {
		setFirstname(firstname);
		setSecondName(secondName);
		setLastName(lastName);
		setGroup(group);
		setGradeBook(grade);
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public GradeBook getGradeBook() {
		return gradeBook;
	}
	public void setGradeBook(GradeBook gradeBook) {
		this.gradeBook = gradeBook;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", secondName=" + secondName + ", lastName=" + lastName
				+ ", gradeBook=" + gradeBook + ", group=" + group + "]";
	}
	
}
