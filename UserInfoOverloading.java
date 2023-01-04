public class UserInfoOverloading {
  String name;
  private int uid;
  String company;
  String place;
  protected int age;
  private String position;

  // public UserInfoOverloading(String uname, int id, String cname, String pname, int eage, String npos)
  // {
  //   this.name = uname;
  //   this.uid = id;
  //   this.company = cname;
  //   this.place = pname;
  //   this.age = eage;
  //   this.position = npos;
  // }

  public UserInfoOverloading(String uname, int id)
  {
    this.name = uname;
    this.uid = id;
  }

  public UserInfoOverloading(String uname, int id, String cname, String pname, int eage, String npos)
  {
    this(uname, id);
    this.company = cname;
    this.place = pname;
    this.age = eage;
    this.position = npos;
  }
  
  public static void main(String args[])
  {
    UserInfoOverloading obj = new UserInfoOverloading("Rohit", 1, "Axis", "Pune", 21, "FSE");
    obj.display();
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
