package grouppractice;

public class OopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// object creation
		vehicles toyota= new vehicles ("LE","brown", 33456 );
		vehicles bmw= new vehicles("suv","white",0500);
		vehicles honda= new vehicles ("XSE","black", 9809);
		
		toyota.run();
		toyota.start();
		
		bmw.run();
		bmw.start();
		
		honda.run();
		honda.start();
		
		
		
		
		// array of vehicles
		vehicles [] vehiclescoll= {
				
				new vehicles ("LE","brown", 33456 ),
				new vehicles("suv","white",0500),
				new vehicles ("XSE","black", 9809)	
		};
		

	
		
		
		
		
		
	}
}


class vehicles{
	String modelname;
	String color;
	int regno;
	
	// constructor
	public vehicles(String mname, String col, int reg) {
		
		this.modelname=mname;
		this.color= col;
		this.regno=reg;
			
	}
	
	// methods
	public void run() {
		
		System.out.println( "vehicle run");
		
		
	}

	public void start() {
		System.out.println("I can start");
		
	}
	
	
	
}





