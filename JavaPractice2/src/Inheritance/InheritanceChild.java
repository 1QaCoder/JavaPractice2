package Inheritance;

public class InheritanceChild extends InheritanceParent { //extends keyword is use to inherit data from parent class to child class 
	
	public void data() {
		System.out.println("childs data()");
		
		
	}
	
	void info(int age,String city) {
		age=25;
		city="NJcity";
		System.out.println(" childs info(int age,String city)");
		System.out.println(age+ "  "+city);
	}
	void job(int id) {
		id=145;
		System.out.println("Job");
		System.out.println(id);
	}

	public static void main(String[] args) {
		InheritanceChild ic=new InheritanceChild();
		//InheritanceChild ic1=(InheritanceChild) new InheritanceParent();
		InheritanceParent ic2=new InheritanceParent();
		ic.data();//child class object invoking 
		
		//single inheritance
		System.out.println(ic.number);//invoking parent class variable 
		ic2.info(0,null);//parent class object 
		ic.info(0, null);
		
		//mulitilevel inheritance
		ic.methodA();
		
		
	}

}
