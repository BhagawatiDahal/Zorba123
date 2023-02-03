package mypractice;

public class Day10Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// vehicle type 
		
		
//		String vehicle ="Audi";
//		vehicle.toUpperCase();
//		
//		String A = vehicle.toUpperCase();
//		System.out.println("A");
		
		
		
		// creating instance or object of human class
		
		vehicle Audi= new vehicle("audi hybrid", 23456);
		System.out.println(Audi.Name);
		
		Audi.start();
		Audi.stop();
		
		
		
		vehicle bmw= new vehicle ("bmwxp", 12234);
		System.out.println(bmw.RegNO);
		bmw.start();
		bmw.start();
		
		
		
		
	}
}
// outside class another data type



class vehicle{
	
	
	
	// properties of fields
	String Name;
	int RegNO;
	
	
	
	//constructor to set property values, field values
	
	public vehicle(String Name, int RegNO) {
		this.Name= Name;
		this.RegNO= RegNO;		
		
		}
	
	// methods
	
	
	public void start() {
		
		System.out.println("I can start");
		
	}
	
	
	public void stop() {
		
		System.out.println("I am stopping");
		
	}
	
	
	
	
	
	
	
	
	}







