import java.util.Scanner;

public class pr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("=== menu ===");
		System.out.println(" 0. ����");
		System.out.println(" 1. �ƽ�Ű ��ȣ �Է�");
		System.out.println(" 2. �ƽ�Ű ��ȣ ���");
		System.out.println(" 3. ��ȣ�� ���� ���� ���");
		
		while(true) {
			System.out.println(">");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.print("x,y ��ǥ �Է�> ");
					x = sc.nextInt();
					y = sc.nextInt();
					break;
					
				case 2:
					if((50<=x && x<=100) && (50<=y && y<=100)) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
					break;
					
				case 3:
					System.out.println("=== menu ===");
					System.out.println(" 0. ����");
					System.out.println(" 1. �ƽ�Ű ��ȣ �Է�");
					System.out.println(" 2. �ƽ�Ű ��ȣ ���");
					System.out.println(" 3. ��ȣ�� ���� ���� ���");
					break;
					
				default:
					
			}
			if(n == 4) {
				break;
		}
	}

}
}
