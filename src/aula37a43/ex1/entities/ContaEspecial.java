package aula37a43.ex1.entities;

public final class ContaEspecial extends ContaBancaria {
    private double limite;

    public ContaEspecial(String nome, int numConta, double saldo) {
        super(nome, numConta, saldo);
        setLimite(saldo * 0.75);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(double quantia) {
        if (quantia <= getLimite()){
            super.sacar(quantia);
        } else {
            System.out.println("Você ultrapassou o limite de saque!");
        }
        setLimite(saldo * 0.75);
    }

    @Override
    public void depositar(double quantia) {
        super.depositar(quantia);
        setLimite(saldo * 0.75);
    }

    @Override
    public String toString() {
        return super.toString() + "\nLimite: 75% do saldo atual | " + getLimite();
    }
}
