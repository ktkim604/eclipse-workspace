import java.util.Scanner;

public class bk_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		int min = 1000001;
		int max = -10000001;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(min +" "+ max);

	}

}
