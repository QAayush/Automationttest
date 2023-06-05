package javaclasses;
import java.util.*;

public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> cars= new LinkedList<String>();
		cars.add("BMW");
		cars.add("Swift");
		
		cars.addFirst("TATA");
		cars.addLast("Remove");
		cars.removeFirst();
		
		System.out.println(cars);
	}

}
