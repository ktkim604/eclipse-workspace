package �����_2018112447;


public class Drone {
	private int max;
	
	
	Drone(int max){
		this.max = max;
	}
	
	
	void check_weight(Goods g) {
		if(g.get_weight() >= max) {
			System.out.println("��� �Ұ���");
		}
		else {
			System.out.println("��� ����");;
		}
	}
	
}


