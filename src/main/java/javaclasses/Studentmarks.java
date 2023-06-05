package javaclasses;

import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		int a, b, c, d, e;
		float g;
		float f, h;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your all 5 subjects");
		String Sub1 = Sc.nextLine();
		System.out.println("Enter Your next subject");
		String Sub2 = Sc.nextLine();
		System.out.println("Enter Your third subject");
		String Sub3 = Sc.nextLine();
		System.out.println("Enter Your Fourth subject");
		String Sub4 = Sc.nextLine();

		System.out.println("Enter Your Last subject");
		String Sub5 = Sc.nextLine();

		System.out.println("You Enter this 5 subject " + Sub1 + ", " + Sub2 + " ," + Sub3 + " ," + Sub4 + " ," + Sub5+ ".");

		System.out.println();
		System.out.println("Now please enter your subjects marks");
		System.out.println();
		System.out.println("Please enter first subject number");

		a = Sc.nextInt();
		System.out.println(a);
		System.out.println();
		if (a >= 80 && a <= 100) {
			System.out.println("Your grade for this subject is  A");
		} else if (a >= 60 && a <= 79) {
			System.out.println("Your grade for this subject is  B");
		} else if (a >= 40 && a <= 59) {

			System.out.println("Your grade for this subject is  C");

		} else if (a >= 1 && a <= 39) {

			System.out.println("Your grade for this subject is  D");
		}

		System.out.println("Please enter second subject number");
		System.out.println();
		b = Sc.nextInt();
		System.out.println(b);
		System.out.println();
		if (b >= 80 && b <= 100) {
			System.out.println("Your grade for this subject is  A");
		} else if (b >= 60 && b <= 79) {
			System.out.println("Your grade for this subject is  B");
		} else if (b >= 40 && b <= 59) {

			System.out.println("Your grade for this subject is  C");

		} else if (b >= 1 && b <= 39) {

			System.out.println("Your grade for this subject is  D");
		}

		System.out.println("Please enter third subject number");
		System.out.println();
		c = Sc.nextInt();
		System.out.println(c);
		System.out.println();
		if (c >= 80 && c <= 100) {
			System.out.println("Your grade for this subject is  A");
		} else if (c >= 60 && c <= 79) {
			System.out.println("Your grade for this subject is  B");
		} else if (c >= 40 && c <= 59) {

			System.out.println("Your grade for this subject is  C");

		} else if (c >= 1 && c <= 39) {

			System.out.println("Your grade for this subject is  D");
		}
		System.out.println("Please enter fourth subject number");
		System.out.println();
		d = Sc.nextInt();
		System.out.println(d);
		System.out.println();
		if (d >= 80 && d <= 100) {
			System.out.println("Your grade for this subject is  A");
		} else if (d >= 60 && d <= 79) {
			System.out.println("Your grade for this subject is  B");
		} else if (d >= 40 && d <= 59) {

			System.out.println("Your grade for this subject is  C");

		} else if (d >= 1 && d <= 39) {

			System.out.println("Your grade for this subject is  D");
		}
		System.out.println("Please enter fifth subject number");
		System.out.println();
		e = Sc.nextInt();
		System.out.println(e);
		System.out.println();
		if (e >= 80 && e <= 100) {
			System.out.println("Your grade for this subject is  A");
		} else if (e >= 60 && e <= 79) {
			System.out.println("Your grade for this subject is  B");
		} else if (e >= 40 && e <= 59) {

			System.out.println("Your grade for this subject is  C");

		} else if (e >= 1 && e <= 39) {

			System.out.println("Your grade for this subject is  D");

		}
        g=a+b+c+d+e;
        System.out.println("Your total marks :" +g);
		
		h=(g/500)*100;
		 System.out.println("Your Percentage is :" +h);
		if (h >= 80) {
			System.out.println("Pass with First position");
		} else if (h >= 60) {
			System.out.println("Pass with second position");
		} else if (h >= 40) {
			System.out.println("Pass with third position");
		} else if (h >= 10) {
			System.out.println("Fail");
		}

	}
}
