package JavaProjectBank;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank implements BankInterface {
  // Account account;
  HashMap<Long, Customer> map = new HashMap<Long, Customer>();
  ArrayList<Customer> customers = new ArrayList<Customer>();

  @Override
  public void getAccount(long accountNum) {
    // TODO Auto-generated method stub
    System.out.println("Customer Id: " + this.map.get(accountNum).id);
    System.out.println("Customer Name: " + this.map.get(accountNum).name);
    System.out.println("Customer Email: " + this.map.get(accountNum).email);
    System.out.println("Customer Password: " + this.map.get(accountNum).password);
    System.out.println("Customer Phone Number: " + this.map.get(accountNum).phno);
    System.out.println("Customer Card Number: " + this.map.get(accountNum).cardNo);
    System.out.println("Customer Address: " + this.map.get(accountNum).address);
    this.map.get(accountNum).account.searchAccount();
  }

}
