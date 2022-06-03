package day0428;

public class Example {

	public boolean odd(int a) {
		if(a % 2 != 0) {
			return true;
		}
		else {
			return false;	
		}
		
	}

	public int min(int data[]) {
		int min = 100;
		for(int i=0; i<data.length; i++) {
			if(min > data[i]) {
				min = data[i];
			}
		}
		return min;
	}
	

}
