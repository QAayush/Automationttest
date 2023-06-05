package restassuredtest;

import org.testng.annotations.Test;

import Automationtest.Jsonmapping;
import io.restassured.path.json.JsonPath;

public class Jsonparsing {

	
	
	@Test
	public void validation() {
	JsonPath js= new JsonPath(Jsonmapping.jsonmapping());
	
	int countofthearray=	js.getInt("courses.size()");
		
	System.out.println(countofthearray);
	

// Print Purchase amount
int purchaseamount =js.getInt("dashboard.purchaseAmount");
System.out.println(purchaseamount);


// Print Title of the first course

String titleofthecourse=js.getString("courses[0].title");

System.out.println(titleofthecourse);
//Print All course titles and their respective Prices
for(int i=0; i<countofthearray; i++) {
	
	String alltitleofthecourse=js.getString("courses["+i+"].title");
	System.out.println(alltitleofthecourse);
	int price =js.getInt("courses["+i+"].price");

	System.out.println(price);
}


//Print no of copies sold by RPA Course

for(int i=0; i<countofthearray; i++) {
	String alltitleofthecourse=js.getString("courses["+i+"].title");
	
	if(alltitleofthecourse.equals("RPA")) {
		int copies =js.getInt("courses["+i+"].copies");
		System.out.println(copies);
	}
}

int	sum=0;
	
	//Verify if Sum of all Course prices matches with Purchase Amount

for(int i=0; i<countofthearray; i++) {
	int pricess=js.getInt("courses["+i+"].price");
	int copiess =js.getInt("courses["+i+"].copies");
	int total=pricess*copiess;
	sum=sum+total;
	System.out.println(sum);

 }
	if (sum==910) {
		System.out.println("Equal");
	}
	
	}	
	


	
}








		


	
	

