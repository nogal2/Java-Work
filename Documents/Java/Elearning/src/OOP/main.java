package OOP;

public class main {

	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor("mark6", 180);
		
		System.out.println(suit1.getName() + ":" + suit1.getHeight());
		System.out.println(suit2.getName() + ":" + suit2.getHeight());
		
		

	}

}
