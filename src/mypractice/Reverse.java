package mypractice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		//Program 1
//		
//		for(int i = 5 ; i >=2 ; i--) { // 4  // 3 // 2 // 1
//			System.out.println(i); // 5 // 4 // 3 // 2
//		}
//	
//		// Program 2
//		
//		int y7 = 8;
//		while(y7 >= 1) {
//			
//			if(y7 == 4) {
//				y7 --; // 3
//				continue;
//			}
//			System.out.println(y7); // 8 // 7 // 6 // 5 // 3 // 2 // 1
//			y7 --; // 7 // 6 // 5 // 4 // 2 // 1 // 0
//		}
//		
//		
//		
//		//Program 3
//		
//
//		String k = "i am learning javascript";
//		for(int i = 0 ; i < k.length() ; i++) {
//			if(k.charAt(i)=='a') {
//				System.out.println(i);
//			}
//			
//		}
//		
//		
//	//	Program 4
//		
//		
//		int [] numbers = {11,22,33,44};
//		int sum = 0;
//		
//		for(int i = 0 ; i < numbers.length ; i++) {
//				sum = sum + numbers[i];
//		}
//		System.out.println(sum);
//		
//
//		for(int i:numbers) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
//		
//		
//		
//		//Program 5
//		
//		
//		
//		int i8 = 1 ;
//		while(i8 <= 5) {
//			if(i8 == 2) {
//				i8 ++;  // 3
//				continue;
//			}
//			System.out.println(i8);  // 1 
//			i8++;  // 2
//		}
//		
//		
//		//Program 5
//		
//		String city6 = "chandrapur";
//		// index starts from zero
//		// 0   1   2   3   4   5   6   7   8  9
//		// c   h   a   n   d   r   a   p   u  r
//		char a = city6.charAt(4);
//		System.out.println(a);	 // d	
//		System.out.println(city6.length());
//
//		// length()-1 is always last index
//		
//		
//		// Program 6
//		
//		String city7 = "jaipura";
//		//  0    1    2    3   4   5  6
//		//  j    a    i    p   u   r  a
//		int len = city7.length();
//		System.out.println(len);
//		
//		for(int i = 0 ; i < len ; i++) { //1 // 2 // 3 // 4 // 5 // 6
//			//System.out.println(i); 
//			System.out.println(city7.charAt(i));
//			
//		}
//		
//		
//// Program 7
//		String country = "nepal"; 
//		String rev  = "";
//		
//		for(int i = 0 ; i < country.length() ; i++) {
//			//System.out.println(i);
//			//System.out.println(country.charAt(i));
//			
//			rev = country.charAt(i) + rev;
//			System.out.println(rev);
//			//	        "n"         + ""     =====> n
//			//          "e"         + "en"   =====> en
//			//          "p"         + "pen"   =====> pen
//			//          "a"         + "apen"  ======> apen
//			//          "l"         + "lapen"  ======>lapen
//		}
//		
//		
//		System.out.println(rev);
//		
//		
//		
//		// Program 7
//		
//		
//		String firstName = "chinmay";
//		int count = 0;
//		
//		
//		for(int i = 0  ; i < firstName.length() ; i++) {
//			System.out.println(firstName.charAt(i));
//			
//			if(firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
//				count = count + 1;
//			}
//				
//			
//		}
//		
//		System.out.println(count);
//		
//		
		
		// Program 8
		
		
		String fruit = "applep";
		int ab = fruit.indexOf('p', 3);
		//System.out.println(ab);
		int count1 = 0;
		for (int i = 0; i < fruit.length(); i++) {

			if (fruit.charAt(i) == 'p') {
				//System.out.println(i);
				count1 = count1 + 1;
			}
		}
		System.out.println(count1);
		
		
		 //Program 9
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
