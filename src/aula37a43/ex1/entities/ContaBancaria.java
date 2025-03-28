package aula37a43.ex1.entities;

public abstract class ContaBancaria {
    private String nome;
    private int numConta;
    protected double saldo;

    public ContaBancaria(String nome, int numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double quantia) {
        if (saldo - quantia >= 0){
            saldo -= quantia;
        } else {
            System.out.println("Não é possível sacar valores maiores que o saldo!");
        }
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------- DADOS DA CONTA -----------\n");
        sb.append("Nome: ").append(getNome());
        sb.append("\nNum. da conta: ").append(getNumConta());
        sb.append("\nSaldo: $").append(getSaldo());
        return sb.toString();
    }
}
