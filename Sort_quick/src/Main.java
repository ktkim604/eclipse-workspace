

public class Main {
	private static void quickSort(int[] arr) {
		quickSort (arr, 0, arr.length -1);
	}
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 -1) {
			quickSort(arr, start, part2 -1);  // �ǹ����� ���� �κ� ���ȣ��
		}
		if(part2 < end) {
			quickSort(arr, part2, end);    // �ǹ����� ū �κ��� ���ȣ��
		}
	}
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];     //�߰������� �ǹ� ����
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if (start <= end) {
				swap(arr, start, end);  //�ǹ��� ��ȯ
				start++;
				end--;
			}
			
		}
		return start;
	}
	private static void swap(int[] arr, int start, int end) {  //��ȯ
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
	private static void printArray(int[] arr) {
		for(int data : arr) {
			System.out.print(data + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {69, 10, 30, 2, 16, 8, 31, 22};
		printArray(arr);
		quickSort(arr);
		printArray(arr);
	
	}
}
