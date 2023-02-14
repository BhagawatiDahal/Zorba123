package mypractice;

public class MyPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Method Overloading;
		
		// same class, same method name, different signature
	
//additionA(1);
//additionA(11,22);
//additionA(11,22,33);

int a=5;
int b= 6;

calculator(a, b);
System.out.println(a+b);
System.out.println(a-b);

	}
//	
//	static void additionA(int x) {
//		System.out.println(x);
//	}
//	
//	
//	static void additionA(int x, int y) {
//		
//	System.out.println(x+y);	
//		
//	}
//	
//	static void additionA(int x, int y, int z) {
//		
//	System.out.println(x+y+z);	
//		
//	}
//	
	
	public static int calculator(int a, int b) {
		System.out.println(a-b);
		System.out.println(a+b);
		return a+b;
			
		
	}
	
	
	
	
	
	
	
	

}
