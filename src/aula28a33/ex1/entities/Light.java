package aula28a33.ex1.entities;

public class Light {
    private boolean isOn;

    public Light() {
        isOn = false;
    }

    public void turnOn() {
        if (!isOn) {isOn = true;}
    }

    public void turnOff() {
        if (isOn) {isOn = false;}
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Light is on? ").append(isOn);
        return sb.toString();
    }
}
