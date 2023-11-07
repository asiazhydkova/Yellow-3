package org.example.specialtask.model;

import java.time.LocalDate;

public class Examination {
	private ITypeExamination type;

	private LocalDate actualDate;
	private LocalDate examinationDate;
	
	public Examination(String examenType, LocalDate examinationDate) {
		handler(examenType);
		setExaminationDate(examinationDate);
	}
	
	public void handler(String hand) {
		switch (hand) {
	    case "Exam":
	        type = new Exam();
	        break;
	    case "Test":
	        type = new Test();
	        break;
	    default:
	    	type = new Test();
	        System.out.print("Input or Exam or Test on default will be test");
	        break;
	}
	}
	
	public ITypeExamination getType() {
		return type;
	}
	public void setType(ITypeExamination type) {
		this.type = type;
	}
	public LocalDate getActualDate() {
		return actualDate;
	}
	public void setActualDate(LocalDate actualDate) {
		this.actualDate = actualDate;
	}
	public LocalDate getExaminationDate() {
		return examinationDate;
	}
	public void setExaminationDate(LocalDate examinationDate) {
		this.examinationDate = examinationDate;
	}

	@Override
	public String toString() {
		return "Examination{" +
				"type=" + type +
				", actualDate=" + actualDate +
				", examinationDate=" + examinationDate +
				'}';
	}
}
