package FirstTest;

public class FinalClass {
	
	public static void main(String[] args) {
		
		PrimaryClass newObj = new PrimaryClass();
		PrimaryClass.Innerclass newInnerObj = newObj.new Innerclass(); 
		System.out.println(newObj.size);
		System.out.println(newInnerObj.length);
	}

}
