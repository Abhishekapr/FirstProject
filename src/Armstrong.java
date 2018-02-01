import java.lang.Math; 
import java.util.Scanner;

public class Armstrong
{
  
  public static void main(String[] args)
  { 
    int sum=0;
    int rem;
   Scanner sc =new Scanner(System.in);
   System.out.println("Enter any number");
   int num=sc.nextInt();
    int alt = num;
    int length = String.valueOf(num).length();
    for (int i=0;i<length;i++)
    { 
    rem=num%10;
      num=num/10;	
      sum=sum + rem*rem*rem;
          }
        if (sum==alt)
    {    System.out.println("Armstrong number");}
    else
      {    System.out.println("Not an Armstrong number");}
  }
}

