package �⸻01_2_�޽����н�;


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
		message = "�ڵ��� �õ�";
	}
	void monitor() {
		System.out.println(message);
	}
	void see_signal(Signal s) {
		if(s.get_signal() == 'r') {
			message = "�ڵ��� ���߼���";
		}
		else {
			message = "�ڵ��� ������";
		}
	}
}

public class Main {
	

	public static void main(String[] args) {
		Signal st30 = new Signal();
		st30.set_signal('r');
		System.out.println("���� ��ȣ���� " + st30.get_signal());
		
		Car sm5 = new Car();
		sm5.monitor();
		sm5.see_signal(st30);
		sm5.monitor();
		st30.set_signal('b');
		sm5.see_signal(st30);
		sm5.monitor();
				

	}

}
