package sec01.exam02;

import java.util.Scanner;

public class VariableUseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "�ð�" + minute + "��");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("��" + totalMinute + "��");
		System.out.println("3�ð� 5��");
		System.out.println("�ð��� �Է��ϼ���: ");
		hour = sc.nextInt();
		System.out.println(hour + "�ð�" + minute + "��");
		sc.close();
		

	}

}
