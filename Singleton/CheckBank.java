package Singleton;

public class CheckBank {

  public static void main(String[] args) {
    Bank obj = Bank.getObject();
    obj.getStatus(10);
  }

}
