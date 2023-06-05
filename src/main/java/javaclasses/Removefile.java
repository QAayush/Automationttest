package javaclasses;

import java.io.*;

public class Removefile {

	public static void main(String[] args) {
		File myobj = new File("java.txt");
		if (myobj.delete()) {
			System.out.println("Sucessfully deleted " + myobj.getName());
		} else {
			System.out.println("Failed to delet");
		}

	}

}
