package javaclasses;

public class Methodoverloading {

	 int x=90;

	void mymehthod(float age) {
		System.out.println(" Your age is  "+ age);
	}
	
	int mymehthod(String name) {
		System.out.println("Your name is "+name);
		return 0;
	}
	
	int mehtod(int x) {
		System.out.println(x);
		return 0;
	}
	/*
	 * public static void main(String[] args) { Methodoverloading n= new
	 * Methodoverloading(); n.mymehthod("Ayush"); n.mymehthod(32.5f);
	 * 
	 * }
	 */
}
