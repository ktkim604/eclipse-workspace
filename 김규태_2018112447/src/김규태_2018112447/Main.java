package �����_2018112447;


public class Main {
	
	
	public static void main(String[] args) {
		System.out.println("1�� ����");
		Example ex = new Example();
		ex.plot(4);
		
		Example.print10(29673);
		
		System.out.println(ex.count("I go to school",'o'));
		
		ex.note("c=a/b; //divide");
		ex.note("c=a*b; /// multiply");
		
		
		System.out.println("2�� ����");
		
		Goods mp3 = new Goods();
		mp3.set_weight(8);
		System.out.println("���� ��ǰ �߷��� " + mp3.get_weight() + "kg");
		
		mp3.rand_weight();
		System.out.println("���� ��ǰ �߷��� "+ mp3.get_weight() + "kg");
		
		System.out.println("3�� ����");
		Drone DJI = new Drone(5);
		DJI.check_weight(mp3);
	}

}



