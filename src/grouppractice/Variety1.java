package grouppractice;

public class Variety1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
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
				
			//---------------------------------
				String fruit = "applep";
				int a = fruit.indexOf('p', 3);
				System.out.println(a);
				
				int count1 = 0;
				for (int i = 0; i < fruit.length(); i++) {

					if (fruit.charAt(i) == 'p') {
						System.out.println(i);
						count1 = count1 + 1;
						}
				}
				System.out.println(count);
				//--------------------------------------
				
				String cities [] = new String[3];
				cities[0] = "pune";
				cities[1] = "bangalore";
				cities[2] = "nagpur";
				
				for(int i = 0 ; i < cities.length ; i++) {
					//System.out.println(i);
					System.out.println(cities[i]);
				}
				
			//------------------------------------------------	
				String e = "I am learning java";
				String ra2 [] = e.split(" ");
				String ra3 [] = e.split("a");
				
				//{"I","am","learning","java"}
				//{"I ","m le","rning ","j","va"}
			
				for(int i = 0 ; i < ra2.length ; i++) {
					//System.out.println(i);
					System.out.println(ra2[i]);
				}	
			//----------	
				

				int[] numbersb = new int[3];
				numbersb[0] = 11;
				numbersb[1] = 22;
				numbersb[2] = 33;

				// 0 1 2
				// [11,22,33]

				int sum = 0;

				for (int i = 0; i < numbersb.length; i++) {
					// System.out.println(i);
					// System.out.println(numbersb[i]);

					sum = sum + numbersb[i];
					// 0 + 11 =======> 11
					// 11 + 22 =======> 33
					// 33 + 33 ========>66
				}

				System.out.println(sum);
				
				
				
			//---------------------------------------	
				
				String citiName = "Nagpur";
				// ['N','a','g','p','u','r']
				char  bb [] = citiName.toCharArray();
				
				//System.out.println(bb);// y not reference
			
				for(int i = 0 ; i < bb.length ; i++) {
					System.out.println(bb[i]);
				}	
				
				
				//-------------------------
				
				//for each loop

				// program 4
				int age [] = {2,11,22,33};
				System.out.println("for -each loop");
				
				for(int ab:age) {
					System.out.println(ab);
				}
				
				// javascript --- for , map()
				
				String [] namesi = {"amol","ram","sachin","satish"};
				for(String s:namesi) {
					System.out.println(s);
				}
				
				char [] nn = {'a','m','o','l'};
				String rev = "";
				// amol
				for(char i:nn) {
					rev = rev + i;
				}
				System.out.println(rev);
				
				
				// program 5
				
				int numbersc [] = {3,44,55,66,77,88,9,44};
				// sum and average
				
				int suma = 0;
				float avg =0;
				
				for(int a1:numbersc) {
					suma = suma + a1;
				}
				
				System.out.println(suma);
				avg = suma/numbersc.length;
				System.out.println(avg);
				
				
				
				
			//----------------------------
				

				int [][] a1 = {
						{1,22,333},
						{4444,55555,666666,7777777},
						{88888888}		 
				};
				
				
				System.out.println(a1[0][2]); // 3
				System.out.println(a1[1][3]);  // 7
				System.out.println(a1[2][0]);// 8
				
				for(int i = 0 ; i < a1.length; i++) {
						//System.out.println(i);
					    //System.out.println(a1[i].length);
						int[] r= a1[i];
						for(int j = 0 ; j < r.length ; j++) {
							System.out.println(r[j]);
						}
					
				}
				
		//---------------------		
				int numbersB [] = {11,22,33};
				for(int q1:numbersB) {
					System.out.println(q1);
				}
				
				
		//-------------------------------
				
				
				int numbersC [][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}	
				} ;
				
				for(int [] q1:numbersC) {
					//System.out.println(q1);
					//System.out.println(Arrays.toString(q1));
					for(int q2:q1) {
						System.out.println(q2);
					}
				}
				
				
				
				//--------------------------
				
				
				
				int ccc [][][] = new int [3][3][3];
				
				ccc[0][0][0] = 1;
				ccc[0][0][1] = 2;
				ccc[0][0][2] = 3;
				
				ccc[0][1][0] = 11;
				ccc[0][1][1] = 22;
				ccc[0][1][2] = 33;
				
				ccc[0][2][0] = 111;
				ccc[0][2][1] = 222;
				ccc[0][2][2] = 333;
				
				//-----------------------------------------------------------
				ccc[1][0][0] = 1111;
				ccc[1][0][1] = 2222;
				ccc[1][0][2] = 3333;
				
				ccc[1][1][0] = 111;
				ccc[1][1][1] = 222;
				ccc[1][1][2] = 333;
				
				ccc[1][2][0] = 1;
				ccc[1][2][1] = 2;
				ccc[1][2][2] = 3;
				
				//
				
				ccc[2][0][0] = 1111;
				ccc[2][0][1] = 2222;
				ccc[2][0][2] = 3333;
				
				ccc[2][1][0] = 111;
				ccc[2][1][1] = 222;
				ccc[2][1][2] = 333;
				
				ccc[2][2][0] = 1;
				ccc[2][2][1] = 2;
				ccc[2][2][2] = 3;
				
				
				for(int i = 0 ; i < ccc.length ; i++) {
					System.out.println(ccc[i]);
					int cc [][] = ccc[i];
					for(int j = 0 ; j < cc.length ; j++) {
						//System.out.println(cc[j]);
						int c [] =cc[j];
						for(int l = 0 ; l < c.length ; l++) {
							System.out.println(c[l]);
						}
					}
				}
				
				for(int [][] qq:ccc) {	
					for(int [] q:qq) {
						for(int qr:q) {
							System.out.println(qr);
						}
					}
				}
				
				
				
				
				//---------
				
				
				
				
				
				
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
				int qq6 = city6.indexOf("a", 4);
				System.out.println(qq6);

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
					//System.out.println(i);
					System.out.println(ra[i]);
				}
				
				
	
				

}
}
