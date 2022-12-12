package ru.gb.oop.seminar_2.controller;

import ru.gb.oop.seminar_2.data.Student;
import ru.gb.oop.seminar_2.data.StudentGroup;
import ru.gb.oop.seminar_2.data.Teacher;
import ru.gb.oop.seminar_2.data.User;
import ru.gb.oop.seminar_2.service.StudentGroupService;
import ru.gb.oop.seminar_2.service.StudentService;
import ru.gb.oop.seminar_2.service.TeacherService;
import ru.gb.oop.seminar_2.view.StudentView;

import java.util.List;

public class Controller {

    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    private final TeacherService teacherService = new TeacherService();

    private final StudentGroupService studentGroupService = new StudentGroupService();



    public void createStudent(String firstName, String lastName, String patronymic) {
        studentService.createUser(firstName, lastName, patronymic);
        List<User> students = studentService.getAll();
        studentView.sendOnConsole(students);
    }

    public void createTeacher (String firstName, String lastName, String patronymic){
        teacherService.createUser(firstName, lastName, patronymic);
        List<User> teachers = teacherService.getAll();
        studentView.sendOnConsole(teachers);
    }
    public List<User> getStudentList(){
        return studentService.getAll();
    }

    public List<User> getTeacherList(){
        return teacherService.getAll();
    }

    public void createGroup(Teacher teacher, List<User> students){
        studentGroupService.createGroup(teacher,students);
        List<User> group = studentGroupService.getAll();
        studentView.sendOnConsole(group);
    }
}
