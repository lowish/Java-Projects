public class Division extends ArithmeticParent{

public Division(double num1, double num2) {
super(num1, num2);
}

@Override
public double calculate(){
if (num2 != 0) {
return num1 / num2;
} else {
System.out.print("Invalid");
return 0;
}
}
}