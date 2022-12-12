package ru.gb.oop.seminar_2.service;

import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.Teacher;
import ru.gb.oop.seminar_2.data.User;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements DataService{
    private final List<User> users;

    public TeacherService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User user : this.users) {
            if (user instanceof Teacher) {
                if (id < ((Teacher) user).getTeacherId()) {
                    id = ((Teacher) user).getTeacherId();
                }
            }
        }
        this.users.add(new Teacher(firstName, lastName, patronymic, ++id));

    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User user : this.users) {
            if (user instanceof Teacher) {
                if (id.equals(((Teacher) user).getTeacherId())) {
                    this.users.remove(user);
                }
            }
        }
    }
}
