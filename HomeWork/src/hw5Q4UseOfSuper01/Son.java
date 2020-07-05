package hw5Q4UseOfSuper01;


public class Son{
	String stId;
	int grade;
	
	public Son (String id, int whichClass) {
		
		stId = id;
		grade = whichClass;
		
	}
	
	public void son() {
		System.out.println("this is a test msg from son method");
		
	}
public void sonInfo(String studentId, int studentGrade) {
	System.out.println("Student ID: " + studentId + ", Student Grade" + studentGrade);
}
	
}
