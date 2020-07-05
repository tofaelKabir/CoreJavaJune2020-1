package hw5Q4UseOfSuper01;

public class Father {

	String name;
	int age;
	char sex;
	boolean usCitizen;
	
	public Father (String fullName, int howOld, char gender, boolean citizenship) {
		
		name = fullName;
		age = howOld;
		sex = gender;
		usCitizen = citizenship;
	
	}
	public void father() {
		System.out.println("this is a test print out");
		
	}
	
	public void fatherInfo(String fatherName, int fatherAge, char fatherGender, boolean fatherCountry) {
		System.out.println("Name: " + fatherName + ", Age: " + fatherAge + ", Gender :" + fatherGender + " , Citizenship :" + fatherCountry );
		
	}
}
