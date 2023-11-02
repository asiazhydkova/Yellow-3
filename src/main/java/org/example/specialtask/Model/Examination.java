package org.example.specialtask.Model;

import java.time.LocalDate;

public class Examination {
	private ITypeExamination type;

	private LocalDate actualDate;
	private LocalDate examinationDate;
	
	public Examination(ITypeExamination examenType, LocalDate examinationDate) {
		setType(examenType);
		setExaminationDate(examinationDate);
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

}
