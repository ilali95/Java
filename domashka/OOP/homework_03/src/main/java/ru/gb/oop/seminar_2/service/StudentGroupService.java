package ru.gb.oop.seminar_2.service;

import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.Teacher;
import ru.gb.oop.seminar_2.data.User;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService{
    private final List<User> group;

    public StudentGroupService() {
        this.group = new ArrayList<>();
    }

    public void createGroup(Teacher teacher,List<User> students) {
        this.group.add(teacher);
        for (User user : students){
            if (user instanceof Student){
                this.group.add(user);
            }
        }
    }


    public List<User> getAll() {

        return this.group;
    }


    public void deleteUserFromGroup(Long id) {

    }

    @Override
    public String toString() {
        return "StudentGroupService{" +
                "group=" + group +
                '}';
    }
}
