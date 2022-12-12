package ru.gb.oop.seminar_2.service;

import ru.gb.oop.seminar_2.data.User;

import java.util.List;

public interface DataService {
    void createUser(String firstName, String lastName, String patronymic);

    List<User> getAll ();

    void deleteUser(Long id);

}
