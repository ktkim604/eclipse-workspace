import java.util.Scanner;

public class bk_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		double max = 0;
		double sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		
		
		for(int i=0; i<arr.length; i++) {
			double change = arr[i]/max*100;
			sum += change;
		}
		System.out.println(sum / n);
		
		
		
	}

}
