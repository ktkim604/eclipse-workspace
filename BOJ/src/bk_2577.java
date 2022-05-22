import java.util.Scanner;

public class bk_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int n = A*B*C;
		int arr[] = new int[10];
		
		while(n > 0) {
			arr[n%10]++;
			n /= 10;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
