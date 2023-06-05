package javaclasses;

public class MehtodwithParamter {

	void name(String fname) {
		System.out.println(" Hello "+fname+" sir");
	}
	
	int age(int a, int b) {
		System.out.println("Your age is "+a+ " and your income is " +b);
		return 0;
	}
	
	int multiple(int x) {
		return x*x;
	}
	
	public static void main(String[] args) {
		
		MehtodwithParamter k=new MehtodwithParamter();
		k.name("Ayush");
		k.age(32, 37500);
		int a= k.multiple(4);
		System.out.println(a);
		
	}

}
