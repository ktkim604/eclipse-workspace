import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1�� ����");
		System.out.print("���� �����Է�> ");
		int num = sc.nextInt();
		
		if((num%2 == 0) && (num%3 == 0)) {
			System.out.println("����� ����");
		}
		else {
			System.out.println("����� ����");
		}
		System.out.println("");
		
		System.out.println("2�� ����");
		int mode = 4;
		int x=0;
		System.out.println("=== menu ===");
		System.out.println(" 0. ����");
		System.out.println(" 1. �ƽ�Ű ��ȣ �Է�");
		System.out.println(" 2. �ƽ�Ű ��ȣ ���");
		System.out.println(" 3. ��ȣ�� ���� ���� ���");
		while(mode != 0) {
			System.out.print(">");
			mode = sc.nextInt();
			switch(mode) {
			case 0 :
				System.out.println("���¹� ����!");
				break;
			case 1:
				System.out.print("��ȣ�Է�>");
				x = sc.nextInt();
				break;
			case 2:
				System.out.println(x);
				break;
			case 3:
				System.out.println((char)(x+1));
				break;
			}
		}
System.out.println();
		System.out.println("3�� ����");
		
		int count = 0;
		int[] arr = new int [20];
		System.out.print("����, �� �Է�>");
		int size = sc.nextInt();
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int j=0; j<size; j++) {
			if(arr[j] < arr[j+1]) {
				count++;
			}
		}
		if(count > 1) {
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
		
		System.out.println();
		System.out.println("��������");
		
		System.out.println("�̸� ��� Ƚ��>");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("�����");
			if(i%5 == 0) {
				System.out.println();
			}
		}
		
				
		
	}
}
