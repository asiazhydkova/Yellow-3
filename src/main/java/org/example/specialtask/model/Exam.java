package org.example.specialtask.model;

public class Exam implements ITypeExamination {
	private int grade;
	
	public Exam() {
		
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Exam{" +
				"grade=" + grade +
				'}';
	}
}
