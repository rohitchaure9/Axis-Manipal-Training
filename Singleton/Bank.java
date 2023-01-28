package Singleton;

class Bank {
  private static Bank sigletonBank = new Bank();

  private Bank() {

  }

  public void getStatus(int time) {
    if (time > 1 && time < 24) {
      System.out.println("Bank is open.");
    } else {
      System.out.println("Bank is closed.");
    }

  }

  static Bank getObject() {
    return sigletonBank;
  }
}