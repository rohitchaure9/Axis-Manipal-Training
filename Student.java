//package CollegeTask;

public class Student extends Branch{
  String studentName;
  String studentPlace;
  int studentId;

  public Student(String studentName, String studentPlace, int studentId, String branchName, int branchId,
    int branchTotalStaff, String collegeName, int collegeId, String collegePlace)
  {
    this.studentName = studentName;
    this.studentPlace = studentPlace;
    this.studentId = studentId;
    this.branchName = branchName;
    this.branchId = branchId;
    this.branchTotalStaff = branchTotalStaff;
    this.collegeName = collegeName;
    this.collegeId = collegeId;
    this.collegePlace = collegePlace;
  }

  public void showStudentDetails()
  {
    System.out.println("Student Name: " + studentName);
    System.out.println("Student Place: " + studentPlace);
    System.out.println("Student Id: " + studentId);
    System.out.println("Branch Name: " + branchName);
    System.out.println("College Name " + collegeName);
  }

  public static void main(String args[])
  {
    Student stud = new Student("Rohit", "Pune", 9, "Instrumentation", 2, 22, "VIT Pune", 1, "Pune");
    stud.showStudentDetails();
    stud.showCollegeDetails();
    stud.showbranchDetails();
  }
    
}
