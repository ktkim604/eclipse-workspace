class Example {
	int a ;
	
	boolean odd(int b){
		if(b %2!=0) {
			return true;
			
		}
		else {
			return false;
		}
	}
	int min(int arr[]) {
		int min = 100;
		for (int i =0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Example ex = new Example();
		int a =5;
		System.out.print("1������= ");
		if(ex.odd(a)) {
			System.out.println("Ȧ��");
		}
		else {
			System.out.println("¦��");
		}
		
		char c = 's';
		c = next(c);
		System.out.println("2������ = "+c);
		
		int[] data = {10,5,8,20,7,3,30,25,15};
		System.out.println("3������ = "+ex.min(data));
		
		
	}

	private static char next(char c) {
		// TODO Auto-generated method stub
		char b ='t';
		return b;
	}
	

}
