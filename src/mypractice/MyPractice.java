package mypractice;

public class MyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.println("Hello World");
//		System.out.println("I am good");
//		System.out.println("hello");
//		System.out.println("I am principle");

		// String country = "Nepal";
		// int q2 = country.toUpperCase().toLowerCase().length();
		// System.out.println(q2);
		// "Nepal".length()
		// "5".toUpperCase()
		// System.out.println("5".toUpperCase());

		
		
		
		// compare city1 and city 3 with ternary operator

//		String result2 = city1.equals(city3) ? "equal" : "not equal";
//		System.out.println(result2);

//		String city = "kathmandu";
//		String city1 = "Pokhara";

//		String a = city.equals(city1) ? "equal" : "not equal";
//		System.out.println(a);

		
		
		
//		String sen1 = "I am learning javascript";
//		boolean result7 = sen1.contains("learning");
//		System.out.println(result7);
		
		
//		
//		String season1= "I am learning SQL";
//		boolean b= season1.contains("SQL");
//		
//		System.out.println(b);
//		
		
		
		
		
		//Program 6
		
//				String city6 = "chandrapur";
//				// index starts from zero
//				// 0   1   2   3   4   5   6   7   8  9
//				// c   h   a   n   d   r   a   p   u  r
//				char a = city6.charAt(4);
//				System.out.println(a);	 // d	
//				System.out.println(city6.length());
//
//				// length()-1 is always last index
//				
//				
//				String city7 = "jaipura";
//				//  0    1    2    3   4   5  6
//				//  j    a    i    p   u   r  a
//				int len = city7.length();
//				System.out.println(len);
//				
//				for(int i = 0 ; i < len ; i++) { //1 // 2 // 3 // 4 // 5 // 6
//					//System.out.println(i); 
//					System.out.println(city7.charAt(i));
					
					// i ---- 0 
					// i ---- 1
					// i ---- 2
					// i ---- 3
					// i ---- 4
					// i ---- 5
					
				
				
				// reverse the string
		
				
		//		String phone= "Iphone";
			//	String ph="";
				
				//char c= phone.charAt(5);
				{
			//	System.out.println(c);
				
				}
				//Write string
				
		//	int len= phone.length();
				
				{
				//System.out.println(len);
				}
				
//				for (int i=0; i<=len-1;i++) {
//					//System.out.println(i);// 0,1,2,3,4,5
//					
//					//System.out.println(phone);// Iphone, Iphone, Iphone, Iphone, Iphone, Iphone
//					
//					System.out.println(phone.charAt(i));
//				
//				}
				
				
				// Reversing the string at index
				
				
				
				
				
				
//				for( int i=len-1; i>=0; i-- ) {
//					//System.out.println(i);
//					
//				//	System.out.println(phone.charAt(i));
//					
//					// reversing the whole string in one  --------> enohpI
//					
//					ph= ph+phone.charAt(i);
//					System.out.println(ph); // e
//							
//				}
				
				
				
				
				
				
			// reversing the string
				
//				String desktop= "dell";
//				String desk= "";
//				
//				
//			for( int i=desktop.length()-1; i>=0; i--) {
//				
//			desk=desk+desktop.charAt(i);
//				
//				System.out.println(desk);
//				
//				
//				
//			}
				
				
				
				
			// program5
			// chinmay ----- vowels   "a" , "e" , "i" , "o" , "u"
			
//			String firstName = "chinmay";
//			int count = 0;
//			
//			
//			for(int i = 0  ; i < firstName.length() ; i++) {
//				System.out.println(firstName.charAt(i));
//				
//				if(firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
//					count = count + 1;
//				}
//					
//				
//			}
//			
//			System.out.println(count);
//			
			
					
			// Bhagawati ------vowels a, e, i, o, u
			String firstName= "Bhagawati";
			int count=0;		
			
			
			for (int i=0; i<firstName.length();i++) {
				System.out.println(firstName.charAt(i));
				
				
			}
			
			
			String name1= "Sonam";
			int count1 =0;
			
			for(int i=0; i<name1.length(); i++) {
				
				System.out.println(name1.charAt(i));
				
				if(name1.charAt(i)=='a'|| name1.charAt(i)== 'e' || name1.charAt(i)=='i' || name1.charAt(i)=='o' || name1.charAt(i)== 'u' ){
					count1=count1+1;
					
				}
				
				//System.out.println(count1);
				
			}
			
			System.out.println(count1);
			
			
			
			

		
		// check whether the given number is even or odd
			
			int a= 5;
			
			if ( a% 2 == 0) {
				System.out.println("The number is even");
				
			}else {
				
				System.out.println("The number is odd");
			}
			
			
			
			
			
			
		// check whether the number is prime: https://www.youtube.com/watch?v=-edAgWN1mQk
			// divisible by 1 and itself
		
			
		int num= 15;
		//int count=0; already did on last program
		//	1,2,3,4,5,6,7	
		// its divisible by 1 and if self, so count=2
		
		
		for(int i=1; i<=num;i++) {
			//System.out.println(i);
			
			if(num%i==0) {
				count++;
			}
			
		}
		
		if(count==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
				
				
				
				
	// calculate the factorial of given number :https://www.youtube.com/watch?v=MBUGwFXwN-I

	// factorial of 5! = 1*2*3*4*5
				  
		
		int num1=5;
		
		int fact=1;
		
		
		for(int i=1;i<=num1;i++) {
			fact=fact*i;
		}
		
		System.out.println(fact);
		
	
		
		
		
		
		
		
		
		
		
		

}
}




