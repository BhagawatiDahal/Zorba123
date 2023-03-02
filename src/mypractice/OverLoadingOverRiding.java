package mypractice;

public class OverLoadingOverRiding {
	
	
	public static void main(String[] args) {
		
		
		
		
	//calling method/ function
	
		movies();
		movies(123);
		movies(123,"Fulbari");
		
		
		
		Chase b= new Chase(456, "Chicago", 33);
		b.deposit(5);
		b.Loan(9);
		
		
		
		
		
		
		
		
	
			}

		public static void movies() {
			System.out.println();
		}
		
		
		
		public static void movies(int x ) {
			
			System.out.println( "the id of the movie is: "+x);
			
		}
		
		
		public static void movies( int x, String movieName) {
			
		System.out.println("the id of the movie is: "+x);
		
	    System.out.println("movie name is: "+movieName);
		}	
		
}	
	


//method overriding



	class WorldBank{
		
		int pincode;
		String city;
		
		
		public WorldBank(int pincode, String city){
			
		this.pincode=pincode;
		this.city=city;
			
		}
		
		
		public void deposit(int x) {
			
			System.out.println(" Worldbanks's Intresrst for deposit saving is "+ x);
			
		}
		
		
	
		public void Loan(int x) {
			
			System.out.println("World bank's loan rate is: "+ x);
			
			
		}
		
	}
	
	
	class Chase extends WorldBank{
		int bcode;

		public Chase(int pincode, String city, int bcode) {
			super(pincode, city);
			this.bcode=bcode;
		}
		
		
		
		
		public void deposit(int x) {
			
			System.out.println("chasebanks's Intresrst for deposit saving is "+ x);
			super.deposit(x-2);
			
		}
		
		
	
		public void Loan(int x) {
			
			System.out.println("Chasebank's loan rate is: "+ x);
			super.Loan(14);
			
			
		}
		
		
		
		
	}
	
