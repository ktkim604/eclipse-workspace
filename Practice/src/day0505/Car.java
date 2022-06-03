package day0505;

public class Car {
	private int gas;
	
	void set_gas(int g) {
		gas = g;
	}

	void show() {
		System.out.println("현재 주유량: " + gas + "l");
		
	}

	void fill_gas(int g, GasStation gS) { //메시지패싱 구현
		if(g == gS.refuel(g))     //메소드 호출 필요
			gas += g;
		else
			System.out.println("주유 실패");
			
	}

}
