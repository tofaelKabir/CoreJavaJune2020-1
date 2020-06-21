package inheritance;

public class TestFamilyHierarchy {
	public static void main(String[] args) {
		GrandFather grandFather = new GrandFather(); // default Constructor initialize
		grandFather.Name="Kalim";
		grandFather.age=90;
		grandFather.grandfatherInfo();
		
		
		Father father = new Father();
		father.age=65;
		father.Name="Aziz";
		father.fatherInfo();
		
		
		
	}

}
