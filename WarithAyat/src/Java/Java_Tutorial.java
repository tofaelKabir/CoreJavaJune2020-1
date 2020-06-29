package Java;
import java.math.*;
public class Java_Tutorial {

	static void myMethod() {
		System.out.println("Methods, like this, are basically functions designed to do certain tasks.");
	}
	static void personBio(String name, int age) {
		System.out.println("Hi, my name is " + name + ", and I am " + age + " years old!");
	}
	static void add(int x,int y) {
		int z = x+y;
		System.out.println(z);
	}
	static void add(double a, double b) {
		System.out.println(a + b);
	}
	static void driversLicense (int age) {
		if (age > 18) {
			System.out.println("Yay, you are eligible for a driver's license!");
		} else if (age > 16) {
			System.out.println("Yay, you are eligible for a learner's permit!");
		} else {
			System.out.println("You're too young to drive a car, be patient!");
		}
	}
	static void multiply(int a, double b, double c) {
		System.out.println(a * b * c);
	}
	public static int triangularNumber(int n) {
		int taco = 0;
		if (n > 0) {
			taco += n;
			taco += triangularNumber(n-1);
		} else {
			taco += 0;
		}
		return(taco);
	}
	
	public static int exponents(int base, int power) {
		int taco = base;
		if (power > 1) {
			taco *= exponents(base, power - 1);
		} else {
			taco *= 1;
		}
		return taco;
	}
	public static void main(String[] args) {
		double chicken = 5.482;
		int chick = (int) chicken;
		System.out.println(chick);
		System.out.println("The data types from smallest to largest are: byte, short, char, int, long, float, double");
		int lettuce = 7;
		lettuce = 3;
		System.out.println(lettuce);
		System.out.println(8 << 3);
		String a = "1234567890";
		System.out.println(a);
		System.out.println(Math.max(2.4, 93));
		myMethod();
		personBio("Ayat", 9);
		personBio("Warith", 14);
		add(17, 24);
		add(2.45, 3.141510);
		driversLicense(17);
		multiply(13, 2.482930175938, 9.192752);
		System.out.println(triangularNumber(17));
		System.out.println(exponents(2, 12));
		System.out.println(exponents(3, 3));
	}
	

	

}
