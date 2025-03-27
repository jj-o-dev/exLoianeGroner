package aula36.ex1.application;

import aula36.ex1.entities.Agenda;
import aula36.ex1.entities.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual o nome da agenda? ");
        String nome = scan.nextLine();
        Agenda agenda = new Agenda(nome);

        System.out.print("Quantos contatos deseja inserir: ");
        int num = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Insira contato #" + (i+1));
            System.out.print("Nome: ");
            String nomeContato = scan.nextLine();
            System.out.print("Número: ");
            String numContato = scan.nextLine();
            System.out.print("Email: ");
            String emailContato = scan.nextLine();

            agenda.addContato(new Contato(nomeContato, numContato, emailContato));
        }

        System.out.println();
        System.out.println(agenda.showContatos());

        scan.close();
    }
}
