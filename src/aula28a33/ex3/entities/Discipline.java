package aula28a33.ex3.entities;

public class Discipline {
    private String name;
    private double minGrade = 7;

    public Discipline(){}

    public Discipline(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }
}
