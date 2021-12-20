package dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Try {

	public static void main(String[] args) {
		/*
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		List<Integer> arrList = new ArrayList<Integer>();
		
		arrList.add(231);
		
		Integer in = new Integer(226);
		arrList.add(in);
		
		arrList.add(new Integer(693));
		
		int len = arrList.size();
		System.out.println("list의 크기: " + len);
		System.out.println(arrList.get(0));
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		
		arrList.add(0,531);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		Integer num = arrList.remove(2);
		System.out.println(num);
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		int index = arrList.indexOf(231);
		System.out.println(index);
		
		index = -1;
		for (int i = 0; i < arrList.size(); i++) {
			Integer val = arrList.get(i);
			if (val == 693) {
				index = i;
				break;
			}
		}
		
		System.out.println(index);
		
		Integer newVal = new Integer(275);
		arrList.set(2, newVal);
		
		for (Integer n : arrList) {
			System.out.println(n);
		}
		/**/
		
		List<MyClass> list = new ArrayList<MyClass>();
		
		MyClass cls = new MyClass(1, "노", 281);
		list.add(cls);
		
		cls = new MyClass(2, "승", 126);
		list.add(cls);
		
		list.add(new MyClass(3, "현", 182));
		
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			my.toString();
		}
		cls = new MyClass(4, "갈", 213);
		list.add(1, cls);
		
		for (MyClass my : list) {
			my.toString();
		}
		
		MyClass rm = list.remove(1);
		rm.toString();
		
		for (MyClass my : list) {
			my.toString();
		}
		
		String name= "노";
		
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			if(my.getName().equals(name)) {
				index=i;
				break;
			}
		}
		System.out.println(list.get(index).toString());
		
		MyClass obj = list.get(0);
		obj.setHeight(164);
		for (MyClass my : list) {
			my.toString();
		}
		
		MyClass mcls = new MyClass(5, "정수동", 634);
		list.set(2, mcls);
		
	}

}
