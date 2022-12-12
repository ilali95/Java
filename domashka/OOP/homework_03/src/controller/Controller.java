package controller;

import Student;
import StudentGroup;
import Teacher;
import User;
import StudentGroupService;
import StudentService;
import TeacherService;
import StudentView;

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
