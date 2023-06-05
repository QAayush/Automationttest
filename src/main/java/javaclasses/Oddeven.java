package javaclasses;
import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println(" Please enter any value");
	 
	int a =sc.nextInt();
	
	if(a%2==0) {
		System.out.println("You enter even number");
	}
	else {
		System.out.println(" You enter Odd number");
	}

	}

}
