package main;

public class Try {

	public static void main(String[] args) {
		
		Box123<Integer> box = new Box123<Integer>(123);
		box.setTemp(234);
		System.out.println(box.getTemp());
		
		Box123<String> sbox = new Box123<String>("hello");
		sbox.setTemp("world");
		System.out.println(sbox.getTemp());
		
		BoxMap1<Integer, String> bmap = new BoxMap1<Integer, String>(123, "노승현");
		System.out.println(bmap.getKey());
	}

}

class Box123<T> {
	T temp;
	
	public Box123(T temp) {
		this.temp = temp;
	}
	
	public T getTemp() {
		return temp;
	}
	
	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class BoxMap1<KEY, VALUE> {	//복수로 사용 가능하다.
	KEY key;
	VALUE value;
	
	public BoxMap1(KEY key, VALUE value) {
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