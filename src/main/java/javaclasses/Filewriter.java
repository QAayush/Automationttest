package javaclasses;
import java.io.*;

public class Filewriter {

	public static void main(String[] args) {
		try {
			FileWriter fw =new FileWriter("java.txt");
			fw.write("This is my file");
			fw.close();
			System.out.println("File wrote sucessfully");
		}catch(Exception e) {
			System.out.println("an error occured");
		}
		

	}

}
