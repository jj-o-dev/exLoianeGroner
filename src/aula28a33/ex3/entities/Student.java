package aula28a33.ex3.entities;

public class Student {
    private String name;
    private int registration;
    private Course course;
    private double firstGrade;
    private double secondGrade;
    private double thirdGrade;

    public Student() {}

    public Student(String name, int registration, Course course,
                   double firstGrade, double secondGrade, double thirdGrade) {
        this.name = name;
        this.registration = registration;
        this.course = course;
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.thirdGrade = thirdGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getThirdGrade() {
        return thirdGrade;
    }

    public void setThirdGrade(double thirdGrade) {
        this.thirdGrade = thirdGrade;
    }

    public boolean isApprovedIn(double grade, double minimum) {
        return grade >= minimum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student name: ").append(name);
        sb.append("\nRegistration: ").append(registration);
        sb.append("\nCourse: ").append(course.getCourseName());
        sb.append("\nDisciplines: \n");
        sb.append(course.getDiscipline1().getName()).append(course.getDiscipline1().getMinGrade()).append("\n");
        sb.append(course.getDiscipline2().getName()).append(course.getDiscipline2().getMinGrade()).append("\n");
        sb.append(course.getDiscipline3().getName()).append(course.getDiscipline3().getMinGrade());
        sb.append("\ngrade 1: ").append(firstGrade).append(" approved? ")
                .append(isApprovedIn(firstGrade, course.getDiscipline1().getMinGrade()));
        sb.append("\ngrade 2: ").append(secondGrade).append(" approved? ")
                .append(isApprovedIn(secondGrade, course.getDiscipline2().getMinGrade()));
        sb.append("\ngrade 3: ").append(thirdGrade).append(" approved? ")
                .append(isApprovedIn(thirdGrade, course.getDiscipline3().getMinGrade()));
        return sb.toString();
    }
}
