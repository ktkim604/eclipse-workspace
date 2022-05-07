package 과제1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A(x)=(차수,값)");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr.index_push(a, b);
			if(a==0 && b==0) break;
		}
		System.out.println();
		System.out.println("B(x)=(차수,값)");
		ArrayList<Integer> brr = new ArrayList<>();
		while(true) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			brr.index_push(c, d);
			if(c==0&&d==0) break;
		}
		System.out.println();
		ArrayList<Integer> crr=new ArrayList<>();
		if(arr.size() > brr.size()) {
			for(int i = arr.size()-1; i>=brr.size(); i--) {
				crr.push(arr.get(i));
			}
			for(int i = brr.size()-1; i>=0; i--) {
				crr.push(arr.get(i)+brr.get(i));
			}
			for(int i = 0; i <crr.size()-1; i++) {
				if(i == 0) {
					System.out.print(crr.get(i)+"x^"+(crr.size()-2-i));
				}
				else if(i == crr.size()-2) {
					System.out.print("+"+crr.get(i));
				}
				else {
					System.out.print("+"+crr.get(i)+"x^"+(crr.size()-2-i));
				}
				
			}
		}
		else if(arr.size()==brr.size()) {
			for(int i = 0; i < arr.size(); i++) {
				crr.push(arr.get(i)+brr.get(i));
			}
			for(int i = crr.size()-1; i > 0;i--) {
				if(i == crr.size()-1) {
					System.out.print(crr.get(i)+"x^"+(crr.size()-2));
				}
				else if(i == 1) {
					System.out.print("+"+crr.get(i));
				}
				else {
					System.out.print("+"+crr.get(i)+"x^"+(i-1));
				}
			}

		}
		else {
			for(int i = brr.size()-1; i>=arr.size(); i--) {
				crr.push(brr.get(i));
			}
			for(int i = arr.size()-1; i>=0; i--) {
				crr.push(arr.get(i)+brr.get(i));
			}
			for(int i = 0; i <crr.size()-1; i++) {
				if(i == 0) {
					System.out.print(crr.get(i)+"x^"+(crr.size()-2-i));
				}
				else if(i == crr.size()-2) {
					System.out.print("+"+crr.get(i));
				}
				else {
					System.out.print("+"+crr.get(i)+"x^"+(crr.size()-2-i));
				}
			}
		}
		
	}

}
