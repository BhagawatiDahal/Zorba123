package onepractice;

public class PDay1 {
	
	public static void main(String[] args) {
		
		
		// Define a variable and do arithmetical operation
		
		
		int a=15;
		int b=5;
		
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		
		
		
		// Writing a method and calling
		calculator();
		name(5,7);
		
		calling(7,8);
		
		
		
		
		
		
	}

		
		
		//function without parameter and return type
		
		static void calculator() {
			System.out.println("hello");
			
		}
		
		
		//with parameter no return type
		
		
static void name(int x, int y) {
	
	System.out.println(x+y);
	System.out.println(x-y);
	
	
}
		


// with parameter and with return type



public static int calling( int x,  int y) {
	
	
	
	return x-y;
	
	
	
}




}	
	
	
	


