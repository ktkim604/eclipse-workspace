package 과제1;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayList<E> {
	private E s[];
	private int top;
	public ArrayList() {
		s = (E[]) new Object[1];
		top = -1;
	}
	public int size() {//배열의 size를 확인
		return top + 1;
	}
	public boolean isEmpty() { //배열이 비어있는지 확인
		return top == -1;
	}
	public E peek() { //맨 끝의 원소값을 가져옴
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return s[top];
	}
	public void push(E newItem) {//배열 맨 끝에 삽입
		if(size() == s.length) {//배열이 꽉 차 있으면 배열의 길이를 2배로 늘림
			resize(2*s.length);
		}
		s[++top] = newItem; //배열 사이즈 증가후 원소 삽입
	}
	public E pop() { //맨끝 원소 삭제
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
	public void resize(int newSize) {//배열의 길이 확대,축소를 담당하는 기능
		Object[] t = new Object[newSize];
		for(int i = 0; i < size(); i++) {
			t[i] = s[i];
		}
		s=(E[])t;
	}
	public E get(int k) {//해당 인덱스k의 원소 출력
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return s[k];
	}
	public void index_push(int k, E n) {//배열 중간에 값 삽입
		if(size() == s.length) {//배열이 꽉 차 있으면 배열의 길이를 2배로 늘림
			resize(2*s.length);
		}
		for(int i = top; i >= k; i--) {
			s[i+1]=s[i];
		}
		top++;
		s[k]=n;
		
	}
	public E index_pop(int k) {//중간에 있는 값 index번호를 이용해 삭제
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		E remove_item = s[k]; //삭제될 index의 값을 remove_item에 저장
		for(int i = k+1; i <= top; i++) {//삭제될 인덱스 뒤에있는 값들을 한칸씩 앞으로 당긴다
			s[i-1] = s[i];
		}
		s[top--]=null; //for문으로 앞으로 한칸씩 당긴다음 마지막 배열의 값을 null로 저장후 길이를 1 줄인다
		
		if(size() > 0 && size() == s.length/4) {
			resize(s.length/2);
		}
		return remove_item; //삭제된 값을 리턴함
		
		
		
	}
	
	
	
}
