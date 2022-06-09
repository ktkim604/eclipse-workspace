package 기말02;

public class Example {
	// * 별찍기
	public void plot(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// # 별찍기
	public void plot(char c, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < n-i; k++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
		
	}
	// 소문자 랜덤하게 출력 97~122까지
	public void rand_alpha(int num) {
		for(int i = 0; i < num; i++) {
			System.out.print((char)((Math.random()*26)+97));
		}
		System.out.println();
	}
	
	// AAABBBCCC 출력
	public void times(int n, String string) {
		for(int i = 0; i < n; i++) {
			char c = string.charAt(i);
			for(int j = 0; j < n; j++) {
				System.out.print(c);
			}
		}
		System.out.println();
		
	}

	public static boolean toggle(boolean b) {
		if(b) {
			return false;
		}
		else {
			return true;
		}
	}
}
