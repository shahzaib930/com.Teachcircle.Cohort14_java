package day31_interfaceAndAbstraction.DrawableTask;

public class Rectangle implements Drawable{
	private int x;
	 private int y;
	 private int width;
	private int height;
	
	
	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}


	@Override
	public void draw() {
		System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with"
				+ " width " + width + "and height " + height );
		
	}
	
 




}
