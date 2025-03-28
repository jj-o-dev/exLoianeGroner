package aula44a46.application;

import aula44a46.entities.Figura2D;
import aula44a46.entities.Figura3D;
import aula44a46.entities.FiguraGeometrica;
import aula44a46.entities.espacial.Cilindro;
import aula44a46.entities.espacial.Cubo;
import aula44a46.entities.espacial.Piramide;
import aula44a46.entities.plano.Circulo;
import aula44a46.entities.plano.Quadrado;
import aula44a46.entities.plano.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> listaFiguras = new ArrayList<>();
        listaFiguras.add(new Quadrado("Quadrado", "azul", 5));
        listaFiguras.add(new Triangulo("Triângulo", "verde", 4, 6));
        listaFiguras.add(new Circulo("Circulo", "laranja", 7));
        listaFiguras.add(new Cubo("Cubo", "preto", 6));
        listaFiguras.add(new Piramide("Pirâmide", "rosa", 4, 8));
        listaFiguras.add(new Cilindro("Cilindro", "roxo", 7, 10));

        for (FiguraGeometrica f: listaFiguras) {
            if (f instanceof Figura2D) {
                System.out.println("Área do " + f.getNome() + ": " + ((Figura2D) f).calcularArea() + "\n");
            }
            if (f instanceof Figura3D){
                System.out.println("Volume do " + f.getNome() + ": " + ((Figura3D) f).calcularVolume() + "\n");
            }
        }
    }
}
