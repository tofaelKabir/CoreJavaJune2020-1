package Java;


public class more_oop_practice extends oop_practice{
	String color = "blue";
	public void chef() {
		System.out.println("I cook delicious pancakes!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		more_oop_practice obj = new more_oop_practice();
		System.out.println("My name is " + obj.first_name + ", and my favorite color is " + obj.color + "!");
		oop_practice obj1 = new oop_practice();
		more_oop_practice obj2 = new more_oop_practice();
		
		obj1.chef();
		obj2.chef();
	}
}