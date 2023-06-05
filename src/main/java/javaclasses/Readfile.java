package javaclasses;

import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

public class Readfile {

	public static void main(String[] args) {
		try {
		
		File myfile= new File("java.txt");
		Scanner sc=new Scanner(myfile);
		while(sc.hasNextLine()) {
		
			String data=sc.nextLine();
			System.out.println(data);
		}
		
		} catch(FileNotFoundException e) {
			System.out.println("An error");
			e.printStackTrace();
	}
			
		}
		

	}


