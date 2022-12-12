package ru.gb.oop.seminar_2.data;

import java.util.List;

public class StudentGroup {
    private List<Student> students;
    private Teacher teacher;

    private Long groupId;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                ", teacher=" + teacher +
                ", groupId=" + groupId +
                '}';
    }
}
