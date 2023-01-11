//package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class HelperClass extends Student {
  Scanner sc = new Scanner(System.in);
  HashMap<Integer, Student> StudentMap = new HashMap<Integer, Student>();

  public void addStudent() {
    Student std = new Student();
    System.out.println("Enter Name: ");
    std.name = sc.next();
    System.out.println("Enter Roll No.: ");
    std.rollNo = sc.nextInt();
    System.out.println("Enter College Name: ");
    std.college = sc.next();
    System.out.println("Enter Place Name: ");
    std.place = sc.next();
    StudentMap.put(std.rollNo, std);

  }

  public void searchStudent() {
    System.out.println("Enter Roll Number to Search: ");
    int ind = sc.nextInt();
    boolean flag = false;
    // System.out.println(StudentMap.get(ind));
    for (Entry<Integer, Student> m : StudentMap.entrySet()) {
      if (ind == m.getKey()) {
        flag = true;
        System.out.println("Student found");
        System.out.println("Student Name: " + m.getValue().name);
        System.out.println("Student Roll No.: " + m.getValue().rollNo);
        System.out.println("Student College: " + m.getValue().college);
        System.out.println("Student Place: " + m.getValue().place);
      }
    }
    if (flag == false) {
      System.out.println("Student is not in a Database");
    }

  }

  public void deleteStudent() {
    System.out.println("Enter Roll Number to Delete Student Details: ");
    int ind = sc.nextInt();
    StudentMap.remove(ind);
    System.out.println("Student details of roll no." + ind + "are removed.");
  }

  public void displayAllData() {
    for (Entry<Integer, Student> m : StudentMap.entrySet()) {
      System.out.println("Student found");
      System.out.println("Student Name: " + m.getValue().name);
      System.out.println("Student Roll No.: " + m.getValue().rollNo);
      System.out.println("Student College: " + m.getValue().college);
      System.out.println("Student Place: " + m.getValue().place);
    }

  }

}
