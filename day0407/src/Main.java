import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		System.out.println("[Practice 3-6]");
		System.out.println("[ menu ]");
		System.out.println("0 : exit");
		System.out.println("1 : input (array");
		System.out.println("2 : show (array)");
		System.out.println("3 : menu");
		
		int int_arr[] = new int[10];
		
		Scanner sc = new Scanner(System.in); 

		int b = 0;
		int a;
		do {
			a = sc.nextInt();
			if (a == 1) {
				System.out.print("정수 (개수, 값)>");
				b = sc.nextInt();
				for(int i=0; i<b ;i++) {
					int_arr[i] = sc.nextInt();
				}
				System.out.println("입력 완료");	
			}
			else if (a == 2){
				for(int i=0; i<b; i++) {
					System.out.println(int_arr[i] + " ");
				}
			}
			else if (a == 3) {
				System.out.println("[ menu ]");
				System.out.println(" 0 : exit");
				System.out.println(" 1 : input (array)");
				System.out.println(" 2 : show (array)");
				System.out.println(" 3 : menu");
			}
			else {
				System.out.println("종료되었습니다.");
			}
		} while(a !=0);
			
		sc.close();
	}


}


