
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동차와 주유소");
		Car SM5 = new Car();
		GasStation GS = new GasStation();
		
		SM5.set_gas(10);
		System.out.println(GS.get_gas());
		GS.set_gas(500);
		System.out.println(GS.get_gas());
		SM5.show();
		GS.show();
		int a = 100;
		SM5.fill_gas(a, GS);
		SM5.show();
		GS.show();
		
		SM5.fill_gas(460, GS); 
		

	}

}
