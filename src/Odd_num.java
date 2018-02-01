import java.util.Scanner;

public class Odd_num {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter the number");
		int num1 = sc.nextInt();
		int counter=0;
		System.out.println("First 10 Odd numbers less than the number entered by you are :");
				for (int i=1;i<=num1;i++) {
				// for(int count=1;count<=i;count++) 
				//{
			if ((i%2)!=0) {
				System.out.println(i);	
				counter++;
				if(counter>=10)
					{
				break;	
					}
				//}
			 }
			
//			else {
//							}	}
		}}
}

	
