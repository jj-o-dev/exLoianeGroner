package aula44a46.entities.espacial;

import aula44a46.entities.DimensaoVolumetrica;
import aula44a46.entities.Figura3D;

public class Piramide extends Figura3D implements DimensaoVolumetrica {
    private double ladoBase;
    private double altura;

    public Piramide(String nome, String cor, double ladoBase, double altura) {
        super(nome, cor);
        this.ladoBase = ladoBase;
        this.altura = altura;
    }

    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return (Math.pow(getLadoBase(), 2) * getAltura()) / 3;
    }
}
