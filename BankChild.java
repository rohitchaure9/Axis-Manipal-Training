import java.util.Scanner;

public class BankChild extends BankParent {
  String branchName;
  int branchId;
  long branchPhno;
  private long branchTotalFund;
  private float branchInterest;

  BankChild(String name, int id, long phno, String branchName, int branchId, long branchPhno, long bankTotalFund, float bankInterest, long branchTotalFund,float branchInterest)
  {
    super(bankTotalFund, bankInterest);
    super.name = name;
    super.id = id;
    super.phno = phno;
    this.branchName = branchName;
    this.branchId = branchId;
    this.branchPhno = branchPhno;
    this.branchInterest = branchInterest;
    this.branchTotalFund = branchTotalFund;
  }

  Scanner sc = new Scanner(System.in);

  public void methodloan()
  {
    int loanAmount;
    System.out.println("Enter a loan amount: ");
    loanAmount = sc.nextInt();
    checkLoan(loanAmount, this.branchInterest );
  }

  public static void main(String args[])
  {
    BankChild Axis = new BankChild("RBI", 1, 12346789, "Axis", 1234, 123456, 10000000, 4, 1000000, 4);
    Axis.methodloan();

  }


}
