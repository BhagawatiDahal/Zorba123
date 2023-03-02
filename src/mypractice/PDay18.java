package mypractice;

public class PDay18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// abstract class with properties, constructor,, abstract methods,normal method,extends by child

		
		
		
		Child c= new Child("Ambika", 29, "Bhagawati");
		System.out.println(c.firstName);
		System.out.println(c.lastName);
		System.out.println(c.age);
		System.out.println(c.ChildFn);
		c.displayAge();
		c.displayFirst();
		c.DisplayLast();
		
		
		Member m= new Member("Sanu", "Dahal" ,34, "Kanchi");
		
			System.out.println( " prime firstname is: "+m.firstName);
			System.out.println("prime lastname is: "+m.lastName);
			System.out.println("prime id is: "+m.id);
			
			System.out.println("member is:" +m.mFirstname);
		
	m.Displayfn("Uma");
	m.Displayln("Pant");
	m.companyName();
		
	}

}

abstract class Mother {

	
	String firstName;
	int age;
	String lastName = "Dahal";

	public Mother(String fn, int ag) {
		this.firstName = fn;
		this.age = ag;

	}

	abstract public void displayFirst();

	abstract public void displayAge();

	public void DisplayLast() {
		System.out.println(lastName);

	}
}

class Child extends Mother{
	
	String ChildFn;

	public Child(String fn, int ag, String Childf) {
		super(fn, ag);
		this.ChildFn= Childf;
		// TODO Auto-generated constructor stub
	}

	
	public void displayFirst() {
		
		System.out.println("Bhagawati");
		// TODO Auto-generated method stub
		
	}

	
	public void displayAge() {
		System.out.println("child's age is "+19);
		// TODO Auto-generated method stub
		
	}
	
}
// abstraction with parameters on abstract methods, constructor, abstract method, abstract class, normal method


abstract class Prime{
	String firstName;
	String lastName;
	int id;
	String Company= "Amazon";
	
	
	public Prime(String fn, String ln, int id) {
		this.firstName=fn;
		this.lastName=ln;
		this.id=id;
		}
	
	abstract void Displayfn(String fn);
	abstract void Displayln(String ln);
	
	
	public void companyName() {
		System.out.println(this.Company);
	}
}

class Member extends Prime{
	String mFirstname;

	public Member(String fn, String ln, int id, String mfn) {
		super(fn, ln, id);
		this.mFirstname= mfn;
		// TODO Auto-generated constructor stub
	}

	
	void Displayfn(String fn) {
		
		System.out.println(fn);
		// TODO Auto-generated method stub
		
	}

	
	void Displayln(String ln) {
		System.out.println(ln);
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}







