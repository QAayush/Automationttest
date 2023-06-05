package requestPayload;

public class Addbook {

	
	public  static String payload(String isbn, String aisle, String name, String author){
		return "{\r\n"
				+ "\"name\":\""+name+"\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\""+author+"\"\r\n"
				+ "}\r\n";
			
		
	}
}
