package message_passing;

public class Main {

	public static void main(String[] args) {
		int num1 = (int) (Math.random()*5)+15;
		int num2 = (int) (Math.random()*5)+10;
		production Car = new production();
		Car.set(100,100);
		export C = new export();
		
		Car.show();
		C.success_export(num1,num2,Car);
		Car.show();
		C.show();
		C.success_export(num1,num2,Car);
		Car.show();
		C.show();
		C.success_export(num1,num2,Car);
		Car.show();
		C.show();
		C.success_export(num1,num2,Car);
		Car.show();
		C.show();
		
		
		
		
		
		

	}

}
