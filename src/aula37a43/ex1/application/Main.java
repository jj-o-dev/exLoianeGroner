package aula37a43.ex1.application;

import aula37a43.ex1.entities.ContaEspecial;
import aula37a43.ex1.entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaPoupanca conta1 = new ContaPoupanca("João", 666, 10000);
        ContaEspecial conta2 = new ContaEspecial("Maria Joanna", 123, 1500);

        conta1.sacar(500);
        conta2.sacar(500);

        conta1.depositar(200);
        conta2.depositar(200);
        conta1.calcularNovoSaldo();

        System.out.println(conta1);
        System.out.println(conta2);
    }
}
