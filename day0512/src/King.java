
public class King {
	private String name;
	private int order;
	
	King(String name, int order) {
		this.name = name;
		this.order = order;
	}
	
	void show() {
		System.out.println("����" + order + "��� " + name);
	}

}
