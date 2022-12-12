import Controller;
import Student;
import Teacher;
import User;
import StudentService;

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