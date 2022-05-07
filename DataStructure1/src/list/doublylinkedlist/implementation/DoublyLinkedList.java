package list.doublylinkedlist.implementation;


public class DoublyLinkedList {
	private Node head;
    private Node tail;
    private int size = 0;
 
    private class Node {   // �����Ͱ� ���� �� �ʵ�
        private Object data;  
        // ���� ��带 ����Ű�� �ʵ�
        private Node next;
        private Node prev;
 
        public Node(Object input) {
            this.data = input;
            this.next = null;
            this.prev = null;
        }
 
        // ����� ������ ���� ����ؼ� Ȯ���غ� �� �ְ� ��
        public String toString() {
            return String.valueOf(this.data);
        }
    }
 
    public void addFirst(Object input) {
        Node newNode = new Node(input);  // ��带 ����
        newNode.next = head;      // ���ο� ����� ���� ���� ��带 ����
        // ������ ��尡 �־��ٸ� ���� ����� ���� ���� ���ο� ��带 ����
        if (head != null)
            head.prev = newNode;
        head = newNode;    // ���� ���ο� ��带 ����
        size++;
        if (head.next == null) {
            tail = head;
        }
    }
 
    public void addLast(Object input) {
        Node newNode = new Node(input);  // ��带 ����
        // ����Ʈ�� ��尡 ���ٸ� ù��° ��带 �߰��ϴ� �޼ҵ带 ���
        if (size == 0) {
            addFirst(input);
        } else {
            
            tail.next = newNode;  // tail�� ���� ���� ����
            newNode.prev = tail;  // ���ο� ����� ���� ���� tail�� ����
            tail = newNode;    // ������ ��带 ���Ž�Ŵ
            size++;     // ������ 1 ���� ��Ŵ
        }
    }
 
    Node node(int index) {
        
        if (index < size / 2) { // ����� �ε����� ��ü ��� ���� �ݺ��� ū�� ������ ���
            
            Node x = head;   // head���� next�� �̿��� �ε����� �ش��ϴ� ��带 ã��
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            
            Node x = tail;  // tail���� prev�� �̿��� �ε����� �ش��ϴ� ��带 ã��
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
 
    public void add(int k, Object input) {
        // ���� k�� 0�̶�� ù��° ��忡 �߰��ϴ� ���̱� ������ addFirst�� ���
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k - 1);
            Node temp2 = temp1.next; // k ��° ��带 temp2�� ����
            Node newNode = new Node(input); 
            temp1.next = newNode; // temp1�� ���� ���� ���ο� ��带 ����
            newNode.next = temp2; // ���ο� ����� ���� ���� temp2�� ����
            if (temp2 != null)
                temp2.prev = newNode; // temp2�� ���� ���� ���ο� ��带 ����
            newNode.prev = temp1; // ���ο� ����� ���� ���� temp1�� ����
            size++;
            
            if (newNode.next == null) {
                tail = newNode; // ���ο� ����� ���� ��尡 ���ٸ� ���ο� ��尡 ������ ����̱� ������ tail�� ����
            }
        }
    }
 
    public String toString() {
        // ��尡 ���ٸ� []�� ����
        if (head == null) {
            return "[]";
        }
        
        Node temp = head; // Ž���� ����
        String str = "[";
        // ���� ��尡 ���� ������ �ݺ����� ����
        // ������ ���� ���� ��尡 ���� ������ �Ʒ��� ������ ������ ���� ����
        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }
        // ������ ��带 ��°���� ����
        str += temp.data;
        return str + "]";
    }
 
    public Object removeFirst() {
        // ù��° ��带 temp�� �����ϰ� head�� ���� �ι�° ���� ����
        Node temp = head;
        head = temp.next;
        // �����͸� �����ϱ� ���� ������ ���� �ӽ� ������ ��Ƶ�
        Object returnData = temp.data;
        temp = null;
        // ����Ʈ ���� ��尡 �ִٸ� head�� ���� ��带 null�� ����
        if (head != null)
            head.prev = null;
        size--;
        return returnData;
    }
 
    public Object remove(int k) {
        if (k == 0)
            return removeFirst();
        
        Node temp = node(k - 1); // k-1��° ��带 temp�� ����
        
        Node todoDeleted = temp.next; // temp.next�� �����ϱ� ���� todoDeleted ������ ����
        
        temp.next = temp.next.next; // ���� ��� ��带 ���ῡ�� �и�
        if (temp.next != null) {
            
            temp.next.prev = temp; // ������ ����� ���� ��带 ����
        }
        
        Object returnData = todoDeleted.data; // ������ ����� �����͸� �����ϱ� ���ؼ� returnData�� �����͸� ����
        // ������ ��尡 tail�̾��ٸ� tail�� ���� ��带 tail�� ����
        if (todoDeleted == tail) {
            tail = temp;
        }
        // cur.next�� ����
        todoDeleted = null;
        size--;
        return returnData;
    }
 
    public Object removeLast() {
        return remove(size - 1);
    }
 
    public int size() {
        return size;
    }
 
    public Object get(int k) {
        Node temp = node(k);
        return temp.data;
    }
 
    public int indexOf(Object data) {
        
        Node temp = head; // Ž�� ����� �Ǵ� ��带 temp�� ����
        
        int index = 0; // Ž�� ����� ���° ������Ʈ�� �ִ����� �ǹ��ϴ� ������ index�� ���
        // Ž�� ���� Ž�� ����� ���� ��
        while (temp.data != data) {
            temp = temp.next;
            index++;
             
            if (temp == null) // temp�� ���� null�̶�� ���� �� �̻� Ž�� ����� ���ٴ� ���� �ǹ�
                return -1;  //�� �� -1�� ����
        }
        
        return index; // Ž�� ����� ã�Ҵٸ� ����� �ε��� ���� ����
    }
    

}
	

