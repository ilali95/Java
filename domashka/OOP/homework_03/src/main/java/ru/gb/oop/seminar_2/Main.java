package ru.gb.oop.seminar_2;

import ru.gb.oop.seminar_2.controller.Controller;
import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.Teacher;
import ru.gb.oop.seminar_2.data.User;
import ru.gb.oop.seminar_2.service.StudentService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
//        StudentView studentView = new StudentView();

        Controller controller = new Controller();



        controller.createStudent("Ivan", "Ivanov", "Ivanovich");
        controller.createStudent("Petr", "Petrov", "Petrovich");
        controller.createStudent("Aleksandr", "Aleksandrov", "Sanich");
        controller.createStudent("Stepan", "Stepanov", "Stepanich");
        controller.createTeacher("Uch","Uch", "Uch");
        controller.createGroup((Teacher) controller.getTeacherList().get(0),controller.getStudentList());

    }
}