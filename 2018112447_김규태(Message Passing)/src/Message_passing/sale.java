package Message_passing;


public class sale {
	private int high_car;
	private int normal_car;
	private String brand;
	
	public sale() {}
	
	public sale(String brand) {
		this.brand = brand;
		System.out.println("---------------"+brand+"---------------");
	}
	
	public void getbrand() {
		System.out.println(brand);
	}
	
	
	public void set(int i, int j) {
		this.high_car = i;
		this.normal_car = j;
	}
	public void show() {
		System.out.println("고급차 판매량 : "+ high_car +"만대"+", 일반차 판매량 : "+normal_car+"만대");
		
	}
	public void sales_volume(int i, int j, production Car) {
		high_car += i;
		normal_car += j;
		
		Car.p(i, j, high_car, normal_car);
		
		
	}

}
