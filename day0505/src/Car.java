
public class Car {
	private int car_oil;
	Car(){}
	void show() {
		System.out.println("���� ������: " + car_oil + "l");
	}
	void set_gas(int o) {
		car_oil = o;
	}
	void fill_gas(int o, GasStation a) {
		if(o > a.get_gas())
			System.out.println("���� ����");
		else {
			car_oil += o;
			a.remain(o);
		}
	}
	
	

}
