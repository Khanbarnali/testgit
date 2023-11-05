package Javapractice;

 import java.util.ArrayList;



public class lce3arraylist {

	public static void main(String[]args) {
		
	
	
	//Syntax of ArrayList
	// ArrayList<data type> variable name =new ArrayList<data type>();
	//code of ArrayList
	ArrayList<String> cars1 =new ArrayList <String>();
	//add 4 data
	cars1.add("bmw");
	cars1.add("nissan");
	cars1.add("toyata");
	cars1.add("volvo");
	//how to access an item
	cars1.get(0);
	System.out.println(cars1.get(0));
	//change an item
	cars1.set(0,"bently");
	System.out.println( cars1);
	//remove an item
	cars1.remove("bmw");
System.out.println(cars1.remove(0));
	
	

		

	}
	
	
	
	
	
	
	
	



	
	

}
