import java.util.Scanner;

public class bk_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		int cnt = 0;
		
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt() % 42;
		}
		
		for(int i=0; i<arr.length; i++) {
			int temp = 0;   // �ݺ��� ���ư������� temp 0���� �ʱ�ȭ ���������
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					temp++;
				}
				
			}
			if(temp == 0) {
				cnt++;
			}
		}
	
		System.out.println(cnt);
		

	}

}
