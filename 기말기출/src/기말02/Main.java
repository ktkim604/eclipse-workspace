package �⸻02;

//��ӹ���

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
		System.out.println("��� ��±���� �ִ� : " + print);
		System.out.println("����Ʈ ������ " + get_price() + "��");
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
		System.out.println("å�� ������ "+desk.get_price()+"��");
		
		Printer hp = new Printer(true, 200000);
		hp.show();
		
		//System.out.println((int)'z');     ���ĺ� �ƽ�Ű �ڵ尪 �˾Ƴ��� ����

		
	}

}
