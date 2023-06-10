package day26_Constructors;

public class DogObj {

	public static void main(String[] args) {
//      String breed1, String name1, int age1 , String size1, String color1
      Dog d1 = new Dog("chow chow ","peter", "black", 4); // created Dog object
      // using default constructor of
      // Dog class
      Dog Max = new Dog("chow chow ","Pitaaaa", "black", 4);

      Dog dogs[] = new Dog[2];
      dogs[0] = d1;
      dogs[1] = Max;
  
    
      System.out.println(dogs.length);

      for (Dog eachDog : dogs) {
          eachDog.intro();
      }


	}

}
