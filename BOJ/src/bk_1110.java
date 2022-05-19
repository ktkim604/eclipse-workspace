import java.util.Scanner;

public class bk_1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		int cnt = 0;
		
		while(true) {
			int a = n / 10;
			int b = n % 10;
			n = ( (b*10) + (a+b)%10 );
			cnt++;
			
			if(copy == n) {
				break;
			}
			
			
		}
		System.out.println(cnt);
	}

}
