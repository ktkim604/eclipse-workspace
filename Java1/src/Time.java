import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		
		int num = sc.nextInt();
		int hour = num/3600;
		int minute = (num%3600)/60;
		int second = (num%3600)%60;
	
		System.out.println(num + "�ʴ�" + " " + hour + "�ð�," + minute + "��," + second + "���Դϴ�." );
		
		System.out.println("���� if��");
		System.out.println("������ �Է��Ͻÿ�: ");
		int score = sc.nextInt();
		
		if(score>=80) {
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ٤̤�");
		}
		
		System.out.println("������ �Է��ϼ���(0~100): ");
		int score1 = sc.nextInt();
		
		System.out.println("�г��� �Է��ϼ���(1~4): ");
		int year = sc.nextInt();
		
		if(score1>=60) {
			if(year != 4){
				System.out.println("�հ�");
			}
			else {
				System.out.println("���հ�");
			}
		}
		else {
			System.out.println("���հ�");
		}
		
		

	}

}
