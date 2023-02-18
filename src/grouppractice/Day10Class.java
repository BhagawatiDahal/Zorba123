package grouppractice;

public class Day10Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Person amol=new Person("amol", "Pandey", 28);
		System.out.println(amol.firstname+" "+amol.lastname+" "+amol.age);
		System.out.println((amol.lastname));
		System.out.println(amol.age);
		
		
		Person Anjila= new Person ( "Anjila", "Katuwal", 25);
		System.out.println(Anjila.firstname);
		System.out.println(Anjila.lastname);
		System.out.println(Anjila.age);
		
		
		
		
		
		Anjila.talk();
		Anjila.walk();
		amol.talk();
		amol.walk();
		
		
		
	}

}




class Person{
	

	
	String firstname;
	String lastname;
	int age;
	
	public  Person (String fn, String ln, int ag){
		
	this.firstname=fn;	
	this.lastname=ln;
	this.age=ag;
	
		
	}
	
	
	
	public void walk() {
	System.out.println("I am walking");	
	
		
	}
	
	public void talk() {
		
	System.out.println("I am talking");
		
	}
	

	
	
}

