import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.print(i); //���ϴ� �� ���
			
			if(i<=9) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.println(sum);

			}		
		}
		
		System.out.println("while sample");
		
		int count = 0;
		sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		
		int n = sc.nextInt();
		
		while (n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
			}
		if(count == 0) {
			System.out.println("�Է� �� ���� �����ϴ�.");
		}
		else {
			System.out.println("������ ������ " + count + "�̸� " + "����� " + (double)sum/count + "�Դϴ�.");
		}
		
		System.out.println("do while sample");
		
		char c = 'a';
		do {
			System.out.print(c);
			c = (char)(c+1);
		} while(c <= 'z');
		
		System.out.println("");
		System.out.println("������ ���");
		
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
				
		}
		
		
		System.out.println("continue ����");
		
		
		sum = 0;
		for(int i = 0; i<5; i++) {
			n = sc.nextInt();
			if(n <= 0) {
				continue;
			}
			else {
				sum += n;
			}
		}
		System.out.println("����� ���� " + sum);
		
		
		
		System.out.println(" ���ڿ� �� �� ");
		
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.println(">>");
			String text = sc.nextLine();
			if(text.equals("exit")) {
				break;
			}
			
		}
		System.out.println("�����մϴ�...");
	}

}
