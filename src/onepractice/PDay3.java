package onepractice;

public class PDay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		method(5,7);
		
		int meth= method(5,7);
		System.out.println(meth);
		
		
		///////////////////////////
		
		int q= (meth+5);
		
		multiplication(q,10);
		System.out.println();
		
		System.out.println(q);
	}
	
	static int method(int x,int y) {
		
		
		return x+y;
	}
	
	
	static int multiplication(int x, int y) {
		
		System.out.println(x+y);
		return x+y;
	}
	
	
	

}
