

//
class Circle{
	//field  vs. ��������
	int radius;
	String name;
	
	//method
	void getArea() {
		System.out.println(radius* radius*3.14);     //���������� �ٸ��� �ʵ忡�� ������ ������ ������ ���� ����.
	}
}

public class chap4 {

	public static void main(String[] args) {  //�޼ҵ�
		// TODO Auto-generated method stub
		System.out.println("��ü���� �ǽ�");
		
		// ��ü ����
		
		Circle pizza = new Circle();    // Scanner�� �����
		
		pizza.radius = 10;
		
		pizza.name = "�̽�������";    //��ü�� ���� �����ϴ� ���
		
		//�޼ҵ� ȣ��
		pizza.getArea();
		
		System.out.println(pizza.radius +" "+ pizza.name);

	}

}
