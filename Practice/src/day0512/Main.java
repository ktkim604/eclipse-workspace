package day0512;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		
		
		King [] k = new King[30];  //King 객체 30개를 가지는 배열을 생성한다 !! 
		int size = 0;
		int mode;
		
		menu();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("> ");
			mode = sc.nextInt();
			switch(mode) {
		
			
			case 1:
				System.out.print("왕의 이름 > "); //King 클래스에서 받아옴
				String name = sc.next();
				System.out.print("왕의 순서 > ");
				int List = sc.nextInt();
				
				k[size++] = new King(name, List);  //주의하자 
				break;
				
				
			case 2:
				for(int i=0; i<size; i++)
				k[i].show();
				break;
			
			case 3:
				menu();
				break;
			}
			if(mode == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		
	}
	private static void menu() {
		System.out.println("[ menu ]");
		System.out.println("0 : exit");
		System.out.println("1 : input (King Info.)");
		System.out.println("2 : show (King List)");
		System.out.println("3 : menu");
	}

}
