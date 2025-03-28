package aula44a46.entities.plano;

import aula44a46.entities.DimensaoSuperficial;
import aula44a46.entities.Figura2D;

public class Circulo extends Figura2D implements DimensaoSuperficial {
    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }
}
