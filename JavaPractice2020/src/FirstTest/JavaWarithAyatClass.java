package FirstTest;

public class JavaWarithAyatClass extends JavaShamimClass{
	
	String child1Name = "Warith";
	String child2Name = "Ayat";
	
	public static void main(String[] args) {
		
		JavaWarithAyatClass familyObj = new JavaWarithAyatClass();
		
		familyObj.Family();
		
		System.out.println("my name: " + familyObj.name + " my age:" + familyObj.age);
		System.out.println("my son name:" + familyObj.child1Name + ", my daughter name:" + familyObj.child2Name);
	}
	
	

}
