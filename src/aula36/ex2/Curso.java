package aula36.ex2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    public static DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
    private LocalTime horario;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, LocalTime horario, Professor professor) {
        this.nome = nome;
        this.horario = horario;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public double mediaTurma() {
        double total = 0;

        for (Aluno a: alunos) {
            total += a.getNota1() + a.getNota2() + a.getNota3() + a.getNota4();
        }
        return total / alunos.size();
    }
}
