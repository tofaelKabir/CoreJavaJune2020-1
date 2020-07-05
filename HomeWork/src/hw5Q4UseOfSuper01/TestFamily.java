package hw5Q4UseOfSuper01;

public class TestFamily {
	
	public static void main(String[] args) {
		Father fatherObj = new Father("Aziz", 76, 'M', false);
		Son sonObj = new Son("Nine", 9);
		System.out.println(fatherObj.name + " " + fatherObj.age);
		System.out.println(sonObj.stId + " " + sonObj.grade);
	}

}
