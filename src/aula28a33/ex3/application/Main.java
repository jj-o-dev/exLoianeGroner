package aula28a33.ex3.application;

import aula28a33.ex3.entities.Course;
import aula28a33.ex3.entities.Discipline;
import aula28a33.ex3.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert student name: ");
        String name = scan.nextLine();
        System.out.print("Insert your registration: ");
        int regist = scan.nextInt();
        scan.nextLine();
        System.out.print("Insert course: ");
        String course = scan.nextLine();
        System.out.print("Insert discipline one: ");
        Discipline discipline1 = new Discipline(scan.nextLine());
        System.out.print("Insert discipline two: ");
        Discipline discipline2 = new Discipline(scan.nextLine());
        System.out.print("Insert discipline three: ");
        Discipline discipline3 = new Discipline(scan.nextLine());
        System.out.print("Insert grade one: ");
        double grade1 = scan.nextDouble();
        System.out.print("Insert grade two: ");
        double grade2 = scan.nextDouble();
        System.out.print("Insert grade three: ");
        double grade3 = scan.nextDouble();

        Student student1 = new Student(name, regist,
                new Course(course, discipline1, discipline2, discipline3), grade1, grade2, grade3);

        System.out.println("\nStudent infos -----------------------");
        System.out.println(student1);

        scan.close();
    }
}
