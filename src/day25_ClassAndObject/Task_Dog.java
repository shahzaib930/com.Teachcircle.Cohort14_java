package day25_ClassAndObject;

import java.util.ArrayList;

public class Task_Dog {

	public static void main(String[] args) {
	Dog data = new Dog();
	
	data.bread = "Chow Chow";
	data.color = "Black";
	data.age = 5;
	
//	data.play();
//	data.eat();
	//---------//
	
  Dog dat = new Dog();
	
	dat.bread = "Pista";
	dat.color = "Black";
	dat.age = 5;
	
	//--------//
Dog d1 = new Dog();
	
	d1.bread = "lambu";
	d1.color = "Black";
	d1.age = 5;
	
	///////Main////////
	
	Dog dogs[] = new Dog[3];//length must be equal 
	dogs[0] = data;
	dogs[1] = dat;
	dogs[2] = d1;
	
	for (Dog eachDog : dogs) {
		System.out.println(eachDog.bread);
	}
	
	
	System.out.println("-----------------------");
	
	
	
	////////spearate for practice
ArrayList<Dog>list = new ArrayList<>();
	list.add(d1);
	list.add(data);
	list.add(dat);
	
	for(int i = 0 ; i <list.size();i++) {
		list.get(i).play();
		list.get(i).eat();}
	}
	
	}


