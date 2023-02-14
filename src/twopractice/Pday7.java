package twopractice;

import java.util.Arrays;

public class Pday7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Int Array

		int[][] numbers = {

				{ 55, 78, 99 }, { 67, 77, 89 }

		};

		System.out.println(numbers[0][2]);

		System.out.println(numbers[1][2]);

		// pringting the array values

		for (int i = 0; i < numbers.length; i++) {

			// System.out.println(Arrays.toString (numbers[i]));

			// System.out.println(numbers[i]); }
			int[] r = numbers[i];
			for (int j = 0; j < r.length; j++) {

				System.out.println(r[j]);
			}

		}

		int num[][] = {

				{ 1234, 123333, 2345, 678 }, { 2334, 45567, 879433 } };

		for (int i = 0; i < num.length; i++) {

			int m[] = num[i];
			for (int j = 0; j < m.length; j++) {

				System.out.println(m[j]);
			}
		}

		// for each loop

		int[] anum = { 12, 45, 67 };

		for (int a : anum) {
			System.out.println(a);
		}

		// multiple dimentional array

		int[][] bnum = { { 4444, 567, 879, 980 }, { 768, 345, 678 }, { 777, 333, 455 } };

		for (int[] ab : bnum) {

			for (int abc : ab) {
				System.out.println(abc);

			}

		}

		/// for each loop

		int cnum[][][] = {

				{ { 123, 456, 777, 925 }, { 344, 235, 456 }

				},

				{

						{ 444, 666, 7777, 877 }, { 322, 345, 677, 889 }

				}

		};

		for (int[][] abcd : cnum) {

			for (int[] az : abcd) {

				for (int aa : az) {
					System.out.println(aa);

				}

			}

		}
		
		//  for loop
		for (int i=0; i<cnum.length; i++) {
			
			int[] []r= cnum[i];
			for (int j=0; j<r.length; j++) {
				
			int []rm= r[j];	
			for(int k=0; k<rm.length; k++) {
				
				
				System.out.println(rm[k]);
				
			}
				
			}
			
		}
		
		
		
		

	}

}
