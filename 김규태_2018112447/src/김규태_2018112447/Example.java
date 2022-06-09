package ╠Х╠теб_2018112447;

public class Example {
	public void plot(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void print10(int n) {
		int x = n / 10;
		int y = x % 10;
		System.out.println(y);
	}
	
	int count(String x, char c) {
		String str = Character.toString(c);
        
		int count = 0;

        for(int i = 0; i<x.length();i++){
            if (x.substring(i,i+1).equals(str)){
                count+=1;
            }
        }
        return count;
	}
	
	void note(String x){

        for(int i=0; i<x.length(); i++){
            if (x.substring(i,i+2).equals("//")){  
                System.out.println(x.substring(i+2));
                break;
            }
        }
    }
	
	
}

