package message_passing;

public class export {
	private int Ecar;
	private int Gcar;
	public void set(int i, int j) {
		this.Ecar = i;
		this.Gcar = j;
	}
	public void show() {
		System.out.println("������ ���ⷮ: "+Ecar +"����"+", �Ϲ��� ���ⷮ: "+Gcar+"����");
	}
	public void success_export(int i, int j, production Car) {
		Car.p(i, j);
		Ecar += i;
		Gcar += j;
	}
	
}
