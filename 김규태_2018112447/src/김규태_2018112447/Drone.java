package 김규태_2018112447;


public class Drone {
	private int max;
	
	
	Drone(int max){
		this.max = max;
	}
	
	
	void check_weight(Goods g) {
		if(g.get_weight() >= max) {
			System.out.println("배송 불가능");
		}
		else {
			System.out.println("배송 가능");;
		}
	}
	
}


