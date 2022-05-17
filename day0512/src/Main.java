import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[ menu ]");
		System.out.println("0 : exit");
		System.out.println("1 : input (King Info.}");
		System.out.println("2 : show  (King List)");
		System.out.println("3 : menu");
		
		King [] k = new King[30];
		Scanner sc = new Scanner(System.in);
		int mode = 4; int cnt = 0;
		
		while(mode != 0) {
			System.out.print(">");
			mode = sc.nextInt();
			switch(mode) {
				case 0:
					System.out.println("종료되었습니다");
					break;
				case 1:
					System.out.print("왕의 이름 > ");
					String name = sc.next();
					System.out.print("왕의 순서 > ");
					int order = sc.nextInt();
					k[cnt++] = new King(name, order);
					break;
					
				case 2:
					for(int i=0; i<cnt; i++) {
						k[i].show();
					}
					break;
					
				case 3:
					System.out.println("[ menu ]");
					System.out.println("0 : exit");
					System.out.println("1 : input (King Info.");
					System.out.println("2 : show  (King List)");
					System.out.println("3 : menu");
					break;
					
			}
			
		}
		
	}

}
