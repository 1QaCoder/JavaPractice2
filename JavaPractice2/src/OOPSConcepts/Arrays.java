package OOPSConcepts;

public class Arrays {

	public static void main(String[] args) {
		//array is a collection of similar type of elements which has contiguous memory location
		
		//2 Types of arrays --single dimensional , multidimensional
		int a[]= {10,20,30,40,50};//declaration, instantiation and initialization 
		
		int b[]=new int[4];//declaration of array
		//implementation
		b[0]=11;
		b[1]=22;
		b[3]=55;
		
		
		System.out.println(b.length);//get the size of array
		
		for(int i:b) {
			System.out.println(i);
		}
		
		
		for(int i=0;i<=4;i++) {
			System.out.println(a[i]);
		}
			
			//Multidimetional Array
			String [][]s= {{"A","B","C"},{"D","E","F"}}; //declaration, instantiation and initialization 
			for(int k=0;k<s.length;k++) {
				for(int j = 0;j<s[k].length;j++) {
					System.out.println(s[k][j]);
				}
			}
			System.out.println("2dimentional array");
		int arr[][]=new int[2][2];// Declaration
					//implementation
		arr[0][0]=100;
		arr[0][1]=200;
		arr[1][0]=300;
		arr[1][1]=400;
		for(int k=0;k<arr.length;k++) {
			for(int j = 0;j<arr[k].length;j++) {
				System.out.println(arr[k][j]);
			}
	
		}		
			
		
	}
		

	

}
