package day0505;

public class Car {
	private int gas;
	
	void set_gas(int g) {
		gas = g;
	}

	void show() {
		System.out.println("���� ������: " + gas + "l");
		
	}

	void fill_gas(int g, GasStation gS) { //�޽����н� ����
		if(g == gS.refuel(g))     //�޼ҵ� ȣ�� �ʿ�
			gas += g;
		else
			System.out.println("���� ����");
			
	}

}
