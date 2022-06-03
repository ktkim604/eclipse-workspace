package day0519;

public class Fish extends Animal{
	
	private double depth;
	
	Fish(String feed, int depth) {
		super(feed);
		this.depth = depth;
	}
	void show() {
		System.out.print("먹은 것: " + getfeed() + ". ");    //private으로 감싸져있으므로 getfeed()로 가져옴
		System.out.println("현재 수심 " + depth + "km");
	}
	
}
