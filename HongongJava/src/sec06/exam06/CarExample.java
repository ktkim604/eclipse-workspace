package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) { //stop �ʵ尡 false���
			myCar.setStop(true); //stop �ʵ带 true�� �ٲ���
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());

	}

}
