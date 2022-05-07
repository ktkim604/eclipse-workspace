import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("실습과제 : 반복문은 32번부터 ~");
		int end;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ASCII출력 끝 번호 입력 > ");
		end = sc.nextInt();
		
		for(int i = 32; i<=end; i++) {
			System.out.print((char)i + " ");
			if((i+1)%16 == 0)
				System.out.println();
		}
	

	}

}
