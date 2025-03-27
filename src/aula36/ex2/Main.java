package aula36.ex2;

import java.time.LocalTime;
import java.util.Scanner;

import static aula36.ex2.Curso.format;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira o nome do curso: ");
        String nomeCurso = scan.nextLine();
        System.out.print("A que horas começa (hh:mm)? ");
        LocalTime horarioCurso = LocalTime.parse(scan.nextLine(), format);
        System.out.println("Insira as informações do professor:");
        System.out.print("Nome: ");
        String nomeProf = scan.nextLine();
        System.out.print("Departamento: ");
        String deptProf = scan.nextLine();
        System.out.print("Email: ");
        String emailProf = scan.nextLine();

        Curso curso = new Curso(nomeCurso, horarioCurso, new Professor(nomeProf, deptProf, emailProf));

        System.out.print("Quantos alunos deseja adicionar? ");
        int num = scan.nextInt();

        scan.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("\nAluno #" + (i+1));
            System.out.print("Nome: ");
            String nomeAluno = scan.nextLine();
            System.out.print("Matrícula: ");
            String matriAluno = scan.nextLine();
            System.out.print("Nota 1: ");
            int nota1 = scan.nextInt();
            System.out.print("Nota 2: ");
            int nota2 = scan.nextInt();
            System.out.print("Nota 3: ");
            int nota3 = scan.nextInt();
            System.out.print("Nota 4: ");
            int nota4 = scan.nextInt();

            curso.addAluno(new Aluno(nomeAluno, matriAluno, nota1, nota2, nota3, nota4));
            scan.nextLine();
        }

        System.out.println("\nMédia de cada aluno ----------------");
        for (Aluno aluno: curso.getAlunos()) {
            System.out.print(aluno.getNome() + ", " + aluno.media());
            if (aluno.media() >= 7) {
                System.out.println("| Aprovado");
            } else {
                System.out.println("| Reprovado");
            }
        }
        System.out.println("\nMédia da turma:");
        System.out.println(curso.mediaTurma());

        scan.close();
    }
}
