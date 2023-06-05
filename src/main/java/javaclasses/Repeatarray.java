package javaclasses;

public class Repeatarray {

	public static int forrepeart(int a[], int n) {

		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 1; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count > 1) {
				return a[i];
			}

		}
		return -1;

	}

	public static void main(String args[]) {
		final int[] a = {4,5,6,8,5,8};
		int n = a.length - 1;
		System.out.println(forrepeart(a, n));

	}
}
