package insert;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    ArrayList<Integer> arr = new ArrayList<>();
	    for (int i = 0; i < 8; i++) {
	      arr.push(sc.nextInt());
	    }
	for (int i = 0; i < arr.getSize(); i++){
	  for (int j = 0; j < i; j++){
	    if(arr.getItem(i) < arr.getItem(j)){
	      int temp = arr.getItem(i);
	      arr.setItem(arr.getItem(j),i);
	      arr.setItem(temp,j);
	    }
	  }}

	    System.out.print(arr.toString());
	}
}