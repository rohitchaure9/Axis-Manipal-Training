package JavaProjectBank;

import java.util.Scanner;

public class Atm implements ATMInterface {

  @Override
  public Customer deposit(Customer customer) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your deposit number: ");
    float amount = sc.nextFloat();
    customer.account.account_balance = customer.account.account_balance + amount;
    System.out.println(customer.account.account_balance);
    Transaction transaction = new Transaction();
    transaction.addTransaction("deposit", amount, customer.account.account_balance);
    customer.account.transaction.add(transaction);
    return customer;

  }

  @Override
  public Customer withdraw(Customer customer) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your card number: ");
    long cardNo = sc.nextLong();
    System.out.println("Enter your Pin: ");
    String pin = sc.next();
    if (cardNo == customer.cardNo && pin == customer.password) {
      System.out.println("Enter your withdraw amount: ");
      float amount = sc.nextFloat();
      if (amount < customer.account.account_balance && (customer.account.account_balance - amount > 10000)) {
        System.out.println("Collect your amount.");
        customer.account.account_balance = customer.account.account_balance - amount;
        System.out.println("Current Balance: " + customer.account.account_balance);
        Transaction transaction = new Transaction();
        transaction.addTransaction("Withdraw", amount, customer.account.account_balance);
        customer.account.transaction.add(transaction);
      } else {
        System.out.println("Insufficient funds!");
      }
    } else {
      System.out.println("Wrong Credentials!");
    }
    return customer;
  }

  @Override
  public void checkBalance(Customer customer) {
    // TODO Auto-generated method stub
    System.out.println("Your current account balance is: " + customer.account.account_balance);
    Transaction transaction = new Transaction();
    transaction.addTransaction("Check Balance", 0, customer.account.account_balance);
    customer.account.transaction.add(transaction);
  }

}
