package org.example.specialtask.Repository;

import java.util.ArrayList;
import java.util.List;

import org.example.specialtask.Model.Group;

public class GroupRepository implements IRepository <Group> {

    private List<Group> groups;

    public GroupRepository() {
        groups = new ArrayList<>();
    }
    @Override
    public List<Group> getAll() {
        return groups;
    }

    public Group getByNumber(String groupNumber) {
        for (Group group : groups) {
            if (group.getNumber().equals(groupNumber)) {
                return group;
            }
        }

        return null;
    }
    @Override
    public void create(Group group) {
        groups.add(group);
    }
    @Override
    public void update(Group group) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getNumber().equals(group.getNumber())) {
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