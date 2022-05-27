
class Stock {
	private float myMoney =0.0f; //내가 넣은 돈!
	private float nowMoney = 0.0f; //현재 금액
	private float incre=0.0f; //손익률
	
	Stock(){
		myMoney = 0;
	}
	Stock(float myMoney){
		this.myMoney = myMoney;
		this.nowMoney =myMoney;
	}
	
	void showMyMoney() {
		System.out.println("현재 내가 넣은 금액:"+ myMoney+"만원");
	}
	
	void increase(float va) {//변화율
		nowMoney += va;
		incre = nowMoney/myMoney*100;
	}
	
	void add(float deposit) {
		myMoney += deposit;
		nowMoney += deposit;
		System.out.println("현재 넣은 금액:"+ myMoney+"만원");
		System.out.println("현재 주식 상태:"+ nowMoney+"만원");
	}

	void show() {
		incre =nowMoney/myMoney*100;
		System.out.println("현재 넣은 금액:"+ myMoney+"만원");
		System.out.println("현재 주식 상태: "+ nowMoney+"만원");
		System.out.println("현재 손익률: "+incre+"%");
	}

}
