package javaclasses;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.remove(0);
		cars.add("Swift");
		System.out.println(cars);
		System.out.println(cars.get(0));
		cars.set(0, "Thar");
		
		System.out.println(cars);
		System.out.println(cars.size());
		
		Collections.sort(cars);

	}

}
