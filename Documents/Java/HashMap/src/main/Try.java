package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Try {

	public static void main(String[] args) {
		
	//	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(235, "노승현");
		hMap.put(23, "갈");
		hMap.put(599, "갈2");
		
		String value = hMap.get(235);
		System.out.println(value);
		
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k);
			
			String v = hMap.get(k);
			System.out.println(v);
		}
		
		value = hMap.remove(23);
		System.out.println("삭제: " + value);
		
		it = hMap.keySet().iterator();
		while(it.hasNext()) {
			String v = hMap.get(it.next());
			System.out.println(v);
		}
		
		boolean b = hMap.containsKey(235);
		if (b==true) {
			String v = hMap.get(235);
			System.out.println(v);
		}
		
		hMap.replace(235, "갈");
		System.out.println(hMap.get(235));
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("pear", "배");
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String k = it1.next();
			String v = map.get(k);
			System.out.println("key: "+ k+ " " + "value: " +v);
		}
		
	//	TreeMap<String,	String> tmap = new TreeMap<String, String>(map);
		
		//Iterator<String> it2 = tmap.keySet().iterator();
		TreeMap<String, String> tmap = new TreeMap<String, String>(map);
		Iterator<String> it2 = tmap.descendingKeySet().iterator();
		while(it2.hasNext()) {
			String k = it2.next();
			String v = tmap.get(k);
			System.out.println("key: "+ k+ " " + "value: " +v);
		}
		
		
	}

}
