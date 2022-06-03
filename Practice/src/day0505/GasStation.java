package day0505;

public class GasStation {
	private int gas;
	
	void set_gas(int g) {
		gas = g;
	}
	int get_gas() {
		return gas;
	}

	void show() {
		System.out.println("현재 재고량: " + gas + "l");
		
	}
	int refuel(int g) { //메시지패싱 관련코드
		if(gas < g) {
			return -1;
		}
		gas -=g;
		return g;
	}
}
