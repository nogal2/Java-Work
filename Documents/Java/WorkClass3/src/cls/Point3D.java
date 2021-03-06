package cls;

public class Point3D {
	int x,y,z;
	
	public Point3D(int x, int y, int z) {
		this.x=x;
		this.y=y;
		this.z=z; 
	}
	
	public Point3D() {
		this(0,0,0);
	}
	public boolean equals(Object obj) { /*
	(1) 인스턴스변수  x, y, z를  비교하도록  오버라이딩하시오. */
		// 오브젝트는 어떠한 클래스든 가지고 올수 있다.
//		if (x!=y && y!=z) {
//			return true;
//		} else {
//			return false;
//		}
		
		// 강사님 답
		Point3D p2 = (Point3D)obj;
		if (x==p2.x && y ==p2.y && z==p2.z) {
			return true;
		} 
		 return false;
	}
	public String toString() { /*
		(2) 인스턴스변수  x, y, z의  내용을  출력하도록  오버라이딩하시오. */
		//toString은 리소스옵션에서 바로 만들 수 있다.  toString은 println에서 자동으로 출력이 되는 함수이다.
		return "["+x+","+y+","+z+"]";
	}
}
