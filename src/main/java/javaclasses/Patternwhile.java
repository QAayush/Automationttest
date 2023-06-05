package javaclasses;

public class Patternwhile {

	public static void main(String[] args) {
		int a = 1;
		while (a <= 5) {
			int b = 5;
			while (b >= a) {
				System.out.print("*");
				b--;
			}
			
			System.out.println();
		a++;
		}

	}

}
