public class UserInfoUsingContructor {
  String name;
  private int uid;
  String company;
  String place;
  protected int age;
  private String position;

  public UserInfoUsingContructor(String uname, int id, String cname, String pname, int eage, String npos)
  {
    name = uname;
    uid = id;
    company = cname;
    place = pname;
    age = eage;
    position = npos;
  }

  public static void main(String args[])
  {
    UserInfoUsingContructor emp1 = new UserInfoUsingContructor("Rohit", 1, "Axis", "Pune", 21, "FSE");
    emp1.display();
  }
  
  public void display()
  {
    System.out.println(name);
    System.out.println(uid);
    System.out.println(company);
    System.out.println(place);
    System.out.println(age);
    System.out.println(position);
  }
  
}
