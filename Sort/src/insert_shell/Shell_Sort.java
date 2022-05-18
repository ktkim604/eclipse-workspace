package insert_shell;

import java.util.Scanner;

public class Shell_Sort {
    public static void main(String[] args) {
    	
    	long start = System.currentTimeMillis();
    	
    	Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
    	
    	 
        
        
        for(int h = n / 2; h > 0; h /= 2) {           //간격
            for(int i = h; i < n; i++) {            //삽입 정렬을 하기 위해 부분 배열의 두 번째 값을 가지고 값을 비교한다.
                int j;
                int temp = arr[i];                    //ex 간격이 4이면 처음 arr[i]는 7이다. 7 ~ 5까지 삽입 정렬 시작
                
                for(j = i - h; j >= 0 && arr[j] > temp; j -= h) {  //부분 배열끼리 연산하도록 j = i - h 
                    arr[j + h] = arr[j];                           //삽입 정렬을 위해 한칸 씩 미뤄준다.
                }
                arr[j + h] = temp;                                   //조건문을 빠져나온 j는 이미 j-h연산이 끝났으므로 다시 +h를 해준다.
            }
        }
        
        for(int a : arr) {
            System.out.print(a +" ");
        }
        long end = System.currentTimeMillis();
        System.out.println("수행시간: " + (end - start) + " ms");
    }
}
 




