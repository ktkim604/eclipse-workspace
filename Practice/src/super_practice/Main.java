package super_practice;

class Car{
	private int Speed;
	
	
	Car(int sp) {
		Speed = sp;
	}

	int getSpeed() {
		return Speed;
	}

	void setSpeed(int speed) {
		this.Speed = speed;
	}
}

class Taxi extends Car{
	private int fare;
	
	Taxi(int sp, int fr){
		super(sp);
		fare = fr;
	}
	void show() {
		System.out.println("�ý� ���� ����� "+ fare + "��");
		System.out.println("�ý��� �ӵ��� " + getSpeed() + "km");  
	}
}



public class Main {

	public static void main(String[] args) {
		Car sonata = new Car(100);
		System.out.println("���� �ڵ����� �ӵ��� " + sonata.getSpeed() + "km");
		
		Taxi Yellow = new Taxi(70, 3500);
		Yellow.show();
	}

}
