package javaclasses;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int a, b,c,d;
		
		System.out.println("If you want to use Calulator for Any type of Calculation Please Enter\n");
		System.out.println();
		System.out.println("If you want to calculation Please select any vlaue 1 to 5");
		System.out.println();
		System.out.println("1 For ADD");
		System.out.println();
		System.out.println("2 For Multiply");
		System.out.println();
		System.out.println("3 For Divide");
		System.out.println();
		System.out.println("4 For Subtract");
		System.out.println();
		System.out.println("5 For Modulus");
		System.out.println();
		System.out.println("Please enter any value:");
		System.out.println();
		 a=sc.nextInt();
		// System.out.println(a);
		if(a==1)
		{
			System.out.println();
			System.out.println("You enter " +a+ " For Add");
			System.out.println();
			System.out.println("Please enter any value:");
			 b=sc.nextInt();
			 System.out.println();
			System.out.println("Please enter second value: ");
			System.out.println();
			 c=sc.nextInt();
			d=b+c;
			System.out.println();
			System.out.println("Your ans is "+d);
			
		}
		
		else	if(a==2)
		{
		
			System.out.println("You enter " +a+ " for multiply");
			System.out.println();
			System.out.println("Please enter any value:");
			System.out.println();
			b=sc.nextInt();
			System.out.println();
			System.out.println("Please enter second value: ");
			 c=sc.nextInt();
			 d=b*c;
			 System.out.println();
				System.out.println("Your ans is "+d);
				
		}
		
		else	if(a==3)
		{
			System.out.println("You enter " +a+ " for Divide");
			
			System.out.println();
			System.out.println("Please enter any value:");
			System.out.println();
			b=sc.nextInt();
			System.out.println();
			System.out.println("Please enter second value: ");
			 c=sc.nextInt();
			 d=b/c;
			 System.out.println();
				System.out.println("Your ans is "+d);
		}
		
		else	if(a==4)
		{
			System.out.println("You enter " +a+ " for Subtract");
			
			System.out.println();
			System.out.println("Please enter any value:");
			System.out.println();
			b=sc.nextInt();
			System.out.println();
			System.out.println("Please enter second value: ");
			 c=sc.nextInt();
			 d=b-c;
			 System.out.println();
				System.out.println("Your ans is "+d);
		}
		else	if(a==5)
		{
			System.out.println("You enter " +a+ " for modulus");
			
			System.out.println();
			System.out.println("Please enter any value:");
			System.out.println();
			b=sc.nextInt();
			System.out.println();
			System.out.println("Please enter second value: ");
			 c=sc.nextInt();
			 d=b%c;
			 System.out.println();
				System.out.println("Your ans is "+d);
		}
		else {
			
			
			System.out.println("You enter incorrect details");
			
		}
		
		
		
	}

}
