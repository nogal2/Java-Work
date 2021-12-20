package main;

public class Main {

	public static void main(String[] args) {
		/*
			Generic == template (형태)
						: 자료형 변수
						: 같은 클래스에서 다양한 자료형을 사용하고 싶은 경우에 설정하는 요소
		*/
		Box<Integer> box = new Box<Integer>(123);	// T에 Integer를 대입
		box.setTemp(234);
		System.out.println(box.getTemp());
		
		Box<String> sbox = new Box<String>("hello");// T에 String을 대입
		sbox.setTemp("world");
		System.out.println(sbox.getTemp());
		
		// T에 Integer를 넣을 수 있고 T에 String을 넣을수 있다.
		// Box<int> tbox = new Box<int>(1); 일반 자료형은 못쓴다. 오브젝트 자료형만 쓸 수 있다. 어떤 클래스가 와도 보관할 수 있는 것이다.
		
		BoxMap<Integer, String> bmap = new BoxMap<Integer, String>(1001, "홍길동");
//		public BoxMap(KEY key, VALUE value) { 
//			this.key = key;
//			this.value = value;
//		}
//		이 생성자가 호출된다.
		System.out.println(bmap.getKey());
		System.out.println(bmap.getValue());
		
		BoxMap<String, String> smap = new BoxMap<String, String>("apple", "사과");
		
		
	}

}

class Box<T>{	// 다른 문자도 사용 가능. 사용자 지정. 
	T temp;

	public Box(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class BoxMap<KEY, VALUE> {	//복수로 사용 가능하다.
	KEY key;
	VALUE value;
	
	public BoxMap(KEY key, VALUE value) {
		this.key = key;
		this.value = value;
	}

	public KEY getKey() {
		return key;
	}

	public void setKey(KEY key) {
		this.key = key;
	}

	public VALUE getValue() {
		return value;
	}

	public void setValue(VALUE value) {
		this.value = value;
	}
	
} 