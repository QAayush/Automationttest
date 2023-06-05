package javaclasses;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("If you know leap year please enter year");
		System.out.println();
		int d = sc.nextInt();
		if (d % 4 == 0) {
			System.out.println("This is a leap year");

		}

		else

		{

			System.out.println("This is not a leap year");

		}

	}

}
