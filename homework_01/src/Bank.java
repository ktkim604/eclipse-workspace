
class Bank {
	private float myBank,deposit;
	
	
	Bank(){
		myBank =0;
	}
	Bank(float myBank){
		this.myBank = myBank;
	}
	
	void setMyBank(float myBank) {
		this.myBank = this.myBank + myBank;
		System.out.println("내 통장 잔고: "+this.myBank+"만원");
	}

	void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	void deposit(Stock st) {
		if(deposit>myBank) {
			System.out.println("추가 입금 금액: "+deposit+"만원");
			System.out.println("입금 실패: 잔액이 부족합니다.");
		}
		else {
			System.out.println("추가 입금 금액: "+deposit+"만원");
			st.add(deposit);
			myBank -= deposit;			
		}
		
	}
	
	void show() {
		System.out.println("내 통장 잔고: "+ myBank+"만원");
	}

}
