package Javapractice;

public class Lec5oop {
	 public String fruit1="banana";
	  String fruit="orange";
	  private int number1=2;
	 protected int number =5;
     final String school="nexttech itc";

	public static void main(String[] args) {
		// create an object of class I want to access
		//syntax:classname object=new classname();
		Lec5oop oop =new Lec5oop ();
		System.out.println(oop.number);
		System.out.println(oop.school);
		System.out.println(oop.fruit);

	}

}
