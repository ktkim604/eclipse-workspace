package sec04.exam05;

public class Car {
	int speed;
	
	public void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
		
	}

	public void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:" + speed + ")");
		}
		
	}

	public int getSpeed() {
		
		return speed;
	}

}
