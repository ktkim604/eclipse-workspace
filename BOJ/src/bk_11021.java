import java.util.Scanner;

public class bk_11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=1; i<=5; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			System.out.println("Case #" + i + ":" + sum );
		}

	}

}
