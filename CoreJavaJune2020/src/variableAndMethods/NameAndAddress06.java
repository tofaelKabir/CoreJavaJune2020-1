package variableAndMethods;


public class NameAndAddress06 { 


	public static String Name = "Shamim"; 
	public static int houseNumber = 625; 
	public static char houseDirection = 'W'; 
	public static int stNumber = 57; 
	public static String state = "NY";
	public static int zipCode = 10019;
	
	public static void myInfo() {
		System.out.println(Name+"\n"+houseNumber+houseDirection+stNumber+state+zipCode);
		
	}
	
	public static void main(String[] args) {
		
		myInfo();
	}

}  //Closing of class body
