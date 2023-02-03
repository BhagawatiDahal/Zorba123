package mypractice;

public class Day1String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city1 = "kathmandu";
		String city2 = "palpa";
		String city3 = "kathmandu";

		boolean r = city1.equals(city3);
		System.out.println(r);

		
		
		if (r) {
			System.out.println("city1 and city3 are equal");
		} else {
			System.out.println("city1 and city3 are not equal");

		}
		
		
		

		// compare city1 and city2 with ternary operator

		String a = city1.equals(city2) ? "Equal" : "not Equal";

		System.out.println(a);

		String b = city1.equals(city3) ? "Equal" : "not Equal";

		System.out.println(b);
		
		
		
		
		// escape character
		
		String escape= "Best quote is \"Try try but donot cry\"";
		System.out.println(escape);
		
		
		
		
		String cityk = "Pokhara";
		boolean c = cityk.startsWith("P");
		boolean d = cityk.startsWith("Pok");
		System.out.println(c);
		System.out.println(d);
		
		
		
		String city5= "Wardha";
		boolean e= city5.endsWith(a);
		boolean f= city5.endsWith("dha");
		System.out.println(e);
		System.out.println(f);
		
		
		
		
		String city6 = "I am learning javascript";
		boolean g = city6.contains("learning");
		System.out.println(g);
		
		
		
		String sen2= "I am learning javascript and javascript is great";
		String h= sen2.replace("j" , "K");
		System.out.println(h);
		
		String result9 = sen2.replaceAll("javascript", "java");
		System.out.println(result9);
		
		
		
		String result10 = sen2.replaceFirst("javascript" , "java");
		
		System.out.println(result10);
		
		
		
		
		// Program 
		
		String city7= "chandrapur";
		// index star from zero
		// 0	1	2	3	4	5	6	7	8	9	
		// c	h	a	n	d	r	a	p	u	r
		char m= city7.charAt(4);
		System.out.println(m);
		
		System.out.println(city7.length());
		
		// length()-1 is always last index
		
		
		
		
		
		
	}

}
