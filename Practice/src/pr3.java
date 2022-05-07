import java.util.Scanner;

public class pr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.println("=== menu ===");
		System.out.println(" 0. 종료");
		System.out.println(" 1. 아스키 번호 입력");
		System.out.println(" 2. 아스키 번호 출력");
		System.out.println(" 3. 번호의 다음 문자 출력");
		
		while(true) {
			System.out.println(">");
			int n = sc.nextInt();
			switch(n) {
				case 1:
					System.out.print("x,y 좌표 입력> ");
					x = sc.nextInt();
					y = sc.nextInt();
					break;
					
				case 2:
					if((50<=x && x<=100) && (50<=y && y<=100)) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
					break;
					
				case 3:
					System.out.println("=== menu ===");
					System.out.println(" 0. 종료");
					System.out.println(" 1. 아스키 번호 입력");
					System.out.println(" 2. 아스키 번호 출력");
					System.out.println(" 3. 번호의 다음 문자 출력");
					break;
					
				default:
					
			}
			if(n == 4) {
				break;
		}
	}

}
}
