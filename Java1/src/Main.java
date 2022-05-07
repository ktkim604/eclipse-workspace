import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 문제");
		System.out.print("양의 정수입력> ");
		int num = sc.nextInt();
		
		if((num%2 == 0) && (num%3 == 0)) {
			System.out.println("김규태 성공");
		}
		else {
			System.out.println("김규태 실패");
		}
		System.out.println("");
		
		System.out.println("2번 문제");
		int mode = 4;
		int x=0;
		System.out.println("=== menu ===");
		System.out.println(" 0. 종료");
		System.out.println(" 1. 아스키 번호 입력");
		System.out.println(" 2. 아스키 번호 출력");
		System.out.println(" 3. 번호의 다음 문자 출력");
		while(mode != 0) {
			System.out.print(">");
			mode = sc.nextInt();
			switch(mode) {
			case 0 :
				System.out.println("진승민 종료!");
				break;
			case 1:
				System.out.print("번호입력>");
				x = sc.nextInt();
				break;
			case 2:
				System.out.println(x);
				break;
			case 3:
				System.out.println((char)(x+1));
				break;
			}
		}
System.out.println();
		System.out.println("3번 문제");
		
		int count = 0;
		int[] arr = new int [20];
		System.out.print("개수, 값 입력>");
		int size = sc.nextInt();
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
			
		}
		for(int j=0; j<size; j++) {
			if(arr[j] < arr[j+1]) {
				count++;
			}
		}
		if(count > 1) {
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
		
		System.out.println();
		System.out.println("다음문제");
		
		System.out.println("이름 출력 횟수>");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print("김규태");
			if(i%5 == 0) {
				System.out.println();
			}
		}
		
				
		
	}
}
