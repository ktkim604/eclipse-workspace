package Message_passing;

public class production {
	private int Suv;
	private int Small_car;
	private String expensive;
	private String cheap;
	
	public production() {}
	public production(String expensive, String cheap) {
		this.expensive = expensive;
		this.cheap = cheap;
		System.out.println("----------[" + expensive + ", " + cheap +" ��]----------");
		
	}
	

	public void set(int i, int j) {
		this.Suv = i;
		this.Small_car = j;
	}
	public void show() {
		System.out.println("����� ��� : "+ Suv +"����"+", �Ϲ��� ��� : " + Small_car +"����");
	}
	public void p(int n, int k, int hc, int nc) {
		
		Suv -= n;
		Small_car -= k;
		
		if(hc >= nc) {
	
			System.out.println("[ ���⵵ ��� �������� ���� ! ]");
		}
		else
			System.out.println("[ ���⵵ ��� �������� ����.. ]");
	}

}
