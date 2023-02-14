package mypractice;

import java.util.Arrays;

public class MyPractic6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = new String[5];
		// String namess[]= new String [5];

		names[0] = "amol";
		names[1] = "sarika";
		names[2] = "poorva";
		names[3] = "ajay";
		names[4] = "bikram";

		System.out.println(names);
		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i++) {

			System.out.println(names[i]);
		}

		System.out.println(names[0]);

		////////////////////////////////

		String[] cities = { "ktm", "pokhara", "Hetauda", "Dang" };

		System.out.println(cities[2]);

		for (int i = 0; i < cities.length; i++) {

			System.out.println(cities[i]);
		}

		////////////////////////////// sum of the number from the array

		// int []numbers1= {22,33,44,55,66};
		int[] numbers = new int[3];

		numbers[0] = 11;
		numbers[1] = 22;
		numbers[2] = 33;

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum = sum + numbers[i];
			// System.out.println(sum);
		}

		System.out.println(sum);

		///////////////////////////////////// making string to Array of String

		String info = "I am learning javascript";

		String[] info1 = info.split(" ");
		System.out.println(info1);
	
        for (int i = 0; i < info1.length; i++) {
			System.out.println(info1[i]);

		}
		
		
		////////////////////// String to Array of Char
		
		
		String cityname="Chitwan";
		
		char[] cn=cityname.toCharArray();
		//System.out.println(cn);
		
		for(int i=0; i<cn.length; i++) {
			
			
			System.out.println(cn[i]);
		}
		
		
		
		////////////////////////for each loop
		
		
		int age[]= {2,11,22,33};
		
		for(int i:age)
		System.out.println(i);
		
		
		
		String namee[]= {"amol","ram","sachin","satish"};
		
		for(String i:namee) {
			
			System.out.println(i);
			
			
		}
		
		
		
		
		
		char [] nn = {'a','m','o','l'};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String rev = "";
//		// amol
//		for(char i:nn) {
//			rev = rev + i;
//		}
//		System.out.println(rev);		
//		
		
		
		
		
		
		

	}

}
