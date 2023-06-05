package javaclasses;

abstract class animal{
	//abstract method does not have body
	
	public abstract void aminalsound();
}


class tiger extends animal{
	public void aminalsound() {
		//abstract body
		System.out.println("The tiger says roar");
	}
	
}




public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tiger t=new tiger();
		t.aminalsound();

	}

}
