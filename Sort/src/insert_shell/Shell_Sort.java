package insert_shell;

import java.util.Scanner;

public class Shell_Sort {
    public static void main(String[] args) {
    	
    	long start = System.currentTimeMillis();
    	
    	Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
    	
    	 
        
        
        for(int h = n / 2; h > 0; h /= 2) {           //����
            for(int i = h; i < n; i++) {            //���� ������ �ϱ� ���� �κ� �迭�� �� ��° ���� ������ ���� ���Ѵ�.
                int j;
                int temp = arr[i];                    //ex ������ 4�̸� ó�� arr[i]�� 7�̴�. 7 ~ 5���� ���� ���� ����
                
                for(j = i - h; j >= 0 && arr[j] > temp; j -= h) {  //�κ� �迭���� �����ϵ��� j = i - h 
                    arr[j + h] = arr[j];                           //���� ������ ���� ��ĭ �� �̷��ش�.
                }
                arr[j + h] = temp;                                   //���ǹ��� �������� j�� �̹� j-h������ �������Ƿ� �ٽ� +h�� ���ش�.
            }
        }
        
        for(int a : arr) {
            System.out.print(a +" ");
        }
        long end = System.currentTimeMillis();
        System.out.println("����ð�: " + (end - start) + " ms");
    }
}
 




