package message_passing;

public class export {
	private int Ecar;
	private int Gcar;
	public void set(int i, int j) {
		this.Ecar = i;
		this.Gcar = j;
	}
	public void show() {
		System.out.println("전기차 수출량: "+Ecar +"만대"+", 일반차 수출량: "+Gcar+"만대");
	}
	public void success_export(int i, int j, production Car) {
		Car.p(i, j);
		Ecar += i;
		Gcar += j;
	}
	
}
