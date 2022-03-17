package AbstarctionInheritance;

public class Encapsulation {

	//Encapsulation in Java is a process of wrapping code and data together into a single unit,
	//We can create a fully encapsulated class in Java by making all the data members of the class private. 
	
	private String name;
	private int id;
	
	public void getData() {
		System.out.println(name+"    "+id );
		
	}
	
	public void setData(String n,int i) {
		id=i;
		name=n;
	}
	
	
	
	
}
