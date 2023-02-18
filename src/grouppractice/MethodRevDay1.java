package grouppractice;

public class MethodRevDay1 {

	public static void main(String[] args) {

		cal();
		cal1(6,5);
//		cal2(5,10);
		
		
	int q1=cal2(5,10);
	System.out.println(q1);
	System.out.println(q1+5);
	
	
	
	int q2= cal3(q1,5);
System.out.println(q2);



int ac= addition12(6,7,8);
System.out.println(ac);

System.out.println(ac/3);

System.out.println("*********************");




addition6(ac,5);



System.out.println();


	}
	
	
	
	
	static int addition6(int x, int y) {
		
		
		System.out.println(x*y);
		return x+y;
	}
	
	
	
	
	
	
	

	// method with out parameter and without return type

	static void cal() {
		System.out.println("a+b");
		System.out.println(10 + 20);

	}

	// method with parameter and without return type

	static void cal1(int a, int b) {
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	

	
	
	
	
	
	
	//method with parameter and return type
	
	static int cal2(int a, int b) {
		
		System.out.println(a+b);
		
		return a+b;
		
	}
	
	static int cal3(int x, int y) {
	System.out.println(x-y);
	return x-y;
	
	}
	
	
	static int addition12(int x, int y, int z) {
		
		System.out.println(x+y+z);
		return x+y+z;
	}
	
	
	
	
}
