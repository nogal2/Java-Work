package main4;

import cls4.HealthRate2;

public class MainClass {

	public static void main(String[] args) {

		HealthRate2 hr = new HealthRate2("홍길동", 168, 45);
		hr.prn();
		HealthRate2 hr2 = new HealthRate2("일지매", 168, 90);
		hr2.prn();
	}

}
