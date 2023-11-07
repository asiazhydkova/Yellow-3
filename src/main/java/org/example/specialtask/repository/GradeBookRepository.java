package org.example.specialtask.repository;

import java.util.ArrayList;
import java.util.List;
import org.example.specialtask.model.GradeBook;

public class GradeBookRepository implements IRepository<GradeBook> {
	List<GradeBook> gradeBooks;
	
	public GradeBookRepository() {
		gradeBooks=new ArrayList<>();
	}
	
	@Override
	public List<GradeBook> getAll() {
		return gradeBooks;
	}

	@Override
	public void add(GradeBook entity) {
		gradeBooks.add(entity);
		
	}

	@Override
	public void update(GradeBook entity) {
		for(int i=0;i<gradeBooks.size();++i) {
			if(gradeBooks.get(i).getId()==entity.getId()){
				gradeBooks.set(i, entity);
			}
		}
		
	}

	@Override
	public void delete(GradeBook entity) {
		gradeBooks.remove(entity);
		
		
	}

	

}
