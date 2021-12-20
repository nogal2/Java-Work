package cls4;

public class HealthRate2 extends Health {

	public HealthRate2(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	public double stand() {
		return (height-100);
	}
	
	public String bman() {
		double B = (weight-stand()) / stand()* 100;
		
		if (B > 10)							return "정상";
		else if (B >=10 && B < 20)			return "과체중";
		else								return "비만";
		
		
	}
	@Override
	public void prn() {
		super.prn();
		System.out.println(bman() + "입니다.");
		
	}
	
}
