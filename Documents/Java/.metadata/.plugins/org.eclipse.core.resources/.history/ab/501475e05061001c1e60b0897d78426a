package cls;

import singleton.Singleton;

public class YouClass {
	private int total;
	private String name;

	public void func() {
		Singleton s = Singleton.getInstance();	// instance는 s가 아니라 다른거로 해도됨.
		total = s.number;
		name = s.name;
	}
	
//	public void setTotal(int total) {
//		this.total = total;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString() {
		return "YouClass [total=" + total + ", name=" + name + "]";
	}

	
}
