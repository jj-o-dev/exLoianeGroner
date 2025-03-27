package aula36.ex1.entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private String nome;
    private List<Contato> contatos = new ArrayList<>();

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addContato(Contato contato) {
        contatos.add(contato);
    }

    public String printContato(String nomeContato){
        for (Contato c: contatos) {
            if (c.getNome().equals(nomeContato)) {
                return c.getNome() + c.getNumero() + c.getEmail();
            }
        }
        return "Contato com nome " + nomeContato + " não encontrado.";
    }

    public String showContatos() {
        StringBuilder sb = new StringBuilder();
        for (Contato c: contatos) {
            sb.append(c.getNome()).append(" ").append(c.getNumero())
                    .append(" ").append(c.getEmail()).append("\n");
        }
        return sb.toString();
    }
}
