package javaclasses;

public class EncapsulationPro {

	private String name; //private= restricted area
	
	
	//getter
	public  String getname() {
		return name;
	}
	
	//setter
	public void setname(String newname ) {
		this.name=newname;
	}
	
	public static void main(String[] args) {
		EncapsulationPro pp= new EncapsulationPro();
		pp.setname("Ayush");
		System.out.println(pp.getname());

	}

}
