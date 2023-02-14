
public class Variety1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String three = "I am learning ";
		String four = "java !";
		String five = three.concat(four).concat("Happy learning !");
		//            "I am learning java"             
		System.out.println(five);
		
		
	
		// Program1

				// "pune" == "pune"

				String city1 = "pune";
				String city2 = "pune";
				String city3 = "mumbai";
				

				boolean result = city1.equals(city2);
				System.out.println(result);
				if (result) {
					System.out.println("city 1 and city2  equal");
				}
				else {
					System.out.println("city 1 and city2 are not equal");
				}
				
				// compare city1 and city 3 with ternary operator
				
				String result2 = city1.equals(city3) ? "equal":"not equal";
				System.out.println(result2);

				

				//String example = "Best quote "Try try but donot cry"";
				String example = "Best quote \"Try try but donot cry\""; 
				System.out.println(example);
				// Escaspe character
		
		
				String sen1 = "I am learning javascript";
				boolean result7 = sen1.contains("learning");
				System.out.println(result7);
				
				// Program5
				String sen2 = "I am learning javascript and javascript is great";
				String result8 = sen2.replace("j", "K");
				System.out.println(result8);
				
				String result9 = sen2.replaceAll("javascript", "java");
				System.out.println(result9);
				
				
				String result10 = sen2.replaceFirst("javascript", "java");
				System.out.println(result10);
				
				
				
				
				
				String city7 = "jaipura";
				//  0    1    2    3   4   5  6
				//  j    a    i    p   u   r  a
				int len = city7.length();
				System.out.println(len);
				
				for(int i = 0 ; i < len ; i++) { //1 // 2 // 3 // 4 // 5 // 6
					//System.out.println(i); 
					System.out.println(city7.charAt(i));
						
	}
				
				
				String country = "nepal"; 
				String rev  = "";
				
				for(int i = 0 ; i < country.length() ; i++) {
					//System.out.println(i);
					//System.out.println(country.charAt(i));
					
					rev = country.charAt(i) + rev;
					System.out.println(rev);
					//	        "n"         + ""     =====> n
					//          "e"         + "en"   =====> en
					//          "p"         + "pen"   =====> pen
					//          "a"         + "apen"  ======> apen
					//          "l"         + "lapen"  ======>lapen
				}
				
				System.out.println(rev);
				
				// program 4
				String fruits = "apple mango banana grapes papaya";
				String userInput = "banana";
				if(fruits.contains(userInput)) {
					System.out.println("Fruit is available");
				}
				else {
					System.out.println("Fruit not available");
				}
				
				// program5
				// chinmay ----- vowels   "a" , "e" , "i" , "o" , "u"
				
				String firstName = "chinmay";
				int count = 0;
				
				
				for(int i = 0  ; i < firstName.length() ; i++) {
					System.out.println(firstName.charAt(i));
					
					if(firstName.charAt(i) == 'a' || firstName.charAt(i) == 'e' || firstName.charAt(i) == 'i' || firstName.charAt(i) == 'o' || firstName.charAt(i) == 'u') {
						count = count + 1;
					}
						
					
				}
				
				System.out.println(count);
				
				
				
				
				
				String str2 = "java is fun";
				String q1 = str2.substring(0, 4); // End value is not included
				System.out.println(q1);

				// 0 1 2 3 4 5 6
				// p r o g r a m

				String str3 = "program"; // end index is optional
				String q2 = str3.substring(2);
				System.out.println(q2);
				// 0 1 2 3
				// p u n e
				String str4 = "pune";
				String q4 = str4.substring(1, 3);
				System.out.println(q4);

				// Join

				String str = "Hi";
				String str5 = "I am learning";
				String str6 = "java";

				String h = String.join(" ", str, str5, str6);
				System.out.println(h);

				String str7 = "chinmaydeshpande";
				String str8 = "gmail.com";
				String str9 = String.join("@", str7, str8);
				System.out.println(str9);

				String str10 = "chinmay";
				String str11 = "shirish";
				String str12 = "deshpande";
				// chinmay-shirish-deshpande
				String q3 = String.join("-", str10, str11, str12);
				System.out.println(q3);

				// progra3

				String city6 = "Nagpur"; //
				// 012345
				// Nagpur

				int q5 = city6.indexOf('a');
				System.out.println(q5);
				//String city7 = "samay";
				// 0 1 2 3 4 5
				// s a m a y a
				int q6 = city7.indexOf("a", 4);
				System.out.println(q6);

				String city8 = "samaya dani";

				for (int i = 1; i < city8.length(); i++) {
					if (city8.charAt(i) == 'a') {
						System.out.println(i);
					}
				}

				// chinmay deshpande

				String city9 = " Learning java is fun ";
				String city10 = city9.trim();
				System.out.println(city10.length());
				System.out.println(city9.length());

				// If want to remove spaces in between
				String q11 = city10.replace(" ", "");
				System.out.println(q11);

				// Program4

				String q12 = "I am learning css";
				// ["I","am","learning","css"];
				String[] q13 = q12.split(" ");
				System.out.println(q13);
//				String result = "";
		//
//				for (String strs : q13) {
//					System.out.println(strs);
//				}
				
				//program5 
				
				String firstName1 = "I am learning java";
				String firstName2 = "";
				
				boolean q111 = firstName1.isEmpty();
				System.out.println(q111);
				
				boolean q112 = firstName2.isEmpty();
				System.out.println(q112);
				
			
				
				char aa [] = {'a','p','p','l','e'};
				for(int i = 0 ; i < aa.length ; i++) {
					System.out.println(i);
					System.out.println(aa[i]);
				}
				
				// program 7
				
				String  firstName11 = "chinmay";
				char [] ra = firstName11.toCharArray(); //{'c','h','i','n','m','a','y'}
				for(int i = 0 ; i < ra.length ; i++) {
					System.out.println(i);
					System.out.println(ra[i]);
				}
				
				
	
				

}
}
