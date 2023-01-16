package JavaProjectBank;

import java.util.Date;

public class Transaction implements TransactionInterface {
  int transactionId = 0;
  Date transactionDate;
  String transactionType;
  float transationAmount;
  float currentBalance;

  @Override
  public void addTransaction(String transactionType, float transactionAmount, float currentBalance) {
    // TODO Auto-generated method stub
    this.transactionDate = new Date();
    this.transactionType = transactionType;
    this.currentBalance = currentBalance;
  }

}
