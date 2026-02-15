import java.util.*; //

public class ListOperation {
public static void main(String[] args) {
List <String> names = new ArrayList<>();
names.add("Student1");
names.add("Student2");
names.add("Student3");
names.add("Student4");
names.add(2, "Student1.5");
names.remove(0);
//names.remove("Student2")

//Size
System.out.println("List:" + names.size());
System.out.println("List:" + names);
System.out.println("First Element:" + names.get(0));
System.out.println("Is Empty?" + names.isEmpty());
}
}