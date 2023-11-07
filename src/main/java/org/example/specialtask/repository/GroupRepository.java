package org.example.specialtask.repository;
import java.util.ArrayList;
import java.util.List;

import org.example.specialtask.model.Group;

public class GroupRepository implements IRepository <Group> {

    private List<Group> groups;

    public GroupRepository() {
        groups = new ArrayList<>();
    }
   
    @Override
    public List<Group> getAll() {
        return groups;
    }

    public Group getByNameAndNumber(String groupName, String groupNumber) {
        for (Group group : groups) {
            if (group.getNumber().equals(groupNumber) && (group.getName().equals(groupName))) {
                return group;
            }
        }

        return null;
    }
    
    @Override
    public void add(Group group) {
        groups.add(group);
    }
    @Override
    public void update(Group group) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getNumber() == group.getNumber() && groups.get(i).getName() == group.getName()) {
                groups.set(i, group);
                return;
            }
        }
    }
    @Override
    public void delete(Group group) {
    	
        groups.remove(group);
    }
	
}