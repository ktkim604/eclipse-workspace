package message_passing;

public class production {
	private int Electric;
	private int Gas;
	private int sum = 0;

	public void set(int i, int j) {
		this.Electric = i;
		this.Gas = j;
	}
	public void show() {
		System.out.println("���� ������ ��� : "+Electric +"����"+", ���� �Ϲ��� ��� : " + Gas+"����");
	}
	public void p(int n, int k) {
		Electric -= n;
		Gas -= k;
		sum += n + k;
		if(sum >= 100) {
			System.out.println("100���� �̻� ���� ��ǥ �޼�!");
		}
	}
}
