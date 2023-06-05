package javaclasses;

public class vowles {

	public static void main(String[] args) {
		String name = "syssh";
		String[] a = { "A", "E", "I", "O", "U" };

		for (int i = 0; i < a.length; i++) {
			if (name.contains(a[0])) { // abc contains c =true
				System.out.println(" This is vowel name");
				break;
			} else if (name.contains(a[1])) {
				System.out.println(" This is vowel name");
				break;
			} else if (name.contains(a[2])) {
				System.out.println(" This is vowel name");
				break;
			} else if (name.contains(a[3])) {
				System.out.println(" This is vowel name");
				break;
			} else if (name.contains(a[4])) {
				System.out.println(" This is vowel name");
				break;
			} else {
				System.out.println("This is not vowel name");
				break;
			}
		}
	}

}
