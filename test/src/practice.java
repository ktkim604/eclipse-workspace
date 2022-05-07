import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		System.out.println("32보다 큰 숫자 하나를 입력하세요:");
		Scanner scanner = new Scanner(System.in);		
		int num1 = scanner.nextInt();
		
		if (num1<=48)
			for(int i=32; i < num1+1; i++) {
				char a = (char)i; 
				System.out.print(a);
			}
		else {
			for(int i=32; i < 47; i++) {
				char a = (char)i; 
				System.out.print(a);}
			char b = (char)47; 
			System.out.println(b);
			
			for(int i=48; i < num1+1; i++) {
				char c = (char)i; 
				System.out.print(c);}
		
			scanner.close();
		}
	

	}

}
