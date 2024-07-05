package org.example;

/**
 * Hello world!
 *
 */
public class Bank
{
    //instance fields
    private CheckingAccount accountOne;
    private CheckingAccount accountTwo;


    //constructor
    public Bank(){
        accountOne = new CheckingAccount("Bob", 15000, "1");
        accountTwo = new CheckingAccount("Jolie", 20300, "2");
    }


    public static void main( String[] args )
    {
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.getBalance());

        bankOfGods.accountOne.setBalance(5000);
        System.out.println(bankOfGods.accountOne.getBalance());
        System.out.println(bankOfGods.accountOne.getMonthlyInterest());
    }
}
