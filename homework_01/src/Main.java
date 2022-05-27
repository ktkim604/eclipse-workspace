import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Stock st =new Stock(50);
		Bank bk = new Bank(300);
		
		Scanner sc = new Scanner(System.in);
		int mode =7;
		
		
		while(mode!=0) {
			System.out.println("============menu============");
			System.out.println("0.종료");
			System.out.println("1.내 계좌잔액 보기");
			System.out.println("2.첫 투자금액 보기");
			System.out.println("3.변동금액 설정");
			System.out.println("4.추가 투자금액 설정");
			System.out.println("5.현재 투자금액과 손익률 보기");
			System.out.println("6.내통장 잔액보기");
			System.out.println("7.내통장 입금");
			System.out.println("============================");
			
			System.out.print("메뉴를 선택하세요: ");
			mode = sc.nextInt();
			float money = 0;
			
			switch(mode){
			case 1:
				bk.setMyBank(0);
				break;
			case 2:
				System.out.print("첫 투자금액 보기");
				st.showMyMoney();
				break;
			case 3:
				System.out.print("변동금액을 설정하세요: ");
				money = sc.nextFloat();
				st.increase(money);
				money =0;
				break;
			case 4:
				System.out.print("추가 투자금액을 입력하세요: ");
				money = sc.nextFloat();
				bk.setDeposit(money);
				bk.deposit(st);
				money=0;
				break;
			case 5:
				st.show();
				break;
			case 6:
				bk.show();
				break;
			case 7:
				System.out.print("내계좌에 넣을 금액을 입력하세요: ");				
				money =sc.nextFloat();
				bk.setMyBank(money);
				money =0;
				break;
			}
		}
		st.show();
		bk.show();
		System.out.println("종료되었습니다.");
		
		
		sc.close();
	
	}

}
