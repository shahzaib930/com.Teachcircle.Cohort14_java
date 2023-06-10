package day31_interfaceAndAbstraction.DrawableTask;

public class Circle implements Drawable{

 private int x;
 private int y;
 private int radius;
 
 public Circle(int x ,int y, int radius) {
	 this.x = x;
	 this.y = y;
	 this.radius = radius;
 }

@Override
public void draw() {
	 System.out.println("Drawing a circle at (" + x + ", " + y + ") "
	 		+ "with radius " + radius);
	
}
 
 
 
	
}
