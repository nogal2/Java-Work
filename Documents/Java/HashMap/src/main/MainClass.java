package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {

	public static void main(String[] args) {
		/*
		ArrayList:	장점- 검색, 대입할때 많이 쓴다.
		
		LinkedList:	장점- 실시간 추가/삭제 처리가 빠르다
	*/
	/*
	LinkedList<String> list = new LinkedList<String>();
	
	list.add("Tigers");
	list.add(new String("Lions"));
	list.add("Giants");
	
	for (String s : list) {
		System.out.println(s);
	}
	
	list.addFirst("bears");	// == list.add(0,"bears"); 이건 ArrayList에는 없음
	
	ArrayList<String> alist = new ArrayList<String>(list);		// 서로 호환이됨
	
	for (String str : alist) {
		System.out.println(str);
	}
	
	System.out.println(list.get(0));
	
	String ss = "twins";
	list.add(2, ss);
	
	for (String str : list) {
		System.out.println(str);
	}
	/**/
		
		/*
			Map:	사전
				HashMap
						key:value -> 한 쌍(pair)
						"사과":"apple"
						tree 구조	
						접근하고 관리할 때는 key값으로 한다.	
						key값은 중복으로 사용할 수 없다.
								
				TreeMap
						HashMap + sorting
						해쉬맵으로 코딩을 한후 소팅하기위해 이걸 사용하는 경우가 많음
				
		*/
		
	//	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		// 추가
		hMap.put(111, "백십일");
		hMap.put(222, "이백이십이");
		hMap.put(333, "삼백삼십삼");
		// 추가할때마다 정렬되기때문에 자리가 변동, 순서대로 들어가지 않음
		
		String value = hMap.get(333);
		System.out.println(value);
		
		// iterator : 반복자(주소) -> 포인터 : 키값을 다 확인하기
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k);
			//key값확인
			
			String v = hMap.get(k);
			System.out.println(v);
			//value 확인	
		}
		
		// 삭제
		value = hMap.remove(222);
		System.out.println("삭제된 데이터: " + value);
		
		it = hMap.keySet().iterator();	// iterator는 위에서 값을 다 찾았기 때문에 끝에 위치해있다. 그래서 다시 초기화시켜야한다.
		while(it.hasNext()) {			// 다음값을 가지고 있으면 true
			String v = hMap.get(it.next());
			System.out.println(v);
		}
		System.out.println(hMap.size());
		
		// 검색(= key)
		boolean b = hMap.containsKey(333);	// 있는지 없는지를 말해줌.
		if (b==true) {
			String v = hMap.get(333);
			System.out.println(v);
		}
		
		// 수정
		hMap.replace(111, "백 + 십 + 일");
		System.out.println(hMap.get(111));
		
		hMap.put(111, "100 + 10 + 1");
		System.out.println(hMap.get(111));
		// put으로 값을 넣을때 오류나는게 아니라 수정된다. 그래서 검색으로 확인 후에 데이터를 입력해야한다.
		
		// sorting -> key값으로 sorting한다.
		Map<String, String> map = new HashMap<String, String>();
		
		//숫자 sorting은 당연히 됨
		map.put("pear", "배");
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
		Iterator<String> it1 = map.keySet().iterator();
		while (it1.hasNext()) {
		//	String v = map.get(it1.next());
			 String k = it1.next();
			 String v = map.get(k);
			System.out.println("key: " + k + "value:" + v);	// 순서가 뒤죽 박죽
			
		}
		System.out.println();
		
		// TreeMap
		
		TreeMap<String, String> tmap = new TreeMap<String, String>(map);	// 위에 맵이 treeMap 으로 들어감
		
		//오름차순
	//	Iterator<String> it2 = tmap.keySet().iterator();
		
		//내림차순
		Iterator<String> it2 = tmap.descendingKeySet().iterator();
		
		while(it2.hasNext()) {
			String k = it2.next();
			String v = tmap.get(k);
			System.out.println("key: " + k + "value:" + v);
			//abcde 순으로 정렬
		}
		
	}

}
