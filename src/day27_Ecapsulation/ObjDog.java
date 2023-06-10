package day27_Ecapsulation;

public class ObjDog {

	public static void main(String[] args) {
	
//      String breed1, String name1, int age1 , String size1, String color1
      Dog d1 = new Dog("Neapolitan Mastiff", "James" , 5 , "Large" , "Black"); // created Dog object
      // using default constructor of
      // Dog class
      Dog Max = new Dog("Chow Chow","Max",9,"Large","Maroon");

      Dog dogs[] = new Dog[5];
      dogs[0] = d1;
      dogs[1] = Max;
      dogs[2] = Max;
      dogs[3] = new Dog();
      dogs[4] = new Dog();

      System.out.println(dogs.length);

      for (Dog eachDog : dogs) {
          eachDog.bark();
          eachDog.eat();
          
          System.out.println(eachDog.toString());
          
          
      }
  }
}
		
		
		


