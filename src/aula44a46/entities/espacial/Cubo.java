package aula44a46.entities.espacial;

import aula44a46.entities.DimensaoVolumetrica;
import aula44a46.entities.Figura3D;

public class Cubo extends Figura3D implements DimensaoVolumetrica {
    private double aresta;

    public Cubo(String nome, String cor, double aresta) {
        super(nome, cor);
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(getAresta(), 3);
    }
}
