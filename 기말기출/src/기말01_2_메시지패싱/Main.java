package 기말01_2_메시지패싱;


class Signal{
	private char color;
	void set_signal(char c) {
		color = c;
	}
	char get_signal() {
		return color;
	}
}

class Car{
	private String message;
	Car(){
		message = "자동차 시동";
	}
	void monitor() {
		System.out.println(message);
	}
	void see_signal(Signal s) {
		if(s.get_signal() == 'r') {
			message = "자동차 멈추세요";
		}
		else {
			message = "자동차 운행중";
		}
	}
}

public class Main {
	

	public static void main(String[] args) {
		Signal st30 = new Signal();
		st30.set_signal('r');
		System.out.println("현재 신호등은 " + st30.get_signal());
		
		Car sm5 = new Car();
		sm5.monitor();
		sm5.see_signal(st30);
		sm5.monitor();
		st30.set_signal('b');
		sm5.see_signal(st30);
		sm5.monitor();
				

	}

}
