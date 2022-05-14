

public class Main {
	private static void quickSort(int[] arr) {
		quickSort (arr, 0, arr.length -1);
	}
	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end);
		if(start < part2 -1) {
			quickSort(arr, start, part2 -1);  // 피벗보다 작은 부분 재귀호출
		}
		if(part2 < end) {
			quickSort(arr, part2, end);    // 피벗보다 큰 부분을 재귀호출
		}
	}
	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[(start + end) / 2];     //중간값으로 피벗 지정
		while(start <= end) {
			while(arr[start] < pivot) start++;
			while(arr[end] > pivot) end--;
			if (start <= end) {
				swap(arr, start, end);  //피벗과 교환
				start++;
				end--;
			}
			
		}
		return start;
	}
	private static void swap(int[] arr, int start, int end) {  //교환
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
