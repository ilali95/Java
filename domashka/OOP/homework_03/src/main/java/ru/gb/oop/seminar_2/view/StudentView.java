package ru.gb.oop.seminar_2.view;

import ru.gb.oop.seminar_2.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {

    public void sendOnConsole(List<User> users) {
        Logger log = Logger.getLogger(StudentView.class.getName());
        for (User user : users) {
            log.info(user.toString());
        }
    }
}
