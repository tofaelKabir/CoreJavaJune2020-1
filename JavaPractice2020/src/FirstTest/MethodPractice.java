package FirstTest;


public class MethodPractice {
/*
	static void practiceMethod() {
		System.out.println("this is a test msg");
	}


	static void myName (String fname, int age) {
		System.out.println( fname + " Rahman" + " is " + age );
		
	}	
	
	
	static int practiceMethod(int x) {
		return 10 + x;
	}
	*/
	
	static void checkAge (int age) {
	if (age < 15) {
System.out.println("access denied - you are not welcome");
	}
	else {
		System.out.println("your access is granted");
	}
	}
		
	public static void main(String[] args) {
		checkAge(19);
	}
	
	
}
