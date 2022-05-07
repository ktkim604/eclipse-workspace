import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = new int[3]; // 배열 생성
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		intArr[0] = a;
		intArr[1] = b;
		intArr[2] = c;

		
		Arrays.sort(intArr);
		for(int j=0; j<intArr.length; j++) {
			System.out.print(intArr[2-j]+ " ");
		}
		scanner.close();

		}
	}
