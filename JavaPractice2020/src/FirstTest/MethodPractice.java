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
	
	
	static void checkAge (int age) {
	if (age < 15) {
System.out.println("access denied - you are not welcome");
	}
	else {
		System.out.println("your access is granted");
	}
	}
		
	
	
	static int newSMethod (int x, int y) {
		return x + y;
	}
	
	static double newSMethod (double x, double y) {
		return x + y;
	}
	public static void main(String[] args) {
		
		int myNum1 = newSMethod(8, 5);
		double myNum2 = newSMethod(10.5, 5.55);
		
		System.out.println(myNum1);
		System.out.println(myNum2);
		
	}
	
	public static int sum(int k) {
		if (k>0) {
			return k + sum(k - 1);
			
			}else {
				return 0;
				
				}
		
	}
	public static void main(String[] args) {
		int result = sum(20);
		System.out.println(result);
	}
	
	
	 int r = 8;
	public static void main(String[] args) {
		MethodPractice mno = new MethodPractice();
		MethodPractice ijk = new MethodPractice();
		
		mno.r = 12;
		
		System.out.println(mno.r);
		System.out.println(ijk.r);
	}
	
	
	static void newStaticMethod () {
		System.out.println("this is a static method without object");
				
	}
	public void newPublicMethod() {
		System.out.println("this is a public method with object");
		
	}
	
	public void secondMethod(int mile) {
		System.out.println("this is a test with 2 methods " + mile);
	}
public static void main(String[] args) {
	newStaticMethod();
	
	MethodPractice ttt = new MethodPractice();
	ttt.newPublicMethod();
	ttt.secondMethod(500);
}	
	*/

		int classYear;
		String classModel;
		
		public MethodPractice (int year, String model) {
			classYear = year;
			classModel = model;
					
	}
	
	public static void main(String[] args) {
		MethodPractice car = new MethodPractice(2000, "FORD");
		System.out.println(car.classYear + " " +  car.classModel);
				
	}
	
	

	
}
