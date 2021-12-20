package cls;

import singleton.Singleton;

public class HeClass {
	private int numHe;
	private String nameHe;
	
	public HeClass() {
		numHe = 555;
		nameHe = "갈";
	}
	
	public void hefunc() {
		Singleton s = Singleton.getInstance();
		s.number = numHe;
		s.name = nameHe;
	}
}
