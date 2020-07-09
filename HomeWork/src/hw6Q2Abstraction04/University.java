package hw6Q2Abstraction04;


public interface University extends College, Hospital{
	// Interface use extends keyword to inherit more than one Interfaces
	// Interface can't inherit abstract or regular class by extends keyword
	public void classSize();
	public void field();
	public void teacher();
	// Interfaces cannot have constructors
//	public University() {
//		System.out.println("Interfaces cannot have constructors");
	
	void gymnasium () ; 
	static void library() {
		
		
	}
	
	
	
	
	}
	
