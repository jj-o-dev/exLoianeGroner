package aula28a33.ex2.entities;

public class CheckingAccount {
    private static int counter = 1;
    private int number;
    private double balance;
    private boolean specialType;
    private double limit;

    public CheckingAccount(double balance, boolean specialType) {
        number = CheckingAccount.counter++;
        this.balance = balance;
        this.specialType = specialType;
        this.limit = balance * 75/100;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
        limit = balance * 75/100;
    }

    public void changeType() {
        specialType = !specialType;
    }

    public void withDraw(double amount) {
        if (amount > limit || balance <= 0) {
            System.out.println("You can't withdraw!");
        }
        else {
            setBalance(getBalance() - amount);
            System.out.println("\nWithdraw done\n");
        }
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account info --------------------------------\n");
        sb.append("Account number: ").append(number).append("\n");
        sb.append("Actual balance: ").append(getBalance()).append("\n");
        sb.append("Special: ");
        if (specialType) {sb.append("Yes\n");} else {sb.append("No\n");}
        sb.append("Actual limit: ").append(limit).append("\n");
        sb.append("---------------------------------------------\n");
        return sb.toString();
    }
}
