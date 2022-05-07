// 1~100000 사이의 모든 소수들을 찾아서 출력하는 프로그램

public class Code10 {

	public static void main(String[] args) {
		
		for(int n=2; n<=100000; n++) {
			boolean isprime = true;      //무죄추정의 원칙( 증거가 발견 되기 전까지 일단 무죄 )
			for(int i=2; i*i<=n && isprime; i++) {
				if(n%i == 0)
					isprime = false;
			}
			if(isprime)
				System.out.println(n);
		}
		

	}

}