package main;

import cls.ChildOne;
import cls.ChildTwo;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {
		
		// 자식 클래스의 객체를 총 10개의 객체를 생성한다면? (총 10명의 사람을 고용하려는데 어느 부서에 몇명을 고용해야 하는가?라고 생각하면 됨), 무작위로 들어올 때.
		ChildOne arrOne[] = new ChildOne[10];
		ChildTwo arrTow[] = new ChildTwo[10];
		
		
		arrOne[0] = new ChildOne();
		arrTow[0] = new ChildTwo();
		arrTow[1] = new ChildTwo();
		arrOne[1] = new ChildOne();
		arrOne[2] = new ChildOne();
		arrOne[3] = new ChildOne();
		arrTow[2] = new ChildTwo();
		arrOne[4] = new ChildOne();
		
		// 이렇게하면 관리하기가 굉장히 힘들어짐.
		
		// 자식 클래스의 객체를 총 10개의 객체를 생성한다면?
//		ParentClass pc1 = new ChildOne();	// 주소는 부모, 생성은 차일드로 가능하다. 그런 아래와같이 할수있다.
//		ParentClass pc2 = new ChildOne();	//
		
		// 다형성을 저장.
		ParentClass arrParent[] = new ParentClass[10];
		
		arrParent[0] = new ChildOne();
		arrParent[1] = new ChildTwo();
		arrParent[2] = new ChildTwo();
		arrParent[3] = new ChildOne();
		arrParent[4] = new ChildOne();
		arrParent[5] = new ChildOne();
		arrParent[6] = new ChildTwo();
		arrParent[7] = new ChildOne();
		arrParent[8] = new ChildOne();
		arrParent[9] = new ChildTwo();
		
		// instanceof	: 생성된 class를 찾아준다.
		for (int i = 0; i < arrParent.length; i++) {
			arrParent[i].Method();
			if (arrParent[i] instanceof ChildOne) {
				ChildOne one = (ChildOne)arrParent[i];
				one.func();
			} else if(arrParent[i] instanceof ChildTwo) {
				ChildTwo Two = (ChildTwo)arrParent[i];
				Two.proc();
			}
		}
		
		/*
		ChildOne o = (ChildOne)arrParent[0];
		o.func();
		
		
		
		if(arrParent[0] instanceof ChildOne) {
			ChildOne one = (ChildOne)arrParent[0];
			one.func();
		}
		*/
		
	}

}
