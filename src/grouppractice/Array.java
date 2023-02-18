package grouppractice;

import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// define arrays for simple
		
		
//		
//		int []abcd= {123, 233,455, 566};
//		
//		
//		int []abc= new int [4];
//		
//		abc[0]=123;
//		abc[1]= 233;
//		abc[2]=455;
//		abc[3]=566;
//		
//		
//		//System.out.println(abc[0]);
//		
//		
//		for(int i=0; i<abc.length; i++) {
//			
//		//System.out.println(i);	
//			
//			//System.out.println(abc[i]);
//			
//			
//		}
//		
//		
//		
//		//String[] cities= {"Ktm", "Pokhara", "Palpa", "Hetauda"};
//		
//		
//		String []cities1= new String[4];
//		
//		cities1[0]="Ktm";
//		cities1[1]= "Pokhara";
//		cities1[2]= " Palpa";
//		cities1[3]= "Hetauda";
//		
//		
//		for (int i=0; i<cities1.length; i++) {
//				
//		}
//		
//		System.out.println(Arrays.toString(cities1));	
//		
//		
//	
//		// char arrays
//		
//		char[]  mp= {'a','n', 'm','o','l'};
//		int sum=0;
//		
//		
//		
//		
//		
//		for (int i=0; i<mp.length; i++) {
//			//System.out.println(i);		
//			//System.out.println(mp[i]);
//			
//			
//		}
//		System.out.println(mp);
//		
//		String  firstName = "chinmay";
//		char [] ra = firstName.toCharArray(); //{'c','h','i','n','m','a','y'}
//		for(int i = 0 ; i < ra.length ; i++) {
//			//System.out.println(i);
//			System.out.println(ra[i]);
//		}
//		
//		
//		foor loop for single array
//		int num[]= {23,44, 55,66};
//		for (int i=0; i<num.length; i++) {
//			
//			System.out.println(num[i]);	
//		}
		
		
//		
//		// for each loop for single array
//		int num3[]= {23,44,55,66};
//		
//		for(int a:num3) {
//			
//		System.out.println(a);	
//			
//			
//		}
		
		
		
		
		
		
		// for loop for double array
		
//		
//		int [][] num1= {
//				{23, 333, 345, 789},
//				{789, 999, 768, 456},
//				{777, 888, 999, 677},
//				{666, 788, 990, 989}
//		};
//		
//		
//		
//		for (int i=0; i<num1.length; i++) {// for first array
//			
//			System.out.println(Arrays.toString(num1[i]));
//			
////			int []row =num1[i];// for second array
////			for(int j=0; j<row.length; j++) {// for second array
////				
////			System.out.println(row[j]);
////		}
//			
//		}
//		
		
		
		// for each loop for double Arrrays
		
		
//		
//		int[][] num3= {
//				//0		1	  2	     3		4
//				{1111, 2222, 33333, 5555, 6666},// 0
//				{4455, 7786, 9987, 4566, 33344},//1
//				{4563, 2311, 2223, 2234, 4545},//2
//				{1234, 4556, 7809, 3452, 2123} //3
//				};
	
		
		//int [] numm= { 1,3, 5, 789,677, 4657, 9876 };
		
		
		//System.out.println(num3[3][4]);
		
		
		//for loop for 2 dimentions Arrays
		
//		
//		for (int i=0; i<num3.length; i++) {
//		
//			int [] row=num3[i];
//			for(int j=0; j<row.length; j++) {
//				
//				
//			System.out.println(row[j]);	
//				
//			}	
//		}
		
		
		// three dimention array
		
		int [][][] num5= {
				
				{
					{112, 223, 455, 555},
					{334, 223, 667, 888},
					{678, 333, 223,  567},
					{456, 886, 556, 475}
				},
				
				{
					{677, 556, 999, 554, 111},
					{333, 444, 666, 998, 442},
					{334, 777, 988, 779, 465},
					{453, 476, 889, 776, 908}
				},
				
			
				{
					{ 678, 998, 443, 456},
					
					{ 564, 234, 449, 394}	
				}
			};
		
//		System.out.println(num5[1][3][4]);
//		System.out.println(num5[1][0][4]);
//		System.out.println(num5[1][1][3]);
//		System.out.println(num5[1][2][2]);
//		System.out.println(num5[2][1][3]);
//		
		
		
		
		// for loop for 3 dimention arrays
		
		
	//	for (int i=0; i<num5.length;i++) {
			
			//System.out.println(i);	
			
			
		
		// second arrays
//		int [][] row= num5[i];
//			for(int j=0; j<row.length;j++) {	
//				
//			//System.out.println(row[j]);
//				
//		//System.out.println(	Arrays.toString(row[j])	);
//			
//				
//			//third arrays
//			
//			int []row1=row[j];
//			for (int k=0; k<row1.length; k++) {
//				
//				
//			System.out.println(row1[k]);	
//				
//			}
//				
//			}	
//		}
		
		// for each loop for 3 dimentions arrays
		
		for(int [][]p:num5) {
		for( int m[]: p) {
		for(int n:m) {
			
		System.out.println(n);	
			
			}
			
			}
			
			}
		
		
		
		
		
		
		
		
	

		
		
	}

}
