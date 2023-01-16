package JavaProjectBank;

import java.util.ArrayList;
import java.util.Scanner;

public class Account implements AccountInterface {
  ArrayList<Transaction> transaction = new ArrayList<Transaction>();
  long account_no = 0;
  float account_balance = 0;
  String account_Type = "";

  @Override
  public Account addAccount() {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account Number: ");
    this.account_no = sc.nextLong();
    System.out.println("Enter Account Balanced: ");
    this.account_balance = sc.nextFloat();
    System.out.println("Enter Account Type: ");
    this.account_Type = sc.next();
    return this;
  }

  @Override
  public void deleteAcccount(Bank bank, long accountNum) {
    // TODO Auto-generated method stub
    // bank.map.get(accountNum).account = null;
    bank.customers.add(bank.map.get(accountNum));
    bank.map.remove(accountNum);
  }

  @Override
  public void searchAccount() {
    // TODO Auto-generated method stub
    System.out.println("Account Number: " + this.account_no);
    System.out.println("Account Balance: " + this.account_balance);
    System.out.println("Account Type: " + this.account_Type);

  }

  @Override
  public Account editAccount() {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("New Account Number: ");
    this.account_no = sc.nextLong();
    System.out.println("New Account Balanced: ");
    this.account_balance = sc.nextFloat();
    System.out.println("New Account Type: ");
    this.account_Type = sc.next();
    return this;

  }

  public void Transaction() {
    for (Transaction obj : transaction) {
      System.out.println(obj.transactionDate);
      System.out.println(obj.transactionType);
      System.out.println(obj.transationAmount);
      System.out.println(obj.currentBalance);
      System.out.println("-----------------------");
    }
  }

}
