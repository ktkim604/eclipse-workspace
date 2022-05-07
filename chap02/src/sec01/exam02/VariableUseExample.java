package sec01.exam02;

import java.util.Scanner;

public class VariableUseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간" + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총" + totalMinute + "분");
		System.out.println("3시간 5분");
		System.out.println("시간을 입력하세요: ");
		hour = sc.nextInt();
		System.out.println(hour + "시간" + minute + "분");
		sc.close();
		

	}

}
