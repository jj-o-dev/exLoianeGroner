package aula28a33.ex3.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Discipline discipline1;
    private Discipline discipline2;
    private Discipline discipline3;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(String courseName, Discipline discipline1, Discipline discipline2, Discipline discipline3) {
        this.courseName = courseName;
        this.discipline1 = discipline1;
        this.discipline2 = discipline2;
        this.discipline3 = discipline3;
    }

    public Discipline getDiscipline1() {
        return discipline1;
    }

    public void setDiscipline1(Discipline discipline1) {
        this.discipline1 = discipline1;
    }

    public Discipline getDiscipline2() {
        return discipline2;
    }

    public void setDiscipline2(Discipline discipline2) {
        this.discipline2 = discipline2;
    }

    public Discipline getDiscipline3() {
        return discipline3;
    }

    public void setDiscipline3(Discipline discipline3) {
        this.discipline3 = discipline3;
    }
}
