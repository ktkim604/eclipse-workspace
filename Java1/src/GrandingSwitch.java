import java.util.Scanner;

public class GrandingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		char grade;
		System.out.println("������ �Է��ϼ���(0~100): ");
		int score = sc.nextInt();
		
		switch(score/10){
			case 10:  //score = 100
			case 9:   //score�� 90~99
				grade = 'A';
				break;
			
			case 8:  // score�� 80~89
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				
			} 
			
		System.out.println("������ " + grade + "�Դϴ�.");
		
		*/
		System.out.println("Ŀ�Ǹ޴� ���� ����");
		
		System.out.print("���� Ŀ�Ǹ� �帱���> ");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
			case "����������":
			case "īǪġ��":
			case "ī���":
				price = 3500;
				break;
			
			case "�Ƹ޸�ī��":
				price = 2000;
				break;
			
			default:
				System.out.println("�޴��� �����ϴ�.");
			
			}
		System.out.println(order + "�� " + price + "�� �Դϴ�.");
	}

}
