package Java;

public class oop_practice {
	String first_name = "Ayat";
	String last_name = "Rahman";
	int age = 9;
	
	public static void main(String[] args) {
		oop_practice bio = new oop_practice();
		System.out.println("Hi, my name is " + bio.first_name + " " + bio.last_name + ". \nI am " + bio.age + " years old!");
	}
	public void chef() {
		System.out.println("I bake delicious pastries!");
	}
}

/*class more_oop_practice extends oop_practice {
	String color = "blue";
		public static void main(String[] args) {
		more_oop_practice obj = new more_oop_practice();
		System.out.println("My name is " + obj.first_name + ", and my favorite color is " + obj.color + "!");
	}
}*/