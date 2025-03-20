package aula28a33.ex1.application;

import aula28a33.ex1.entities.Light;

public class App {
    public static void main(String[] args) {
        Light light1 = new Light();
        Light light2 = new Light();

        light1.turnOn();
        light2.turnOn();
        light1.turnOff();

        System.out.println(light1);
        System.out.println(light2);
    }
}
