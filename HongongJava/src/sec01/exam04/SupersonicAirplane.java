package sec01.exam04;

public class SupersonicAirplane extends Airplane{

	public static final int N = 1;
	public static final int S = 2;
	
	public int flyMode = N;
	
	//�ڽ�Ŭ�������� �޼ҵ� ������
	public void fly() {
		if(flyMode == S) {
			System.out.println("������ �����մϴ�.");
		}
		else {
			super.fly();
		}
	}

	

}
