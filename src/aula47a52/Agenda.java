package aula47a52;

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

    public String showContato(int id) {
        for (Contato c: contatos) {
            if (c.getId() == id) {
                return c.toString();
            }
        }
        return null;
    }

    public String showContato(String nome) {
        for (Contato c: contatos) {
            if (c.getNome().equals(nome)) {
                return c.toString();
            }
        }
        return null;
    }

}
