package 김규태_2018112447;


public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("1번 문제");
		Example ex = new Example();
		ex.plot(4);
		
		Example.print10(29673);
		
		System.out.println(ex.count("I go to school",'o'));
		
		ex.note("c=a/b; //divide");
		ex.note("c=a*b; /// multiply");
		
		
		System.out.println("2번 문제");
		
		Goods mp3 = new Goods();
		mp3.set_weight(8);
		System.out.println("현재 상품 중량은 " + mp3.get_weight() + "kg");
		
		mp3.rand_weight();
		System.out.println("현재 상품 중량은 "+ mp3.get_weight() + "kg");
		
		System.out.println("3번 문제");
		Drone DJI = new Drone(5);
		DJI.check_weight(mp3);
	}

}



