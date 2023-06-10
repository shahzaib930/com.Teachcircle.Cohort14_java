package day30_polymorphism.overriding.shape;

public class ShapeTest {
	/*      !! NOTE !!
	 1) For override you have to write the subClass name at the End.(Object)
	 2) if a class empty then it will grab the data from parent class...
	 */

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.area();
		
	
		// OverRiding
	//	                   SubClass
		Shape shape2 = new Triangle();
        shape2.area();
	}

}
