import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		int counter = 0;
		for (int j = 2; j < num1; j++) {
			if (num1 % j == 0) {
				counter = 1;
			}			
		}
	if (counter == 0) {
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}
}
