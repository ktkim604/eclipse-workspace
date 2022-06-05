package 기말01;

import java.util.Arrays;

class TV{
	private int channel;
	
	TV(int n){
		channel = n;
	}

	int get_channel() {
		return channel;
	}

	
}

class AI_TV extends TV{
	private String command;
	AI_TV(String command, int n){
		super(n);
		this.command = command;
	}
	
	void command(String a) {
		if(a.equals(command))     //문자열 비교 == 아님 !!!! 주의하자!!  --> a.equals(command)
			System.out.println("주인님! 현재 채널은 " + get_channel() + "번");
		else
			System.out.println("주인님! 저는 " + a + "가 아니예요.");
	}
}
class Practice{
	private int num;
	
	void random3(int num){
		int [] arr = new int[num];
		for(int i=0; i<num; i++) {
			arr[i] = ((int) (Math.random()*33 + 1))*3;
			System.out.print(arr[i] + " ");
			
		}
		System.out.println();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	static void div10(int num) {
		System.out.println(num % 10);
	}
	
	void last_word(String d) {
//		System.out.println(Arrays.toString(d.split(" ")));     //배열 형태 시각화
//		String lastChar = d.substring(d.length() - 1);		   //마지막 글자 뽑아내기 , 마지막 단어 단어 아님 !!
//		System.out.println(lastChar);
		
		String [] str = d.split(" ");
		int len = str.length;
		int last_idx = str.length - 1;
		System.out.println(str[last_idx]);
		
	}
	void max_no(int num){
		String x = Integer.toString(num);
//		System.out.println(x.charAt(7));
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
	static String lower(char c){
		String str = String.valueOf(c);
		String s = str.toLowerCase();
		return s;
	}
	
	public static void main(String[] args) {
		
		System.out.println("1번문제");
		Practice ex = new Practice();
		ex.random3(7);
		
		Practice.div10(2973);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
		System.out.println(lower('H'));
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		ex.last_word("What's your name?");
		ex.last_word("I am a boy");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		ex.max_no(18670725);
		ex.max_no(20030615);

		

		
		System.out.println();
		System.out.println("\n2번문제");
		TV lg = new TV(7);
		System.out.println("현재채널은 "+lg.get_channel()+"번");
		System.out.println();
		System.out.println("3번 문제");
		AI_TV siri = new AI_TV("시리야", 7);
		siri.command("시리야"); // AI의 이름과 같은 경우
		siri.command("누구"); // AI의 이름과 다른 경우

		

	}

}

