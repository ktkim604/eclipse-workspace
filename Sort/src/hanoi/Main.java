package hanoi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ��� ž�� ������ �Է��Ͻÿ� > ");
		int n = sc.nextInt();                         //���� ����
		
		sc.close();
		
		hanoi i = new hanoi();
		i.hanoi(n,'A','B','C');

	}

}
