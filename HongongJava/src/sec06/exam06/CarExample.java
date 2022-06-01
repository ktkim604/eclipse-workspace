package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) { //stop 필드가 false라면
			myCar.setStop(true); //stop 필드를 true로 바꿔줌
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());

	}

}
