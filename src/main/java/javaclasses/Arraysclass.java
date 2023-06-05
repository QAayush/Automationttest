package javaclasses;

public class Arraysclass {

	public static void main(String[] args) {
		
		
		int a[]= {4,5,6,7,8};
		System.out.println(a[0]);
		System.out.println(a.length);// length for use for count length for array
		
		int b[]=new int[5];// Memory location
		
		b[0]=1;
		b[1]=3;
		b[2]=2;
		System.out.println(b[0]);
		
		for(int x:a) {  //for each
			System.out.println(x);
		}
			
		}
	

}
