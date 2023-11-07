package org.example.specialtask.model;

public class Test implements ITypeExamination {
	private Boolean grade;

	public Test() {
		
	}
	
	public void setGrade(Boolean grade) {
		this.grade = grade;

	}

	public Boolean getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Test{" +
				"grade=" + grade +
				'}';
	}
}
