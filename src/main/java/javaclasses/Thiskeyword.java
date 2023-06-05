package javaclasses;

public class Thiskeyword {

	int t=0;
    String name="Raja";





	public static void main(String[] args) {
		Thiskeyword t =new Thiskeyword();
		t.test(1, "Ram");

	}

	private void test(int i, String name) {
		System.out.println(i);
		 this.name= name;
		System.out.println(name);
		System.out.println(this.t);
		System.out.println(this.name);
		this.test1();
	}

	private void test1() {
		System.out.println("hello");
		
	}

}
