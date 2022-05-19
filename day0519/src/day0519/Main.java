package day0519;

class Animal{
	private String feed;
	
	Animal(String fd){
		feed = fd;
	}

	String getfeed() {
		return feed;
	}

	void setfeed(String feed) {
		this.feed = feed;
	}
	
	
}

class Fish extends Animal{
	private double depth;
		
	Fish(String feed, int depth){
		super(feed);
		this.depth = depth;
	}
	
	
	void show() {
		System.out.print("���� �� " + getfeed() + ". ");
		System.out.println("���� ���� " + depth + "km");
	}
}




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Tiger = new Animal("�䳢.");
		System.out.println("���� �� " + Tiger.getfeed());
		
		Fish Shark = new Fish("��ġ",30);
		Shark.show();

	}

}
