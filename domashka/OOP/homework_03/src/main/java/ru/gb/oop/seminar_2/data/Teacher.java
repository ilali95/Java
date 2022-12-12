package ru.gb.oop.seminar_2.data;

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String lastName, String patronymic, Long teacherId) {
        super(firstName, lastName, patronymic);
        this.teacherId = teacherId;
    }

    public Long getTeacherId() {

        return teacherId;
    }

    public void setTeacherId(Long teacherId) {

        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                "teacherId=" + teacherId +
                '}';
    }
}
