package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import dto.MyClass;
import dto.YouClass;

public class MainClass {

	

	public static void main(String[] args) {
		/*
			Collection:	수집
			
			List: 목록
					ArrayList
						배열처럼 사용할 수 있는 목록
						선형구조	O-O-O-O-O-O-O-O
						검색 속도가 우수하다.
						index로 접근한다. 
						List는 인터페이스다
					LinkedList
						추가/삭제의 속도가 우수하다.	- 게임에 사용
			
		*/
		/*
		ArrayList<Integer> arrList = new ArrayList<Integer> ();		// 검정 철 파일이 비어있는 것이라고 생각하면 됨.
	//	List<Integer> arrList1 = new ArrayList<Integer>();			// 이건 인터페이스
		
		// 추가
		arrList.add(111);	// 생성방법1	[0]
		Integer in = new Integer(222);	// 생성방법 2 [1] 글자 가운데 줄그어진거는 사용은 가능한데 버전업되면서 굳이 쓸필요 없다는 뜻	
		arrList.add(in);				// 생성방법 2
		
		arrList.add(new Integer(333));	// 생성방법 3 [2]
		
		int len = arrList.size();
		System.out.println("list의 크기:" + len);
		
		System.out.println(arrList.get(0));
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		// 원하는 위치에 추가하는 방법
		arrList.add(1, 200);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		// 마지막 숫자인 333은 자동적으로 3번지로 감.
		
		// 삭제
		Integer num = arrList.remove(2);	// 삭제된 데이터 확인
		System.out.println("삭제된 데이터:" + num);	
		for (Integer n : arrList) {
			System.out.println(n);
		}
		System.out.println("list의 크기:" + arrList.size());
		
		// 검색
		int index = arrList.indexOf(333);	// 333에 대한 인덱스 넘버가 몇번인지
		System.out.println(index);
		
		// 검색에 중요한 코드!
		index = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer val = arrList.get(i);
			if (val == 200) {
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
		
		//ArrayList<String> slist
		ArrayList<String> slist = new ArrayList<String>();
		
		// 추가
		slist.add("노");
		String st = new String("승");
		slist.add(st);
		slist.add(new String("현"));
		slist.add("갈");
		slist.add(2, "이");
		
		
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
		
		// 삭제
		String re = slist.remove(2);
		slist.remove(1);
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
		System.out.println(slist.size());
		// 검색
		int index1 = slist.indexOf("갈");
		System.out.println(index1);
		
		index1 = -1;
		for (int i = 0; i < slist.size(); i++) {
			String str = slist.get(i);
			if(str == "갈") {
				index1 = i;
				break;
			}
		}
		System.out.println(index1);
		// 수정
		String newStr = new String("갈");
		slist.set(1, newStr);
		
		slist.set(2, "현");

		for (String s : slist) {
			System.out.println(s);
		}
		
		/**/
		
		List<MyClass> list = new ArrayList<MyClass>();
		
		// 추가 - 3명
		MyClass cls = new MyClass(1, "홍길동", 171.1);
		list.add(cls);
		
		cls = new MyClass(2, "성춘향", 161.3);
		list.add(cls);
		
		list.add(new MyClass(3, "홍두께", 183.2));
		
		
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			my.toString();
		}
		
		
		
		cls = new MyClass(4, "일지매", 178.5);
		list.add(2,cls);
		
		for (MyClass my : list ) {
			System.out.println(my.toString());
		}
		// 삭제 - 1명
		MyClass removeDto = list.remove(3);
		removeDto.toString();
		
		for (MyClass my : list) {
			my.toString();
		}
		
		// 검색 - 1명
		String name ="성춘향";
		
		int findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			if (name.equals(my.getName())) {
				findIndex = i;
				break;
			}
		}
		
		System.out.println(list.get(findIndex).toString());
		
		// 수정 - 1명
		MyClass  obj = list.get(0);
		obj.setHeight(182.3);
		for (MyClass my : list) {
			my.toString();
		}
		
		MyClass mcls = new MyClass(5, "정수동", 69.2);
		list.set(2, mcls);
		
		//편법
		List<Object> allObjlist = new ArrayList<Object>();
		allObjlist.add(new YouClass());
		allObjlist.add(new MyClass());
		
		
		
	}
	

}
