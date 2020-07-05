package hw4Q3Constructor01;


public class TestStudent {

public static void main(String[] args) {
	Student newObj = new Student("Warith", 'M', 14, true, 3.99f);

	System.out.println("Student Name :" + newObj.StName + ", ID :"+ newObj.stID + ", Sex :" + newObj.sex + ", Grade :" + newObj.grade + ", Java Programmer: " + newObj.programmer );
}
}
