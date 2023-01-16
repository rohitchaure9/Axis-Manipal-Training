package JavaProjectBank;

import java.util.Scanner;

public class Customer implements CustomerInterface {
  Account account;
  String name = "";
  int id = 0;
  String email = "";
  String password = "";
  long phno = 0;
  long cardNo = 0;
  String address = "";

  @Override
  public void addCustomer() {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Customer Id: ");
    this.id = sc.nextInt();
    System.out.println("Enter Customer Name: ");
    this.name = sc.next();
    System.out.println("Enter Customer Email: ");
    this.email = sc.next();
    System.out.println("Enter Customer Password: ");
    this.password = sc.next();
    System.out.println("Enter Customer Phone Number: ");
    this.phno = sc.nextLong();
    System.out.println("Enter Customer Card Number: ");
    this.cardNo = sc.nextLong();
    System.out.println("Enter Customer Address: ");
    this.address = sc.next();
    this.account = new Account().addAccount();
  }

  // @Override
  // public void deleteCustomer(long accountNum) {
  // // TODO Auto-generated method stub

  // }

  @Override
  public void editCustomer() {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("New Customer Id: ");
    this.id = sc.nextInt();
    System.out.println("New Customer Name: ");
    this.name = sc.next();
    System.out.println("New Customer Email: ");
    this.email = sc.next();
    System.out.println("New Customer Password: ");
    this.password = sc.next();
    System.out.println("New Customer Phone Number: ");
    this.phno = sc.nextLong();
    System.out.println("New Customer Card Number: ");
    this.cardNo = sc.nextLong();
    System.out.println("New Customer Address: ");
    this.address = sc.next();
    this.account = new Account().editAccount();
  }

}
