import java.util.Scanner;

public class BankParent {
  String name;
  int id;
  long phno;
  private long bankTotalFund;
  private float bankInterest;

  Scanner sc = new Scanner(System.in);

  BankParent(long bankTotalFund, float bankInterest)
  {
    this.bankTotalFund = bankTotalFund;
    this.bankInterest = bankInterest;
  }

  BankParent()
  {

  }

  public void checkLoan(long loanAmount, float branchInterest)
  { 
    if (loanAmount < bankTotalFund) {
      System.out.println("Yes, loan is approved.");
      totalInterest(branchInterest);

    } else {
      System.out.println("Loan cannot be approved.");
    }
  }



  public void totalInterest(float branchInterest)
  {
      System.out.println(branchInterest+this.bankInterest);
  }

}
