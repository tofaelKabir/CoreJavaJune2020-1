package javaConstructor;

public class TestEmployee {

	public static void main(String[] args) {

		Employee E1 = new Employee();
		Employee E2 = new Employee("SHAMIM");
		Employee E3 = new Employee("Warith", 14);
		Employee E4 = new Employee("Ayat", 9, 'f');
		Employee E5 = new Employee("Shantana", 81, 'f', true);
		Employee E6 = new Employee(77, 'M', false, "Tofael");
		
		//we must have to put the variable in a sequence like the way local variable declared in constructor
				// it doesn't matter the sequence of variable declared inside sysout
				// It is possible to create a parameterized constructor with the same number of variable if they organized in a different manner. 
			
	}

}
