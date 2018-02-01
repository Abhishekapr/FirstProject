import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
Scanner sc =new Scanner(System.in); 
System.out.println("Enter first number");
System.out.print("");
int num1 = sc.nextInt();
System.out.println("Enter second number");
int num2 = sc.nextInt();
System.out.println("Enter operator");
String op = sc.next();

switch (op) {
case "+":
	System.out.print("Sum of two number is  ");
	System.out.println(num1+num2);
	break;
case "-":
System.out.printf("Difference of two numbers is  "+ (num1-num2));

break;
case "*":
	System.out.printf("Mutilple of two numbers is  ");
	System.out.println(num1*num2);
break;
case "/":
	System.out.printf("Division of two numbers is  ");
	System.out.println(num1/num2);
default:
	break;
}
{}

	}

}
