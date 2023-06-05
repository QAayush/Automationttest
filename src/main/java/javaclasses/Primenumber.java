package javaclasses;
import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
	int i=0;;
		Scanner sc=new Scanner(System.in);
				
		System.out.println("Enter any number ");
		 i=sc.nextInt();	
		 for (int k=2; k<=i/2; k++ ) {
		if(k/i==0) {
			System.out.println("This is a prime number");
		}else {
			System.out.println("This is not prime number");
		}
	}
	}
}
