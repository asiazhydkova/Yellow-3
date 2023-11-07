package org.example.specialtask.repository;
import java.util.ArrayList;
import java.util.List;

import org.example.specialtask.model.Subject;
public class SubjectRepository implements IRepository<Subject> {

	List<Subject> subjects;
	
	public SubjectRepository() {
		subjects=new ArrayList<>();
	}
	@Override
	public List<Subject> getAll() {
		return subjects;
	}

	@Override
	public void add(Subject entity) {
		subjects.add(entity);
		
	}

	@Override
	public void update(Subject subject) {
		for (int i = 0; i < subjects.size(); i++) {
			if(subjects.get(i).getName()==subject.getName()) {
				subjects.set(i, subject);
			}
		}
	}

	@Override
	public void delete(Subject entity) {
		subjects.remove(entity);
		
	}

}
