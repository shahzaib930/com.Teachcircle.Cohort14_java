package day25_ClassAndObject;

public class Person {
	// instance Variables
    String name;
    int age;
    String occupation;
    
    
    // instance Methods
    
     public void getInfo () {
            System.out.println(name + " is "+ age + " and he is a " + occupation);

     }
     
     
     public void work() {
         System.out.println(name +" is working.");
     }
     
     public String whatsYourName() {
         return name;
     }
     
     public String whatIsYourOccupation() {
         return occupation;
     }
     
     public int howOldAreYou() {
         return age;
     }
     
     
     public void introduction() {
            System.out.println("Hey there! My name is " + name);
            System.out.println("I'm a " + occupation);
            System.out.println("My hobies include gym, soccer and hiking");
            System.out.println("I love dogs");
        }
    
}






