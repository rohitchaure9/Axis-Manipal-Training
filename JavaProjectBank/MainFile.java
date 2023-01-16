package JavaProjectBank;

import java.util.Scanner;

// import Bank.java;
// import Customer.java;
// import Transaction.java;
// import Atm.java;
// import Account.java;

public class MainFile {
  Bank BankObj = new Bank();

  public static void main(String args[]) {
    MainFile mainFile = new MainFile();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("---Welcome to Axis Bank---");
      System.out.println(
          "1. Add Customer\n 2.Deposit Money\n 3. Check Balance\n 4. Withdraw Money\n 5. Check Balance\n 6. Get Account Details\n 7. Delete Customer\n 8. Edit Customer\n 9. Delete Account\n 10. Exit");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          Customer customer = new Customer();
          customer.addCustomer();
          mainFile.BankObj.map.put(customer.account.account_no, customer);
          break;

        case 2:
          System.out.println("Enter Account Number: ");
          long accountNo = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo)) {
            Atm atmObj = new Atm();
            mainFile.BankObj.map.replace(accountNo, atmObj.deposit(mainFile.BankObj.map.get(accountNo)));
          } else {
            System.out.println("No account found!");
          }
          break;

        case 3:
          System.out.println("Enter Account Number: ");
          long accountNo1 = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo1)) {
            Atm atmObj = new Atm();
            atmObj.checkBalance(mainFile.BankObj.map.get(accountNo1));
          } else {
            System.out.println("No account found!");
          }
          break;

        case 4:
          System.out.println("Enter Account Number: ");
          accountNo = sc.nextInt();
          if (mainFile.BankObj.map.containsKey(accountNo)) {
            Atm atmObj = new Atm();
            mainFile.BankObj.map.replace(accountNo, atmObj.withdraw(mainFile.BankObj.map.get(accountNo)));
          } else {
            System.out.println("No account found!");
          }
          break;

        case 5:
          System.out.println("Enter Account Number: ");
          accountNo1 = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo1)) {
            Atm atmObj = new Atm();
            atmObj.checkBalance(mainFile.BankObj.map.get(accountNo1));
          } else {
            System.out.println("No account found!");
          }
          break;

        case 6:
          System.out.println("Enter Account Number: ");
          accountNo = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo)) {
            Bank obj = new Bank();
            obj.getAccount(accountNo);
          } else {
            System.out.println("Account not found!");
          }
          break;

        case 7:
          System.out.println("Enter Account Number: ");
          accountNo = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo)) {
            mainFile.BankObj.map.remove(accountNo);
            System.out.println("Account Deleted!");
          } else {
            System.out.println("Account not found!");
          }
          break;

        case 8:
          System.out.println("Enter Account Number: ");
          accountNo = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo)) {
            Customer cust = new Customer();
            cust.editCustomer();
            mainFile.BankObj.map.replace(cust.account.account_no, cust);
          } else {
            System.out.println("Account not found!");
          }
          break;

        case 9:
          System.out.println("Enter Account Number: ");
          accountNo = sc.nextLong();
          if (mainFile.BankObj.map.containsKey(accountNo)) {
            Account acc = new Account();
            acc.deleteAcccount(mainFile.BankObj, accountNo);
          } else {
            System.out.println("Account not found!");
          }

        case 10:
          System.exit(1);

      }
    }
  }
}
