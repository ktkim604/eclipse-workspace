package Message_passing;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		production Car = new production();
		Car.set(90,90);
		sale C = new sale("Çö´ëÂ÷");
		

		int num1 = (int) (Math.random()*50 + 1);
		int num2 = (int) (Math.random()*50 + 1);
		
		
		Car.show();
		System.out.println();
		C.success_sale(num1,num2,Car);
		Car.show();
		C.show();
		
		
		
		production Car2 = new production();
		Car2.set(90,90);
		sale D = new sale("BMW");
		

		int n1 = (int) (Math.random()*50 + 1);
		int n2 = (int) (Math.random()*50 + 1);
		
		
		Car2.show();
		System.out.println();
		D.success_sale(num1,num2,Car2);
		Car2.show();
		D.show();
		

	}

}
