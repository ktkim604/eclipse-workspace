package quick;

public class Node<E> {
	private E item;
	private Node<E> next;
	private Node<E> prev;
	
	public Node(E newItem) {
		item = newItem;
		this.setNext(next);
		this.setPrev(prev);
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}
	

}
