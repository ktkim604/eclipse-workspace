package day0519;

public class Main {

	public static void main(String[] args) {
		
		Animal Tiger = new Animal("Åä³¢");
		System.out.println("¸ÔÀº °Í: " + Tiger.getfeed());
		
		Fish Shark = new Fish("ÂüÄ¡", 30);
		Shark.show();

	}

}
