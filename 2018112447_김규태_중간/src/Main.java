import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("2018112447 �����");
		System.out.println("1������");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�> ");
		int k = sc.nextInt();
		
		for(int i=0; i<k; i++) {     //�� ����
			for(int j=k-1; j>i; j--) {  //���� ����
				System.out.print(" ");
				}
			for(int j=0; j<=i; j++) {  //�� ���
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("2�� ����");
		
		System.out.print("���� ����(����,��) �Է�>");
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
        // ���ڸ� �ε����� ���� ū ���Ҹ� ������ �ִ� �ε��� �ڸ� �ٲ�
        int tmp = arr[n-1];   
        arr[n-1] =arr[idx];   
        arr[idx]=tmp;
        System.out.println("max="+max);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        System.out.println("3�� ����");
        
        System.out.println("����(1~100,000)> ");
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
		
		
		
		
