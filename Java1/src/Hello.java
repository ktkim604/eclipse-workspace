
public class Hello {    //Hello 이름의 클래스 생성
	
	public static int sum(int n, int m) {  //함수를 메소드로 지칭
		return n + m;
	}
	
	public static void main(String[] args) { //main() 메소드, 자바는 여기서 실행 시작 
		int i =20; 
		int s;
		char a;
		
		s = sum(i, 10);  //sum 메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);

	}

}
