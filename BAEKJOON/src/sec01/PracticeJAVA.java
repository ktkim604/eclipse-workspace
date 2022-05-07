package sec01;
/*
//1330번 문제

import java.util.Scanner;

public class PracticeJAVA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);     //Scanner 통해 화면으로 입력받게 만든다.
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		sc.close();
		
		if(A>B) System.out.println(">");
		else if(A == B) System.out.println("==");
		else System.out.println("<");
		
	}

}


//9498번 문제

import java.util.Scanner;

public class PracticeJAVA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		sc.close();
		
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
	}
	
}

*/

//14681번 문제
import java.util.Scanner;

public class PracticeJAVA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		System.out.print((X>0)?(Y>0)? 1 : 4 : (Y>0)? 2 : 3);
	}
}
		