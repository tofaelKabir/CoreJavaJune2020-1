package Java;
import java.math.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import java.util.Iterator;
import java.util.regex.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		if (age >= 18) {
			System.out.println("Yay, you are eligible for a driver's license!");
		} else if (age >= 16) {
			System.out.println("Yay, you are eligible for a learner's permit!");
		} else {
			throw new ArithmeticException("You're too young to drive a car, be patient!");
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
		
		
		LocalDateTime current_Moment = LocalDateTime.now();
		DateTimeFormatter goodFormat = DateTimeFormatter.ofPattern("EEEE; LLLL dd, YYYY; KK:mm:ss a");
		System.out.println("The current date and time is " + current_Moment.format(goodFormat) + ".");
		
		
		HashMap<String, String> Capitals = new HashMap<String, String>();
		Capitals.put("Sweden", "Stockholm");
		Capitals.put("New Zealand", "Auckland");
		Capitals.put("Peru", "Lima");
		Capitals.put("Afghanistan", "Kabul");
		System.out.println(Capitals);
		for (String i : Capitals.keySet()) {
			  System.out.println("Country: " + i + "; Capital: " + Capitals.get(i));
		}
		
		
		HashSet<Integer> fibonacci = new HashSet<Integer>();
		fibonacci.add(1);
		fibonacci.add(2);
		fibonacci.add(3);
		fibonacci.add(5);
		fibonacci.add(8);
		fibonacci.add(13);
		fibonacci.add(21);
		for (int i = 1; i <= 25; i++) {
			if (fibonacci.contains(i)) {
				System.out.println("The number " + i + " is a Fibonacci number.");
			} else {
				System.out.println("The number " + i + " is NOT a Fibonacci number.");
			}
		}
		
		
		Iterator<Integer> fib = fibonacci.iterator();
		while (fib.hasNext()) {
			System.out.println(fib.next());
		}
		
		fibonacci.forEach((f) -> {System.out.println(f);} );
		
		
		Double someDouble = 5.753214;
		System.out.println((someDouble.toString()));
		
		
		try {
			int[] ints = {1,2,3,4,5};
			System.out.println(ints[10]);
		}
		catch (Exception e) {
			System.out.println("That number was not in the array.");
		}
		
		
		
		
		Pattern repeat = Pattern.compile("rand", Pattern.CASE_INSENSITIVE);
		Matcher matchesMatcher = repeat.matcher("This is some random phrase.");
		if (matchesMatcher.find()) {
			System.out.println("MATCH");
		} else {
			System.out.println("NO MATCH");
		}
		
		
		
		
		
		Scanner obj7 = new Scanner(System.in);
		System.out.println("Enter your full name, and your date of birth (MM, DD, YYYY).");
		String name = obj7.nextLine();
		int month = obj7.nextInt();
		int day = obj7.nextInt();
		int year = obj7.nextInt();
		System.out.println("Your name is " + name + ", and your date of birth is " + month + "/" + day + "/" + year + ".");
		
		

	}
	

	

}
