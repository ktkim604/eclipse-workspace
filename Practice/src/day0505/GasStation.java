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
		System.out.println("���� ���: " + gas + "l");
		
	}
	int refuel(int g) { //�޽����н� �����ڵ�
		if(gas < g) {
			return -1;
		}
		gas -=g;
		return g;
	}
}
