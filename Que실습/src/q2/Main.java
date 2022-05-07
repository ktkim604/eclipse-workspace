package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> jsp = new LinkedList<>();
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			jsp.add(i);
		}
		
		while(jsp.size() != 0) {
			for(int j = 1; j < K; j++) {
				int t = jsp.remove();
				jsp.add(t);
			}
			System.out.print(jsp.remove() + " ");		
		}
	}
}
