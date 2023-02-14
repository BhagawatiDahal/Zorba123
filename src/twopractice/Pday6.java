package twopractice;

import java.util.Arrays;

public class Pday6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// two differnt ways of defining arrays

		// String [] names1= {"Bhagawati", " Anjila", " Sabnam", "Prajani", " Sharmila",
		// " Chunnu"};

		// or

		String[] names = new String[6]; //
		names[0] = "Bhagawati";
		names[1] = "Anjila";
		names[2] = "Sabnam";
		names[3] = "Prajani";
		names[4] = "Sharmila";
		names[5] = "Chunnu";

		// finding the sum of the arrays

		int[] num = { 20, 25, 30, 35 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];

		}
		System.out.println(sum);

		// spliting the string

		String cities = "Ktm Pokhara Dang Chitwan Hetauda";

		String[] Sp = cities.split(" ");
//		System.out.println(Sp);
//		System.out.println(Arrays.toString(Sp));

		
		for (int i = 0; i < Sp.length; i++) {

			System.out.println(Sp[i]);

		}
		
		
		String city="Bharatpur";
		char[] bb =city.toCharArray();
		
		for ( int i=0; i<bb.length; i++) {
			System.out.println(bb[i]);
		}

		
		
		// For Each loop
		
		
		
		
		
		
		
		
		
		
	}

}
