package sec04.exam06;

public class CaculatorExample {

	//�޼ҵ� �����ε� ����
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caculator Cal = new Caculator();
		
		double result1 = Cal.areaRectangle(10);
		
		double result2 = Cal.areaRectangle(10,20);
		
		System.out.println("���簢�� ����=" + result1);
		System.out.println("���ñ��� ����=" + result2);
	}

}
