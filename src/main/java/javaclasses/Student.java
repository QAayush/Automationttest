package javaclasses;

interface animal1{
	public void animalsound(); // interface method
	
	
	public void run();
	
}

class Cat implements animal1{
	public void animalsound() {
		System.out.println("Miau");
	}
	
	public void run() {
		System.out.println("Tik Tik");
	}
}



public class Student {

	public static void main(String[] args) {
		Cat c =new Cat();
		c.run();
		c.animalsound();
	

	}

}
