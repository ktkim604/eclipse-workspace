package day0512;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		
		
		King [] k = new King[30];  //King ��ü 30���� ������ �迭�� �����Ѵ� !! 
		int size = 0;
		int mode;
		
		menu();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("> ");
			mode = sc.nextInt();
			switch(mode) {
		
			
			case 1:
				System.out.print("���� �̸� > "); //King Ŭ�������� �޾ƿ�
				String name = sc.next();
				System.out.print("���� ���� > ");
				int List = sc.nextInt();
				
				k[size++] = new King(name, List);  //�������� 
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
				System.out.println("����Ǿ����ϴ�.");
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
