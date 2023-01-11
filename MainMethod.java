//package HashMap;

import java.util.Scanner;

public class MainMethod extends HelperClass {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    HelperClass data = new HelperClass();
    boolean bool = true;

    while (bool) {
      System.out.println("----Welcome to School Database----");
      System.out
          .println(
              "Select a option:\n 1. Add Student Details\n 2. Search a Student\n 3. Delete a Student\n 4. Display All Data\n 5. Exit");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          data.addStudent();
          break;

        case 2:
          data.searchStudent();
          break;

        case 3:
          data.deleteStudent();
          break;

        case 4:
          data.displayAllData();
          break;

        case 5:
          bool = false;
          break;

        default:
          System.out.println("Enter a valid choice!!!");
      }
    }
  }
}
