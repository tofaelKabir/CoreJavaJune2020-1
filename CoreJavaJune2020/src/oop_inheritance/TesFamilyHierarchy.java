package oop_inheritance;


public class TesFamilyHierarchy {

	public static void main(String[] args) {

		MyGrandfather grandfather = new MyGrandfather();
		grandfather.grandfatherinfo();
		System.out.println("\n*****************************");

		Me me = new Me();
		me.myInfo();
		me.fatherInfo();
		System.out.println("\n*****************************");

		MyAunt myAunt = new MyAunt();
		myAunt.auntInfo();
		
		MyFather myFather = new MyFather();
		myFather.fatherInfo();
		
		MySister mySister = new MySister();
		mySister.sisterInfo();
		
		MyNephew myNephew = new MyNephew();
		myNephew.nephewInfo();
		
		MySon mySon = new MySon();
		mySon.sonInfo();
		
		
	}

}
