package hw4Q3Constructor01;

public class Student {

	String StName;
	char sex; 
	int stID;
	boolean programmer;
	float grade;
	
	public Student (String name, char sexMF, int id, boolean prog, float gpa) {
		
		StName = name; 
		sex = sexMF;
		stID = id;
		programmer = prog;
		grade = gpa;
		
	}
	
}
