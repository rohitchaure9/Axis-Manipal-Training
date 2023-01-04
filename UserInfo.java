import java.util.Scanner;

class UserInfo {
  String name;
  private int uid;
  String company;
  String place;
  protected int age;
  private String position;

  public static void main(String args[])
  {
    UserInfo emp1 = new UserInfo();
    UserInfo emp2 = new UserInfo();
    emp1.createEmployee(emp1);
    emp2.createEmployee(emp2);
    emp1.display(emp1);
    emp2.display(emp2);

  }

  public void createEmployee(UserInfo obj)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a employee name: ");
    obj.name = sc.nextLine();
    System.out.println("Enter a employee id: ");
    obj.uid = sc.nextInt();
    System.out.println("Enter a employee company: ");
    obj.company = sc.nextLine();
    System.out.println("Enter a employee place: ");
    obj.place = sc.nextLine();
    System.out.println("Enter a employee age: ");
    obj.age = sc.nextInt();
    System.out.println("Enter a employee position: ");
    obj.position = sc.nextLine();

  }
  
  public void display(UserInfo obj)
  {
    System.out.println("Name:" + obj.name + " User Id: " + obj.uid + " Company: " + obj.company + " Place: " + obj.place + " Age: "
        + obj.age + " Position: " + obj.position);
  }


}
