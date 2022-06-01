package sec04.exam06;

public class CaculatorExample {

	//메소드 오버로딩 공부
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caculator Cal = new Caculator();
		
		double result1 = Cal.areaRectangle(10);
		
		double result2 = Cal.areaRectangle(10,20);
		
		System.out.println("정사각형 넓이=" + result1);
		System.out.println("직시긱향 넓이=" + result2);
	}

}
