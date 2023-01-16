package JavaProjectBank;

public interface ATMInterface {
  public Customer deposit(Customer customer);

  public Customer withdraw(Customer customer);

  public void checkBalance(Customer customer);
}