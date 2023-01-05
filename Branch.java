//package CollegeTask;

public class Branch extends College{
  String branchName;
  int branchId;
  int branchTotalStaff;

  Branch()
  {

  }

  public void showbranchDetails()
  {
    System.out.println("Branch Name: " + branchName);
    System.out.println("Branch Id: " + branchId);
    System.out.println("Branch Staff: " + branchTotalStaff);
  }
}
