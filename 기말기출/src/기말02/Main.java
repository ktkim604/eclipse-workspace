package 기말02;

//상속문제

class Goods{
	private int price;
	Goods(int price){
		this.price = price;
	}
	int get_price() {
		return price;
	}
}

class Printer extends Goods{
	
	private boolean print;
	Printer(boolean print, int price){
		super(price);
		this.print = print;
	}
	
	void show() {
		System.out.println("양면 출력기능이 있다 : " + print);
		System.out.println("프린트 가겨은 " + get_price() + "원");
	}
	
}



public class Main {

	public static void main(String[] args) {
		
		Example ex = new Example();
		ex.plot(4);
		ex.plot('#', 5);
		ex.rand_alpha(7);
		ex.times(3, "ABC");
		System.out.println( Example.toggle(false) );


		
		
		Goods desk = new Goods(300000);
		System.out.println("책상 가격은 "+desk.get_price()+"원");
		
		Printer hp = new Printer(true, 200000);
		hp.show();
		
		//System.out.println((int)'z');     알파벳 아스키 코드값 알아낼수 있음

		
	}

}
