package hanoi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하노이 탑의 갯수를 입력하시오 > ");
		int n = sc.nextInt();                         //원판 갯수
		
		sc.close();
		
		hanoi i = new hanoi();
		i.hanoi(n,'A','B','C');

	}

}
