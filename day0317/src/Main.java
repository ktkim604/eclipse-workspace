import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.print("���� �Է�:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = num/100;
		int b = (num%100)/10;
		int c = num%10;
		int sum = a + b + c; 
		sc.close();
		
		
		System.out.println("�� �ڸ��� �հ� =" + sum);
		

	}

}
