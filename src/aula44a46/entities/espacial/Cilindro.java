package aula44a46.entities.espacial;

import aula44a46.entities.DimensaoVolumetrica;
import aula44a46.entities.Figura3D;

public class Cilindro extends Figura3D implements DimensaoVolumetrica {
    private double raio;
    private double altura;

    public Cilindro(String nome, String cor, double raio, double altura) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (Math.PI * Math.pow(getRaio(), 2)) * getAltura();
    }
}
