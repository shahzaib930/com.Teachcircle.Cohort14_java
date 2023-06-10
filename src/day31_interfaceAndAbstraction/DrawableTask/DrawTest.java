package day31_interfaceAndAbstraction.DrawableTask;

public class DrawTest {

	public static void main(String[] args) {
		Drawable myCircle = new Circle(5, 3, 6);
		myCircle.draw();
		
		Drawable myRect = new Rectangle(3, 5, 7, 4) ;
		myRect.draw();
		
		System.out.println("-----------2nd way----------------");
		
		Drawable shape[]= new Drawable[2];
		shape[0] = new Circle(5, 3, 6);
		shape[1] = new Rectangle(3, 5, 7, 4) ;
		
		for(Drawable shapes : shape) {
			shapes.draw();
		}
	}

}
