import java.util.Scanner;

public class GrandingSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		char grade;
		System.out.println("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		switch(score/10){
			case 10:  //score = 100
			case 9:   //score는 90~99
				grade = 'A';
				break;
			
			case 8:  // score는 80~89
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				
			} 
			
		System.out.println("학점은 " + grade + "입니다.");
		
		*/
		System.out.println("커피메뉴 가격 문제");
		
		System.out.print("무슨 커피를 드릴까요> ");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
			case "에스프레소":
			case "카푸치노":
			case "카페라떼":
				price = 3500;
				break;
			
			case "아메리카노":
				price = 2000;
				break;
			
			default:
				System.out.println("메뉴에 없습니다.");
			
			}
		System.out.println(order + "는 " + price + "원 입니다.");
	}

}
