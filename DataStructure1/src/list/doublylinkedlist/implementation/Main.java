package list.doublylinkedlist.implementation;


public class Main {
	public static DoublyLinkedList numbers = new DoublyLinkedList();

	public static void main(String[] args) {
		numbers.addLast("��ȣ�� 122");
		numbers.addLast("�̽±� 123");
		numbers.addLast("���� 124");
		numbers.addLast("���� 124");
		
		print();
	}
	public static void print() {
		for(int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i) == numbers.get(i+1)) {
				numbers.remove(i-1);
			}
			System.out.println(numbers.get(i));
		}
	}

}
