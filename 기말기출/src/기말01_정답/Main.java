package �⸻01_����;

class Practice{
	//3�� ��� ���� ���
	void random3(int n) {
		for(int i=0; i<n; i++) {
			System.out.print((int)(Math.random()*33+1) + " ");
		}
		System.out.println();
	}
	
	//���� �ڸ� ��� static ���� !!
	static void div10(int n) {
		System.out.println(n%10);
	}
	
	//������ �ܾ� ���
	void last_word(String s) {
		String[] arr = s.split(" ");
		System.out.println(arr[arr.length-1]);
	}
	
	//��� �ڸ��� ������ ���� ū ��
	void max_no(int val) {
		String x = Integer.toString(val);
		int len = x.length();
		char max = 0;
		char temp;
		
		for(int i=0; i<len; i++) {
			temp = x.charAt(i);
			if(temp > max) {
				max = temp;
			}
			
		}
		System.out.println(max);
	}
}

public class Main {
	//�빮�ڸ� �ҹ��ڷ� ��ȯ
	static char lower(char c) {
		return (char)(c +'a'-'A');  
	}

	public static void main(String[] args) {
		
		Practice ex = new Practice();
		ex.random3(7);
		
		Practice.div10(2973);
		
		System.out.println( lower('H'));
		
		ex.last_word("What's your name?");
		ex.last_word("I am a boy");
		
		ex.max_no(18670725);		//8
		ex.max_no(20030615);		//6

	}

}
