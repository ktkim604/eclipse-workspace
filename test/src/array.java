import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); //ó���� �Է��� ������ ������?

        int arr[] = new int[size + 1]; // �� ĭ�� �ڷ� �б� ������ 1ū �迭 ���� -> �� ��ĭ�� �о�? -? ���ڸ� ���̿� �����ϸ� ũ�Ⱑ 1�� Ŀ���״ϱ�  1 2 ���̿� 5�� ������ 1 5 2 �� �Ǵ� ��ó��
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); //�迭 ����
        }
//        System.out.println("�迭 �Է� ��");

        int idx  = sc.nextInt(); //�ε������ٿ��̴�.,
        // int idx = sc.nextInt()-1;  x ��°��� ������� ,
        int value = sc.nextInt(); // -> idx �ε����� value ���ڸ� �־��ְ� �ʹ� .

        //for ������ ������ size�� �ΰ� �迭 �Է� �� size++�� size�� ������Ű�� ����� ����

        int  index = size - 1; //�ε����� �迭�� ������ ������ �����ϱ� ���ؼ��� size -1 �� �����ؾ��ϱ⶧����
        while (true) {

            if (index != idx) {  // ���� index�� idx�� �ƴϸ� �ڷ� �о��شٴ� ����
                arr[index + 1] = arr[index];
            } else {
                arr[index + 1] = arr[index]; // ���� Index�� idx�̸� ���� ���ڸ� �ڷ� �о��ְ�! idx�ڸ��� value���� ����ٰ���
                arr[idx] = value;
                break;
            }
            index -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

	}

}
