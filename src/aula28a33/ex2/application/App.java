package aula28a33.ex2.application;

import aula28a33.ex2.entities.CheckingAccount;

public class App {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount(500, false);
        CheckingAccount account2 = new CheckingAccount(2000, true);

        account1.deposit(500);
        account2.withDraw(250);
        account1.changeType();
        account2.changeType();

        System.out.println(account1);
        System.out.println(account2);
    }
}
