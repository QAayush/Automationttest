package javaclasses;

interface batman3{
	public void batman1() ; // interface method does not have any body
	
	public void run();
	
}

class spider3 implements batman3{
	public void batman1() {
		System.out.println("Rich person");
	}
	public void run() {
		System.out.println(" Hello");
	}
}

public class InterfaceClass  extends spider3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		spider3 ss =new spider3();
		
		ss.batman1();
	}

}
