// 1~100000 ������ ��� �Ҽ����� ã�Ƽ� ����ϴ� ���α׷�

public class Code10 {

	public static void main(String[] args) {
		
		for(int n=2; n<=100000; n++) {
			boolean isprime = true;      //���������� ��Ģ( ���Ű� �߰� �Ǳ� ������ �ϴ� ���� )
			for(int i=2; i*i<=n && isprime; i++) {
				if(n%i == 0)
					isprime = false;
			}
			if(isprime)
				System.out.println(n);
		}
		

	}

}