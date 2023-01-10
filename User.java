import java.util.Scanner;

public class User extends BankBranch{
  String userName;
  int loanAmount;

  int count = 0;
  public Scanner sc = new Scanner(System.in);
  User arrayUser[];

  public void addUser()
  {
    if(count<arrayUser.length)
    {
      User userTemp = new User();
      System.out.println("Enter the Loan Amount: ");
      userTemp.loanAmount = sc.nextInt();
      System.out.println("Enter the Name: ");
      userTemp.userName = sc.next();
      if (checkLoan(userTemp.loanAmount) == 1)
      {
        arrayUser[count] = userTemp;
        System.out.println("User Data Added");
      }
      else
      {
        System.out.println("User cannot be added");
      }
    }
    else
    {
      System.out.println("User cannot be added!");
    }
    count++;
  }

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    User user = new User();
    System.out.println("Enter size of array");
    int n = sc.nextInt();
    user.arrayUser = new User[n];

    while (true) {
            System.out.println("Enter Case\n 1:Add User\n 2:Display User Details\n 3:exit");
            int choice = sc.nextInt();
            switch (choice) {
              case 1:
                    user.addUser();
                    break;
                case 2:
                    user.displayUser();
                    break;
                case 3:
                    System.exit(1);
            }
        }
  }

  public void displayUser() {
    for (User user : arrayUser) {
            try {
                System.out.println("User Name : " + user.userName);
                System.out.println("Loan Amount : " + user.loanAmount);
                System.out.println("Parent Bank : " + user.name);
                System.out.println("Parent Bank Id : " + user.id);
                System.out.println("Parent Bank Ph. No. : " + user.phno);
                System.out.println("Branch Name : " + user.branchName);
                System.out.println("Branch Id : " + user.branchId);
                System.out.println("Branch Ph. No. : " + user.branchPhno);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
  }

}
