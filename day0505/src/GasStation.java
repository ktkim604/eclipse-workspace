
public class GasStation {
	private int oil;
	void show() {
		System.out.println("���� ���" + oil + "l");
	}
	
	GasStation(){}
	
	void set_gas (int o) {
		oil = o;
	}
	int get_gas() {
		return oil;
	}
	void remain(int o) {
		oil = oil - o;
	}
	
	

}
