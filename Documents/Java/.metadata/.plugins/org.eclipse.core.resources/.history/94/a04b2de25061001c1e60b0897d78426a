package cls;

public abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0)); 		// point (0,0) 넣은 값을 호출해서 초기화
		}		
	Shape(Point p) { 
		this.p = p;					// point클래스 p로 호출한 값을 this.p 에 대입
	}
	public abstract double calcArea();		// 도형의  면적을  계산해서  반환하는  메서드  
	
	Point getPosition()	{			// Point클래스를 읽을 수 있도록함
		return p; 					//p(즉 point를 호출해서) 리턴
	}
	void setPosition(Point p) { 	// Point클래스를 수정할 수 있도록함
		this.p = p;					// p(즉 point클래스를 호출)로 수정한 값을 p에 대입
	}
	
}
