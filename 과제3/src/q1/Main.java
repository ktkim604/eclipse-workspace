package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListQueue<Integer> lq = new LinkedListQueue<>();
		
		for(int i = 0; i < 6; i++) {
			lq.add(sc.nextInt());
		}
		System.out.println(lq.peek());   
		System.out.println(lq.tail());
		System.out.println(lq.tailNext());
		for(int i = 0; i < 6; i++) {
			if(sc.nextInt() == 0) {
				System.out.println(lq.remove());
			}
		}
		
		
	}

}
