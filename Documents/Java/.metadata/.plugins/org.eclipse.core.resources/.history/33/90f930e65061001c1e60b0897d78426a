package cls;

public class Exercise5 {
	/*(1)action 메서드를 작성하시오*/
	
	public static void main(String[] args) {
/*Object[] 을 Robot[] 대신 넣어도됨*/		
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i< arr.length;i++) {
			action(arr[i]);
		}
	} // main

	public static void action(Robot robot) {
		if (robot instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)robot;
			dr.dance();
		}
		else if(robot instanceof SingRobot) {
			((SingRobot)robot).sing();
		}
		else if(robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
		}
		
	}
	
		
	
}

class Robot {
	
}

class DanceRobot extends Robot { 
void dance() {
System.out.println("춤을  춥니다."); }
}

class SingRobot extends Robot { 
void sing() {
System.out.println("노래를  합니다."); }
}

class DrawRobot extends Robot { 
void draw() {
System.out.println("그림을  그립니다."); }
}
