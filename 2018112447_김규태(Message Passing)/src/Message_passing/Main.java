package Message_passing;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		production Car = new production("고급차", "일반차");
		Car.set(90,90);
		sale C = new sale("현대차");
		
		//[1~90]사이의 랜덤 정수
		int num1 = (int) (Math.random()*90 + 1); 
		int num2 = (int) (Math.random()*90 + 1);
		
		
		Car.show();
		System.out.println();
		C.sales_volume(num1,num2,Car);
		Car.show();
		C.show();
		
		
		
		production Car2 = new production();
		Car2.set(90,90);
		sale D = new sale("기아차");
		

		int n1 = (int) (Math.random()*90 + 1);
		int n2 = (int) (Math.random()*90 + 1);
		
		
		Car2.show();
		System.out.println();
		D.sales_volume(num1,num2,Car2);
		Car2.show();
		D.show();
		

	}

}
