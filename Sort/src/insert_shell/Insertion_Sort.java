package insert_shell;

import java.util.Scanner;

public class Insertion_Sort {
  public static void main(String[] args) {
	 
	long start = System.currentTimeMillis();
    
	Insertion_Sort T = new Insertion_Sort();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
    for (int x : T.solution(n, arr)) System.out.print(x + " ");
    System.out.println("");
    
    long end = System.currentTimeMillis();
    System.out.println("����ð�: " + (end - start) + " ms");
  }

  // �ذ���
  // �⺻���� �������� �˰���
  // ù��° ���� ������ �Ǿ��ִٰ� ����
  // �ι�° ������ �������� ��, �۴ٸ� �ٲٰ� ũ�ٸ� ��ȯ -> 2��°���� ����
  // ����° ������ �������� ��ĭ�� ��, �۴ٸ� �ٲٰ� ũ�ٸ� ��ȯ -> 3��°���� ����
  // ���� ������ �ݺ��Ͽ� �迭 ��ü�� ���ĵǵ���
  public int[] solution(int n, int[] arr) {
    for (int i = 1; i < n; i++) {
      int tmp = arr[i], j; // tmp�� ���� �� ����, �� ������ ���� j �ۿ� ����
      for (j = i; j > 0; j--) {
        // �ٷ� ���� ���� ���Ͽ� �ٷ� ���� ���� �� ũ�ٸ� ���� ���� �ٲ��ְ�
        if (arr[j - 1] > tmp) arr[j] = arr[j - 1];
        // �ƴ϶�� �ݺ��� Ż��
        else break;
      }
      // �ݺ����� ������ ���� �� ��ġ�� ����
      arr[j] = tmp;
    }
    return arr;
  }
}
