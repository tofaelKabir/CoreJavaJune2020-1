package hw3Q4variableAndMethod02;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.Name = "Shamim";
		emp1.age = 43;
		emp1.sex = 'M';
		emp1.usaCitizen = true;
		emp1.empInfo();
		
		Employee emp2 = new Employee();
		emp2.Name = "Warith";
		emp2.age = 14;
		emp2.sex = 'M';
		emp2.usaCitizen = true;
		emp2.empInfo();
	}

}
