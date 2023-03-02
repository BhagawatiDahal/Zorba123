package grouppractice;

public class PracticeDay10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Bank chase= new Bank (123,2000,"Bhagawati","checking");
		
		int updatedbal=chase.deposit(1000);
	   System.out.println(updatedbal);   //3000
	
				
	   // updatedbal=3000
	   
	   
	   
	   
	   
	   
				 
				
	}
}

class Bank{
int accno;
int bal;
String accName;
String accType;
String Country;
int transations[]=new int [5];
	 
	
	public Bank(int accno, int bal, String accName,String accType) {
	 this.accno=accno;
     this.bal=bal;
     this.accName=accName;
     this.accType=accType;
	 this.Country="Nepal";
     this.transations=new int[5];
		
	}
	
	public int deposit(int amount) {
		bal=bal+amount;
		//System.out.println(bal);
		return this.bal;
		
	}
	
	public int withDrawl(int amount  ) {
		
		
		
		
		
		return this.bal;
		
		
		
		
	}
	
	
	
}