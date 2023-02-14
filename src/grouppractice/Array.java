package grouppractice;

import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// define arrays for simple
		
		
		
		int []abcd= {123, 233,455, 566};
		
		
		int []abc= new int [4];
		
		abc[0]=123;
		abc[1]= 233;
		abc[2]=455;
		abc[3]=566;
		
		
		//System.out.println(abc[0]);
		
		
		for(int i=0; i<abc.length; i++) {
			
		//System.out.println(i);	
			
			//System.out.println(abc[i]);
			
			
		}
		
		
		
		//String[] cities= {"Ktm", "Pokhara", "Palpa", "Hetauda"};
		
		
		String []cities1= new String[4];
		
		cities1[0]="Ktm";
		cities1[1]= "Pokhara";
		cities1[2]= " Palpa";
		cities1[3]= "Hetauda";
		
		
		for (int i=0; i<cities1.length; i++) {
				
		}
		
		System.out.println(Arrays.toString(cities1));	
		
		
	
		// char arrays
		
		char[]  mp= {'a','n', 'm','o','l'};
		
		;
		
		
		for (int i=0; i<mp.length; i++) {
			System.out.println(i);		
			System.out.println(mp[i]);
			
			
		}
		
		
		String  firstName = "chinmay";
		char [] ra = firstName.toCharArray(); //{'c','h','i','n','m','a','y'}
		for(int i = 0 ; i < ra.length ; i++) {
			//System.out.println(i);
			System.out.println(ra[i]);
		}
		
		
		
		
	}

}
