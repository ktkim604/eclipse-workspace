package sec01.exam04;

public class SupersonicAirplane extends Airplane{

	public static final int N = 1;
	public static final int S = 2;
	
	public int flyMode = N;
	
	//자식클래스에서 메소드 재정의
	public void fly() {
		if(flyMode == S) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();
		}
	}

	

}
