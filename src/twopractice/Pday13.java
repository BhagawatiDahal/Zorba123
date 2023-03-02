package twopractice;

public class Pday13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		house bunglow= new house();
		bunglow.color();
		
		bike honda=new bike ();
		
		honda.colorb();
		
	}

}




class house{
	
	
	
	
	void color() {
		
	System.out.println(" I love black");	
		
	
	}
}
	
	class bike{
		
		 String color="red";
		
	
	
	   void color() {
		System.out.println(this.color);
		
	}
	   
	   
	  void colorb() {
		  
		this.color();  
		  
		  
		  
	  }
	   
	   
	   
	   
	}
	
	
	// Class with constructor
	
	
	
	
	
	
	
	
	
	