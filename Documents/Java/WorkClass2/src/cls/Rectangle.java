package cls;

public class Rectangle extends Shape {
	private int width;	//폭
	private int height;	//높이
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean isSquare() {
		if(width == height) {
			return true;
		} else {
			return false;
		}
		
	}
	
	@Override
	public double calcArea() {
		return width*height;
	}
	
	
	
}
