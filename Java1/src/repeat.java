import java.util.Scanner;

public class repeat {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i<=10; i++) {
			sum += i;
			System.out.print(i); //더하는 수 출력
			
			if(i<=9) {
				System.out.print("+");
			}
			else {
				System.out.print("=");
				System.out.println(sum);

			}		
		}
		
		System.out.println("while sample");
		
		int count = 0;
		sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		int n = sc.nextInt();
		
		while (n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
			}
		if(count == 0) {
			System.out.println("입력 된 수가 없습니다.");
		}
		else {
			System.out.println("정수의 개수는 " + count + "이며 " + "평균은 " + (double)sum/count + "입니다.");
		}
		
		System.out.println("do while sample");
		
		char c = 'a';
		do {
			System.out.print(c);
			c = (char)(c+1);
		} while(c <= 'z');
		
		System.out.println("");
		System.out.println("구구단 출력");
		
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print('\t');
			}
			System.out.println();
				
		}
		
		
		System.out.println("continue 예제");
		
		
		sum = 0;
		for(int i = 0; i<5; i++) {
			n = sc.nextInt();
			if(n <= 0) {
				continue;
			}
			else {
				sum += n;
			}
		}
		System.out.println("양수의 합은 " + sum);
		
		
		
		System.out.println(" 문자열 비교 시 ");
		
		
		System.out.println("exit을 입력하면 종료합니다.");
		
		while(true) {
			System.out.println(">>");
			String text = sc.nextLine();
			if(text.equals("exit")) {
				break;
			}
			
		}
		System.out.println("종료합니다...");
	}

}
