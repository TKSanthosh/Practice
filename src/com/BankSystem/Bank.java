package com.BankSystem;

public class Bank {
    private String name;
    private int accountNumber;
    private int balance;
    Bank(String name, int accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void addAmount(int amount){
        balance+= amount;
    }
    void withdraw(int amount){
        if(balance > amount)
            balance-=amount;
        else{
            System.out.println("Your balance is "+balance+". Try less amount than this");
        }
    }
    void showBalance(){
        System.out.println(balance);
    }
}
class BankRunner{
    public static void main(String[] args) {
        Bank person1 = new Bank("santhosh",1234,12000);
        person1.addAmount(1900);
        person1.showBalance();
        person1.withdraw(14000);

    }
}