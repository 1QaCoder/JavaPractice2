package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListProgram {
	int a;String s, c;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ListProgram> l=new ArrayList<ListProgram>();
		ListProgram lp=new ListProgram(1,"Java", "J");
		ListProgram lp1=new ListProgram(2,"Maven", "M");
		ListProgram lp2=new ListProgram(3,"Selenium", "S");

		l.add(lp);
		l.add(lp2);
		l.add(lp1);
		for(ListProgram l1:l){
		System.out.println(l1.a+"  "+ l1.s+"  "+l1.c);
		}
	}

	public ListProgram(int a,String s,String c) {
		//List<Integer> l=new ArrayList<Integer>(); // list is interface of ArrayList
		this.a=a;
		this.s=s;
		this.c=c;
		}

}
