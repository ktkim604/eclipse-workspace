package quick;

public class DLinkedList<E> {
	private Node<E> top;
	private Node<E> rear;
	private int size;
	
	public DLinkedList() {
		top = null;
		rear = null;
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void addFirst(E value) {
		Node<E> newNode = new Node<E>(value);
		newNode.setNext(top);
		
		if(top != null) {
			top.setPrev(newNode);
		}
		top = newNode;
		size++;
		
		if(top.getNext() == null) {
			rear = top;
		}
	}
	public void addLast(E value) {
		Node<E> newNode = new Node<E>(value);
		
		if(isEmpty()) {
			addFirst(value);
		}
		
		rear.setNext(newNode);
		newNode.setPrev(rear);
		rear = newNode;
		size++;
	}
	public Node<E> search(int index){
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if(index > size / 2) {
			Node<E> x = rear;
			for(int i = size - 1; i > index; i--) {
				x = x.getPrev();
			}
			return x;
		}
		else {
			Node<E> x = top;
			for(int i = 0; i < index; i++) {
				x = x.getNext();
			}
			return x;
		}
	}
	

}
