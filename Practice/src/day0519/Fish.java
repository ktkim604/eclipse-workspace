package day0519;

public class Fish extends Animal{
	
	private double depth;
	
	Fish(String feed, int depth) {
		super(feed);
		this.depth = depth;
	}
	void show() {
		System.out.print("���� ��: " + getfeed() + ". ");    //private���� �����������Ƿ� getfeed()�� ������
		System.out.println("���� ���� " + depth + "km");
	}
	
}
