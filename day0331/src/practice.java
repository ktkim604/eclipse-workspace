import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ǽ����� : �ݺ����� 32������ ~");
		int end;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ASCII��� �� ��ȣ �Է� > ");
		end = sc.nextInt();
		
		for(int i = 32; i<=end; i++) {
			System.out.print((char)i + " ");
			if((i+1)%16 == 0)
				System.out.println();
		}
	

	}

}
