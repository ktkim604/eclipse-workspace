package Message_passing;

public class production {
	private int Suv;
	private int Small_car;
	

	public void set(int i, int j) {
		this.Suv = i;
		this.Small_car = j;
	}
	public void show() {
		System.out.println("고급차 재고 : "+ Suv +"만대"+", 일반차 재고 : " + Small_car +"만대");
	}
	public void p(int n, int k, int hc, int nc) {
		
		Suv -= n;
		Small_car -= k;
		
		if(hc >= nc) {
	
			System.out.println("[ 전년도 대비 영업이익 증가 ! ]");
		}
		else
			System.out.println("[ 전년도 대비 영업이익 감소.. ]");
	}

}
