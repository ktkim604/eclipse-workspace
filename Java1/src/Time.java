import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		
		int num = sc.nextInt();
		int hour = num/3600;
		int minute = (num%3600)/60;
		int second = (num%3600)%60;
	
		System.out.println(num + "초는" + " " + hour + "시간," + minute + "분," + second + "초입니다." );
		
		System.out.println("예제 if문");
		System.out.println("점수를 입력하시오: ");
		int score = sc.nextInt();
		
		if(score>=80) {
			System.out.println("축하합니다! 합격입니다.");
		}
		else {
			System.out.println("불합격입니다ㅜㅠ");
		}
		
		System.out.println("점수를 입력하세요(0~100): ");
		int score1 = sc.nextInt();
		
		System.out.println("학년을 입력하세요(1~4): ");
		int year = sc.nextInt();
		
		if(score1>=60) {
			if(year != 4){
				System.out.println("합격");
			}
			else {
				System.out.println("불합격");
			}
		}
		else {
			System.out.println("불합격");
		}
		
		

	}

}
