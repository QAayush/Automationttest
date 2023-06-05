
package javaclasses;
import java.util.*;

public class Itrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("BMW");
		cars.add("Swift");
		
		
		Iterator<String> it=cars.iterator();
		System.out.println(it.next());
	}

}
