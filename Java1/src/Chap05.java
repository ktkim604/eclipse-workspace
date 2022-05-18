class Car{
	private int speed;

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
}

class Taxi extends Car{
	private int fare;
	
	Taxi(int fare){
		this.fare = fare;
	}
	void show() {
		System.out.println("���� ����� " + fare + "��");
		System.out.println("�ý��� �ӵ��� " + getSpeed() + "km");
	}
}

public class Chap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car();
		
		sonata.setSpeed(100);
		System.out.println("���� �ڵ����� �ӵ��� " + sonata.getSpeed() + "km");
		
		Taxi kakao = new Taxi(10000);
		kakao.setSpeed(70);
		System.out.println("�ý��� �ӵ��� " + kakao.getSpeed() + "km" );
		kakao.show();
		
	}

}
