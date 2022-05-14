
public class GasStation {
	private int oil;
	void show() {
		System.out.println("핸재 재고량" + oil + "l");
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
