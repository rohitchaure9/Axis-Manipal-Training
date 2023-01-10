public class BankParent {
  public String name="RBI";                 //Right now I am not in collection so I have to make them all public
  public int id=1;                          //I am not able to access them directly
  public long phno=1234567890;
  private long bankTotalFund = 10000000;
  private float bankInterest = 4;



  public int checkLoan(int loanAmount)
  { 
    if (loanAmount < this.bankTotalFund) {
      System.out.println("Yes, loan is approved.");
      return 1;

    } else {
      System.out.println("Loan cannot be approved.");
      return 0;
    }
  }

}
