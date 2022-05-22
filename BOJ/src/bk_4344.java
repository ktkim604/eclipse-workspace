import java.util.Scanner;

public class bk_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		for(int i=0; i<n; i++) {
			int stu_num = sc.nextInt();
			double avg = 0;
			double per = 0;
			int cnt = 0;
			int sum = 0;
			int arr_score[] = new int[stu_num];
			
			
			for(int j=0; j<stu_num; j++) {
				arr_score[j] = sc.nextInt();
				sum += arr_score[j];
				
				}
			avg = sum/stu_num;
			for(int j=0; j<stu_num; j++) {
				if(arr_score[j] > avg) {
					cnt ++;
				}
			}
			per = (double)cnt/stu_num*100;
			System.out.printf("%.3f", per);
			System.out.println("%");
			
		}

	}

}
