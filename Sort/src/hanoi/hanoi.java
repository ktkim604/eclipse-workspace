package hanoi;

public class hanoi {
	
	public static void hanoi(int i, char a, char b, char c) {  // A기둥, B기둥, C기둥, i개의 원판구성은 맨 아래 원판과 나머지 i-1개의 원반묶음
		if(i == 1) {     //이동할 원판의 수가 1개라면
			System.out.println("원판" + i + "을" + a + "에서" + c + "로 옮김");
		}
		else {
			hanoi(i-1,a,c,b);     // 기둥A에서 맨 아래 원판을 제외한 나머지 모든 원판을 기둥C를 이용하여 기둥B로 옮김
			System.out.println("원판" + i + "을" + a + "에서" + c + "로 옮김");  // 기둥A에서 남은 1개의 원판을 기둥C로 옮김
			hanoi(i-1,b,a,c);     // 기둥B에서 맨 아래 원판을 제외한 나머지 모든 원판을 기둥A를 이용하여 기둥C로 옮김
		}
	}

}
