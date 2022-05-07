import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("2018112447 김규태");
		System.out.println("1번문제");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("개수 입력> ");
		int k = sc.nextInt();
		
		for(int i=0; i<k; i++) {     //줄 개수
			for(int j=k-1; j>i; j--) {  //공백 개수
				System.out.print(" ");
				}
			for(int j=0; j<=i; j++) {  //별 찍기
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("2번 문제");
		
		System.out.print("양의 정수(개수,값) 입력>");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = -1;
        int idx = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        // 끝자리 인덱스와 가장 큰 원소를 가지고 있는 인덱스 자리 바꿈
        int tmp = arr[n-1];   
        arr[n-1] =arr[idx];   
        arr[idx]=tmp;
        System.out.println("max="+max);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        System.out.println("3번 문제");
        
        System.out.println("정수(1~100,000)> ");
        int num = sc.nextInt();
        while(true){
            num += num%10;
            num = num/10;

            if(num < 10){
                break;

            }
            
        }
        System.out.println(num); 
    }
		}
		
		
		
		
