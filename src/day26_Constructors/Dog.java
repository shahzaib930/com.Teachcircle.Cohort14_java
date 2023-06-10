package day26_Constructors;

public class Dog {
	
	//    Update Dog class by craeting couple of constructors 
//  and create 4 dog object
//  
  // instance Variables
  String breed;
  String name;
  int age;
  String size;
  String color;
  
  
  public Dog(String breed1) {
	  breed = breed1;
      
  }
  
  
  public Dog(String breed1 , String name1) {
     breed = breed1;
     name = name1;
  }
  
  public Dog (String breed1 , String name1, String size1){
  breed = breed1;
  name = name1;
  size = size1;
  
     
  }
  
  public Dog(String breed1 , String name1, String size1 , int age1){
	    breed = breed1;
	     name = name1;
	     size = size1;
	     age = age1;
  }
 
  public void intro() {
	  System.out.println("Name : "+name +  "Breed " + breed+ " Age : " + age +" Size : "+ size );}
       
  
  
  
  
  
  
  
  
  
}


