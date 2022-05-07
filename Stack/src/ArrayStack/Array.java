package ArrayStack;

import java.util.Scanner;

public class Array<E> {
	private int top;  // ������ top �׸��� �迭 ���� �ε���
 	private E[] arr;  // ������ ���� �迭
	public Array() {  // ���� ������
		top = -1;
		arr = (E[]) new Object[1];  //���⿡ ũ�Ⱑ1�� �迭 ����
	}
	//������ empty�̸� true ����
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
	public void push(E newValue) {  // �� Value�� ���ÿ� ����
		if(getSize() == arr.length) {
			reSize(arr.length * 2);   // overflow �߻��ϸ� ������ 2���� ũ��� Ȯ��
		}
		arr[++top] = newValue;   // top�� 1 ������Ų �Ŀ� �� �׸��� s[top]�� ����
	}
	public E pop() {  // pop ����
		if(getSize() > 0 && getSize() < arr.length / 4) {
			reSize(arr.length / 2);  //������ 1/2 ũ��� ���
		}
		E element = arr[top];
		arr[top--] = null;    //null�� �ʱ�ȭ
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
			boolean check = Character.isDigit(input);  // ������ ��� üũ
			if(check) {
				System.out.print(input + " ");
			}
			else {    
				if(input == '(') {   // ���� ��ȣ�� ������ ���ÿ� ����
					as.push(input);
				}
				else if(input == ')') {   //���� ��ȣ�� ���� ���
					while(!as.empty() && as.top() != '(') {
						System.out.print(as.pop() + " ");
					}
					if(!as.empty()) {  // ������� ��� �� pop
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
