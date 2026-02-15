import java.util.*; //

public class SetExample {
public static void main(String[] args){

Set <String> names = new HashSet<>();

names.add("Student 1");
names.add("Student 2");
names.add("Student 1");
names.add("Student 4");
names.add("Student 2");
names.remove("Student 4");

System.out.println("Set Elements" + names);
}
}