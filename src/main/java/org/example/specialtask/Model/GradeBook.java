package org.example.specialtask.Model;

import java.util.List;

public class GradeBook {
	private String id;
	
	private List<Subject> subjects;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
}
