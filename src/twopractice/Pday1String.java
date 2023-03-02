package twopractice;

public class Pday1String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//escaping characters
		
		String quote= "Ram said\"he can jump from the height\"";
		System.out.println(quote);
		
		
		// replace
		
		String city1= " I am learning java. java is fun";
		String res2=city1.replaceFirst("java", "script");
		System.out.println(res2);
		
		
		
		// contains
		
		String city= " nawalpur";
		boolean result=city.contains("ur");
		System.out.println(result);
		
		
		
		String city12= "kathmandu";
		char ab=city12.charAt(7);
		System.out.println(ab);
		
		
		
		String city13= "Bharatpur";
		
		for (int i=0;i<city13.length(); i++) {
			//System.out.println(i);
			System.out.println(city13.charAt(i));
		}
		
		
		for(int i=city13.length()-1; i>=0; i--) {
			System.out.println(city13.charAt(i));
		}
		

// reversing the string 
		String rev="";
		for (int i=0; i<city13.length(); i++) {
		rev= city13.charAt(i)+rev;	
		}
		
		System.out.println(rev);
		
		
		String fruit = "apple banana mango papaya";
	boolean result3=	fruit.contentEquals("guava");
		
	if(result3) {
		System.out.println("Fruit is avaliable");
	}else {
		System.out.println(" fruit is not available");
	}
	
	
	// vowel count
	
	
	String vob= "Bhagawati dahal";
	int count=0;
	
	for(int i=0; i<vob.length();i++) {
		System.out.println(vob.charAt(i));
		
		
		if(vob.charAt(i)=='a'||vob.charAt(i)=='e'||vob.charAt(i)=='i'||vob.charAt(i)=='o'||vob.charAt(i)=='u') {
			count= count +1;
		}
	}
	System.out.println(count);
	
	
	int numbersD [][] = {
			{88,888,8888},
			{99,999,9999},
			{66,666,6666}	
	} ;
	
	for (int i=0; i<numbersD.length; i++) {
		
		int row[]=numbersD[i];
		for(int j=0; j<row.length; j++) {
			System.out.println(row[j]);
		}
	}
	
	for(int[] q:numbersD) {
		for(int s:q) {
			System.out.println(s);
		}
	}
	
	
	
	int[] numbersb = new int[3];
	numbersb[0] = 11;
	numbersb[1] = 22;
	numbersb[2] = 33;
	
	int sum=0;
	int avg=0;
	for(int i=0; i<numbersb.length; i++) {
		sum=sum+numbersb[i];
	}
	System.out.println(sum);
	avg= sum/numbersb.length;
	System.out.println(avg);
	
	}
	

}
