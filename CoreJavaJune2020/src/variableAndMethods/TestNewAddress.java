package variableAndMethods;

public class TestNewAddress {
	public static void main(String[] args) {
		NewAddress myAddress = new NewAddress();  //instantiated
		myAddress.Name = "TOFAEL";
		myAddress.houseNumber = 625;
		myAddress.houseDirection = 'W';
		myAddress.stNumber = 57;
		myAddress.state = "NY";
		myAddress.zipCode = 10029;
		myAddress.InUSA = true;
		myAddress.myInfo();
		
		NewAddress shamimAddress = new NewAddress();
		shamimAddress.Name ="SHAMIM";
		shamimAddress.houseNumber = 505 ;
		shamimAddress.houseDirection = 'B';
		shamimAddress.stNumber = 5208;
		shamimAddress.state = "TX";
		shamimAddress.zipCode = 75013;
		shamimAddress.InUSA = true;
		shamimAddress.myInfo();
		
				

	}

	}

