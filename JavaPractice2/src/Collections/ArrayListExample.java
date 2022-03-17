package Collections;

import java.util.*;


public class ArrayListExample  {

	//The ArrayList class implements the List interface. It uses a dynamic array to 
	//store the duplicate element of different data types
	void method() {
		ArrayList<Integer> arr=new ArrayList<Integer>();//object creation for ArryList
		//ArrayList<String> a=new ArrayList<String>();
		arr.add(11);
		arr.add(12);
		arr.add(15);
		arr.add(11);
	//	arr.addAll(arr);//copy all values in same array
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println(arr);
		System.out.println(arr.contains(11));// true
		System.out.println(arr.contains(13));// false
		System.out.println(arr.indexOf(15));//Retrieving index value 
		System.out.println(arr.size());//siza of array
		System.out.println(arr.remove(1));
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		
		
		
	}
	
	public static void main(String []arg) {
		ArrayListExample al=new ArrayListExample();
		al.method();
		
		}
		
		
}	
	

