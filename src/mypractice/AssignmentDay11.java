package mypractice;



public class AssignmentDay11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		
//		Human a = new Human();
//		int vli = a.Add();
//		System.out.println(vli);
//		
		// constructor with parameter
		
		Bank icici = new Bank(1000,123,"chinmay","current");
		Bank sbi = new Bank(10000,123,"chinmay","current");
		
		System.out.println(icici.accName);
		System.out.println(icici.accNo);
		System.out.println(icici.bal);
		System.out.println(icici.type);
		System.out.println(icici.country);
		
		int updatedBal = icici.deposit(1000);
		
		System.out.println(updatedBal);
		// default constructor also
		
		icici.withDrawl(3000);
		
		int updatedBal2 = icici.withDrawl(500);
		System.out.println(updatedBal2);
		icici.country = "Nepal";
		
		
		
		sbi.deposit(50000);
		
		
	
		// If the account type is saving  --- interest should  5%
		// If the account type is current --- interest should  10%
		
		
		icici.type= "saving";
		sbi.type= "current";
		if (icici.type== "saving") {
		System.out.println(" Intest rate is 5%");
		
		}else  if (icici.type=="current"){
			System.out.println(" Interest rate is 10%");
		}else {
			System.out.println("No Interest is avaliable");
		}
		
	
	if (sbi.type== "saving") {
		System.out.println(" Intest rate is 5%");
		
		}else  if (sbi.type=="current"){
			System.out.println(" Interest rate is 10%");
		}else {
			System.out.println("No Interest is avaliable");
		}
		
	
	
	// show the last five transactions in arrays
	
//int transactions[] = new int[5];
//transactions[0]=icici.deposit(50);
//transactions[1] =icici.withDrawl(200);
//transactions[2]=icici.deposit(60);
//transactions[3]=icici.withDrawl(20);
//transactions[4]=icici.withDrawl(50);
//	
int transactions[] = {icici.deposit(50),icici.deposit(200),icici.deposit(60),icici.withDrawl(-20),
icici.withDrawl(-50),};
//int transactions[] = {icici.deposit(50),icici.deposit(200),icici.deposit(60),icici.withDrawl(20),
//icici.withDrawl(50),};
//	
	
	
	for ( int i=0; i<transactions.length; i++) {
		System.out.println(transactions[i]);
	}
	
	}
}
	


//class Human {
//	int i = 0;
//	public Human() {
//		System.out.println("Constructor called");
//		i = 5;
//	}
//	
//	public int Add() {
//		return this.i;
//	}
//}


class Bank{
	
	int bal;
	int accNo;
	String accName;
	String type;
	String country ;
	int transactions [];
	int amount;
	
	public Bank(int bal, int accNo, String accName , String type) {
		this.bal = bal; 
		this.accNo = accNo;
		this.accName  =accName;
		this.type = type;
		this.country = "India";
		this.transactions = new int[5];
		
		
		
		
	}
	
	public int deposit(int amount) {
		this.amount= amount;
		this.bal = this.bal + amount;
		System.out.println("Deposit successful");
		//return this.bal;
		return amount;
	}
	
	public int withDrawl(int amount) {
		
		this.amount= amount;
//		if(this.bal > amount) {
//			this.bal = this.bal - amount;// remaining balance after with draw
//			return this.bal;
//		}
//		else {
//			System.out.println("In sufficient balance");
//			return this.bal;
//		}
		return amount;
		
		
		
		
		
		
		
		
		
	}
	
	// Assignment
	
	// If the account type is saving  --- interest should  5%
	// If the account type is current --- interest should  10%
	
	// show the last five transactions 
	
	
	
	}


