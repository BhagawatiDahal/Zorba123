package mypractice;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
	
	String name = "Bhagawati";
	int name1= name.length();
	
	System.out.println(name1);
	
	
//	
//	for (int i=9; i>=0; i-- ){
//		System.out.println(i);
//	}
//	
	
	for (int i=8;i>=0; i--) {
		
		System.out.println(name.charAt(i));
		
		}
	
	//or
	
	for (int i=name1-1;i>=0; i--) {
		System.out.println(name.charAt(i));
	}
	
	
	
	//or
	
	for (int i= name.length()-1; i>=0; i--) {
		System.out.println(name.charAt(i));
		
	}
	
	
	
	}
}