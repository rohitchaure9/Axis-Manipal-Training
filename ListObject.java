import java.util.ArrayList;
import java.util.Iterator;

public class ListObject {
  String name;
  int age;

  public ListObject(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String args[]) {
    ArrayList<ListObject> objArrayList = new ArrayList<ListObject>();
    ListObject stud1 = new ListObject("Rohit", 21);
    ListObject stud2 = new ListObject("Aditya", 22);
    ListObject stud3 = new ListObject("Chetna", 20);

    objArrayList.add(stud1);
    objArrayList.add(stud2);
    objArrayList.add(stud3);

    for (ListObject obj : objArrayList) {
      System.out.println(obj.name);
      System.out.println(obj.age);
    }

    objArrayList.remove(0);

    Iterator it = objArrayList.iterator();

    while (it.hasNext()) {
      ListObject obj = (ListObject) it.next(); // it's current value is stored in a object and only iterator will go to
                                               // next object it.next().
      System.out.println(obj.name);
      System.out.println(obj.age);
      // System.out.println(it.next());
    }

  }

}
