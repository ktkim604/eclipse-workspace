import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ��� �Է��Ͻÿ�:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a % b);

	}

}
