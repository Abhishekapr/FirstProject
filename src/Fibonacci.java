import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Length of fibonacci series");
		int length=sc.nextInt();
		int sum=0;
		for (int i=0;i<length;i++)
		{
			sum=sum+i;
			System.out.print(sum+" ");
		}
	}

}
