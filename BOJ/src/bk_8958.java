import java.util.Scanner;

public class bk_8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str[] = new String[n];
		
		for(int i=0; i<n; i++) {
			str[i] = sc.next();
			int cnt = 0;
			int sum = 0;
			for(int j=0; j<str[i].length(); j++) {
				if(str[i].charAt(j) == 'O')
					sum += ++cnt;
					else
						cnt = 0;   // X�̸� cnt �ٽ� 0���� �ʱ�ȭ ��Ŵ
			}
			System.out.println(sum);
		}
		
		

	}

}
