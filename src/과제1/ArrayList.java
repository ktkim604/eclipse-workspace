package ����1;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayList<E> {
	private E s[];
	private int top;
	public ArrayList() {
		s = (E[]) new Object[1];
		top = -1;
	}
	public int size() {//�迭�� size�� Ȯ��
		return top + 1;
	}
	public boolean isEmpty() { //�迭�� ����ִ��� Ȯ��
		return top == -1;
	}
	public E peek() { //�� ���� ���Ұ��� ������
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return s[top];
	}
	public void push(E newItem) {//�迭 �� ���� ����
		if(size() == s.length) {//�迭�� �� �� ������ �迭�� ���̸� 2��� �ø�
			resize(2*s.length);
		}
		s[++top] = newItem; //�迭 ������ ������ ���� ����
	}
	public E pop() { //�ǳ� ���� ����
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		E item = s[top];
		s[top--] = null;
		if(size() > 0 && size() == s.length/4) {
			resize(s.length/2);
		}
		return item;
	}
	public void resize(int newSize) {//�迭�� ���� Ȯ��,��Ҹ� ����ϴ� ���
		Object[] t = new Object[newSize];
		for(int i = 0; i < size(); i++) {
			t[i] = s[i];
		}
		s=(E[])t;
	}
	public E get(int k) {//�ش� �ε���k�� ���� ���
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return s[k];
	}
	public void index_push(int k, E n) {//�迭 �߰��� �� ����
		if(size() == s.length) {//�迭�� �� �� ������ �迭�� ���̸� 2��� �ø�
			resize(2*s.length);
		}
		for(int i = top; i >= k; i--) {
			s[i+1]=s[i];
		}
		top++;
		s[k]=n;
		
	}
	public E index_pop(int k) {//�߰��� �ִ� �� index��ȣ�� �̿��� ����
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		E remove_item = s[k]; //������ index�� ���� remove_item�� ����
		for(int i = k+1; i <= top; i++) {//������ �ε��� �ڿ��ִ� ������ ��ĭ�� ������ ����
			s[i-1] = s[i];
		}
		s[top--]=null; //for������ ������ ��ĭ�� ������ ������ �迭�� ���� null�� ������ ���̸� 1 ���δ�
		
		if(size() > 0 && size() == s.length/4) {
			resize(s.length/2);
		}
		return remove_item; //������ ���� ������
		
		
		
	}
	
	
	
}
