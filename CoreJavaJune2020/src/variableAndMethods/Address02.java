package variableAndMethods;


public class Address02 { //Opening of Class body

	// Class body
	//CLass body contains--
	
	//Variables - declared or initialized
	//COnstructor -- "same as above"
	//method -- implemented / initialized - 
	//in class method is not declared like variables and constructor
	
	static String Name = "Shamim"; //String inside double quotation
	static int age = 44; //without Q
	static char sex = 'M'; //inside single Q
	static double grade = 3.876; //inside double 
	
	public static void main(String[] args) {
		System.out.println(Name);  //a non static variable cannot initialize under a static method
		System.out.println(age);
		System.out.println(sex);
		System.out.println(grade);
		
	}

}  //Closing of class body