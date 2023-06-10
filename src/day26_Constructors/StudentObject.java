package day26_Constructors;

public class StudentObject {

	public static void main(String[] args) {
		
	Student s = new Student();	// calling  default constructor if student class
	s.name = "Arad";	
	s.id = 123;
	s.age = 20;
	s.gender = 'M';
	
	
	s.takeExam("Java");
	s.study("selenium ");
	

	}

}
