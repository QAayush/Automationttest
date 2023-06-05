package javaclasses;

class Outerclass{


int a =10;


 class inner {   /// inner claas

	int x=10;

	}
}
 
 public  class InnerClass{
	 public static void main (String[] args) {
		 
		Outerclass my=new Outerclass();
		Outerclass.inner in=my.new inner();
		System.out.println(my.a);
		System.out.println(in.x);
		
	}
 }

