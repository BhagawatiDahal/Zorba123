package twopractice;

public class Pday17Abstration {

	public static void main(String[] args) {
	
		
		ChaseB cb= new ChaseB();

		cb.loan1();
		cb.deposit();
		cb.BranchCity();
		
	}

}

// Abstration
// 1.creating abstract class
// Abstract class can have method with definition only
// Abstract class can have normal method
// Abstract class can have abstract methods
// you can not create object of the abstract class
// when creating the child class , it must use the unimplemented abstratc method first

abstract class WorldBankA{ // Abstract class
	

	abstract public void loan1(); // Abstract method
	abstract public void deposit();// Abstract method
	
	
	
	public void displayCityName(String cityname) { // normal method
		
		System.out.println(cityname);
		
	}
}



class ChaseB extends WorldBankA{

	
	public void loan1() {
		System.out.println("ChaseB loan interes is: "+9);
	}

	
	public void deposit() {
		
		
		System.out.println("ChaseB deposit rate is "+6);
	}


	public void BranchCity() {
		System.out.println(" Chitwan");
		
	}
	
	
	
}





