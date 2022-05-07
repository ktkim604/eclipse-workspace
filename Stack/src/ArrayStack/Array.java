package ArrayStack;

import java.util.Scanner;

public class Array<E> {
	private int top;  // 스택의 top 항목의 배열 원소 인덱스
 	private E[] arr;  // 스택을 위한 배열
	public Array() {  // 스택 생성자
		top = -1;
		arr = (E[]) new Object[1];  //조기에 크기가1인 배열 생성
	}
	//스택이 empty이면 true 리턴
	public boolean empty() {
		return top == -1;     
	}
	public int getSize() {
		return top + 1;
	}
	public E top() {
		return arr[top];
	}
	public void reSize(int newSize) {
		Object[] a = new Object [newSize];
		for(int i = 0; i < arr.length; i++) {
			a[i] = arr[i];
		}
		arr = (E[])a;
	}
	public void push(E newValue) {  // 새 Value을 스택에 삽입
		if(getSize() == arr.length) {
			reSize(arr.length * 2);   // overflow 발생하면 스택을 2배의 크기로 확장
		}
		arr[++top] = newValue;   // top을 1 증가시킨 후에 새 항목을 s[top]에 저장
	}
	public E pop() {  // pop 연산
		if(getSize() > 0 && getSize() < arr.length / 4) {
			reSize(arr.length / 2);  //스택을 1/2 크기로 축소
		}
		E element = arr[top];
		arr[top--] = null;    //null로 초기화
		return element;
	}
	public String toString() {
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}
	public static void main(String[] args) {
		Array <Character> as = new Array<>();
		Scanner sc = new Scanner(System.in);
		String inputs = sc.next();
		
		for(int i = 0; i < inputs.length(); i++) {
			char input = inputs.charAt(i);
			boolean check = Character.isDigit(input);  // 숫자인 경우 체크
			if(check) {
				System.out.print(input + " ");
			}
			else {    
				if(input == '(') {   // 여는 괄호가 나오면 스택에 저장
					as.push(input);
				}
				else if(input == ')') {   //닫힌 괄호가 나올 경우
					while(!as.empty() && as.top() != '(') {
						System.out.print(as.pop() + " ");
					}
					if(!as.empty()) {  // 비어있을 경우 값 pop
						as.pop();
					}
				}
				else {
					if(input == '+' || input == '-') {
						while(!as.empty() && (as.top() == '*' || as.top() == '/')) {
							System.out.print(as.pop() + " ");
						}
					}
					as.push(input);
				}
			}
		}
		
		while(!as.empty()) {
			System.out.print(as.pop() + " ");
		}
		
		sc.close();
	}
	

}
