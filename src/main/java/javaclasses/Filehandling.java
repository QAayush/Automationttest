package javaclasses;
import java.io.*;

public class Filehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File f=new File("Java.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("Your file is created");
			}else {
				System.out.println("File alrady created");
			}
		}catch(Exception e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}
		

}
}