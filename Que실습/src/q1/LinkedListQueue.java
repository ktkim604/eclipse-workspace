package q1;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedListQueue<E> {
	private Node<E> front, rear;
	private int size;
	
	public LinkedListQueue() {
		front = rear = null;  
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {  
		return size() == 0;
	}
	public boolean isFull() {   
		return !(size == 0);
	}
	public void add(E newItem) {
		Node newNode = new Node(newItem, null);
		if(isEmpty()) {
			front = newNode;
		}
		else {
			rear.setNext(newNode);
		}
		rear = newNode;
		rear.setNext(front);
		size++;
	}
	public E remove() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		E frontItem = front.getItem();
		front = front.getNext();
		rear.setNext(front);
		if(isEmpty()) {
			rear = null;
		}
		size--;
		return frontItem;
	}
	public E peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return front.getItem();
	}
	public E tail() {
		return rear.getItem();
	}
	public E tailNext() {
		return (rear.getNext()).getItem();
	}

}
