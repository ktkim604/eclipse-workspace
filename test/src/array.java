import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); //처음에 입력할 정수의 개수는?

        int arr[] = new int[size + 1]; // 한 칸씩 뒤로 밀기 때문에 1큰 배열 생성 -> 왜 한칸씩 밀어? -? 숫자를 사이에 삽입하면 크기가 1씩 커질테니까  1 2 사이에 5를 넣으면 1 5 2 가 되는 것처럼
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt(); //배열 정의
        }
//        System.out.println("배열 입력 끝");

        int idx  = sc.nextInt(); //인덱스접근용이다.,
        // int idx = sc.nextInt()-1;  x 번째라고 했을경우 ,
        int value = sc.nextInt(); // -> idx 인덱스에 value 숫자를 넣어주고 싶다 .

        //for 문에서 범위를 size로 두고 배열 입력 후 size++로 size를 증가시키는 방법도 있음

        int  index = size - 1; //인덱스로 배열의 마지막 값으로 접근하기 위해서는 size -1 로 접근해야하기때문에
        while (true) {

            if (index != idx) {  // 현재 index가 idx가 아니면 뒤로 밀어준다는 조건
                arr[index + 1] = arr[index];
            } else {
                arr[index + 1] = arr[index]; // 현재 Index가 idx이면 지금 숫자를 뒤로 밀어주고! idx자리에 value값을 담아줄거임
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
