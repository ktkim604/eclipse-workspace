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
		System.out.print("먹은 것 " + getfeed() + ". ");
		System.out.println("현재 수심 " + depth + "km");
	}
}




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal Tiger = new Animal("토끼.");
		System.out.println("먹은 것 " + Tiger.getfeed());
		
		Fish Shark = new Fish("참치",30);
		Shark.show();

	}

}
