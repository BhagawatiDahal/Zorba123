package mypractice;

public class PracticeDay19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		// interface
		//three abstract methods
		// class implements
		level lb=new level();
		lb.DisplayName();
		lb.DisplayTeacherName();
		lb.CityName();
		
		
		
		student s= new student();
		
		s.DisplayName();
		s.DisplayTeacherName();
		s.CityName();
		
	}

}

interface School{
	
	
	abstract public void DisplayName();
	abstract public void DisplayTeacherName();
	abstract public void CityName();
	
	
	
}


class level implements School{

	@Override
	public void DisplayName() {
		
		System.out.println("Grade 7");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisplayTeacherName() {
		System.out.println("Ram");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CityName() {
		System.out.println("Euless");
		// TODO Auto-generated method stub
		
	}
	
}
class student implements School{

	@Override
	public void DisplayName() {
		System.out.println("Ram Karki");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DisplayTeacherName() {
		System.out.println("Hari upreti");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CityName() {
		System.out.println("chitwan");
		// TODO Auto-generated method stub
		
	}
	
}

