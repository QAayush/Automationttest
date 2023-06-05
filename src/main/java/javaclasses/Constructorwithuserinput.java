package javaclasses;
import java.util.Scanner;

public class Constructorwithuserinput {

	public Constructorwithuserinput(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		int a =sc.nextInt();
		Constructorwithuserinput d = new Constructorwithuserinput(a);
		
		
		
	}

}
