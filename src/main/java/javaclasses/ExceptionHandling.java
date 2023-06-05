package javaclasses;
import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		
		System.out.println("Enter your first number");
		float a=sc.nextFloat();
		System.out.println("Enter your next number");
		float b=sc.nextFloat();
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("Please enter valid value");
		}
	}

}
