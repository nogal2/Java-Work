package main;

import java.util.ArrayList;
import java.util.List;

import dto.MyClass;
import dto.YouClass;

public class MainClass {
	public static void main(String[] args) {
		/*
			Collection : 수집
			
			List : 목록
					ArrayList
						배열처럼 사용할 수 있는 목록
						선형구조					O-O-O-O-O-O-O-O-
						검색 속도가 우수하다.
						index로 접근한다.
					
					LinkedList
						추가/삭제의 속도가 우수하다. - 게임			
		*/
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
	//	List<Integer> arrList = new ArrayList<Integer>();
		
		// 추가
		arrList.add(111);				// [0]
		
		Integer in = new Integer(222);	// [1]
		arrList.add(in);
		
		arrList.add(new Integer(333));	// [2]
		
		int len = arrList.size();
		System.out.println("list의 크기:" + len);
		
		System.out.println( arrList.get(0) );
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		// 원하는 위치에 추가
		arrList.add(1, 200);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
				
		// 삭제
		Integer num = arrList.remove(2);
		System.out.println("삭제된 데이터:" + num);
		for (Integer n : arrList) {
			System.out.println(n);
		}
		System.out.println("list의 크기:" + arrList.size());
		
		// 검색
		int index = arrList.indexOf( 333 );
		System.out.println(index);
		
		index = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer val = arrList.get(i);
			if(val == 200) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		// 수정
		Integer newVal = new Integer(100);
		arrList.set(0, newVal);
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		// ArrayList<String> slist
		// 추가
		// 삭제
		// 검색
		// 수정
		
		List<MyClass> list = new ArrayList<MyClass>();
		
		// 추가 - 3명
		MyClass cls = new MyClass(1, "홍길동", 171.1);
		list.add(cls);
		
		cls = new MyClass(2, "성춘향", 161.3);
		list.add(cls);
		
		list.add(new MyClass(3, "홍두께", 183.2));
		
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
		//	System.out.println(my.toString());
			my.toString();
		}		
		
		cls = new MyClass(4, "일지매", 178.5);
		list.add(2, cls);
		
		for (MyClass my : list) {
			my.toString();
		}
				
		// 삭제 - 1명
		MyClass removeDto = list.remove(3);
		removeDto.toString();
		
		for (MyClass my : list) {
			my.toString();
		}
		System.out.println();
		
		// 검색 - 1명
		String name = "성춘향";
		
		int findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			if(name.equals(my.getName())) {
				findIndex = i;
				break;
			}
		}		
		list.get(findIndex).toString();
				
		// 수정 - 1명
		MyClass obj = list.get(0);
		obj.setHeight(182.3);
		
		for (MyClass my : list) {
			my.toString();
		}
		
		MyClass mcls = new MyClass(5, "정수동", 169.5);		
		list.set(2, mcls);
		
		for (MyClass my : list) {
			my.toString();
		}
		
		
		List<Object> allObjlist = new ArrayList<Object>();
		allObjlist.add(new YouClass());
		allObjlist.add(new MyClass());
		
	}
}















