package cls2;

public class Human {
	String name;
	int age;
	int height;
	int weight;
	String number;

	public Human() {
	}

	public Human(String name, int age, int height, int weight, String number) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.number = number;
	}

	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + number;
		return data;
	}

}
