package aula44a46.entities.plano;

import aula44a46.entities.DimensaoSuperficial;
import aula44a46.entities.Figura2D;

public class Quadrado extends Figura2D implements DimensaoSuperficial {
    private double lado;

    public Quadrado(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(getLado(), 2);
    }
}
