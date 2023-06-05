package javaclasses;

import java.util.Scanner;

public class Arrayinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			System.out.print(" Enter value :");

			a[i] = sc.nextInt();
		}
		for (int x : a) {
			System.out.println(x);
		}
	}

}
