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
		System.out.println("현재 요금은 " + fare + "원");
		System.out.println("택시의 속도는 " + getSpeed() + "km");
	}
}

public class Chap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sonata = new Car();
		
		sonata.setSpeed(100);
		System.out.println("현재 자동차의 속도는 " + sonata.getSpeed() + "km");
		
		Taxi kakao = new Taxi(10000);
		kakao.setSpeed(70);
		System.out.println("택시의 속도는 " + kakao.getSpeed() + "km" );
		kakao.show();
		
	}

}
