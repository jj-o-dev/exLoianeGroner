package aula37a43.ex1.entities;

public final class ContaPoupanca extends ContaBancaria{
    private double rendimentoDia;

    public ContaPoupanca(String nome, int numConta, double saldo) {
        super(nome, numConta, saldo);
        rendimentoDia = 0.01;
    }

    public double getRendimentoDia() {
        return rendimentoDia;
    }

    public void setRendimentoDia(double rendimentoDia) {
        this.rendimentoDia = rendimentoDia;
    }

    public void calcularNovoSaldo() {
        saldo += saldo * getRendimentoDia();
    }

    @Override
    public String toString() {
        return super.toString() + "\nRendimento por dia: 1%";
    }
}
