package javaclasses;
import java.util.Scanner;
import java.io.*;


public class Fileinfo {

	public static void main(String[] args) {
		
		File myobj=new File("java.txt");
		if(myobj.exists()) {				// file check krn
			System.out.println("File name "+ myobj.getName());
			System.out.println("File path "+myobj.getAbsolutePath());
			System.out.println("File path "+myobj.getPath());
			System.out.println("Writeable "+myobj.canWrite());
			System.out.println("Readable "+myobj.canRead());
			System.out.println("Length in bytes "+myobj.length());
			System.out.println("Last modify "+myobj.lastModified());
		}
		else {
			System.out.println("File does not exist");
		}
		
		
	}

}
