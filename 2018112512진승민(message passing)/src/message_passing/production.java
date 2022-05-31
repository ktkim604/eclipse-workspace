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
		System.out.println("현재 전기차 재고 : "+Electric +"만대"+", 현재 일반차 재고 : " + Gas+"만대");
	}
	public void p(int n, int k) {
		Electric -= n;
		Gas -= k;
		sum += n + k;
		if(sum >= 100) {
			System.out.println("100만대 이상 수출 목표 달성!");
		}
	}
}
