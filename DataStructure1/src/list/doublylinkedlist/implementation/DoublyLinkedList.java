package list.doublylinkedlist.implementation;


public class DoublyLinkedList {
	private Node head;
    private Node tail;
    private int size = 0;
 
    private class Node {   // 데이터가 저장 될 필드
        private Object data;  
        // 다음 노드를 가리키는 필드
        private Node next;
        private Node prev;
 
        public Node(Object input) {
            this.data = input;
            this.next = null;
            this.prev = null;
        }
 
        // 노드의 내용을 쉽게 출력해서 확인해볼 수 있게 함
        public String toString() {
            return String.valueOf(this.data);
        }
    }
 
    public void addFirst(Object input) {
        Node newNode = new Node(input);  // 노드를 생성
        newNode.next = head;      // 새로운 노드의 다음 노드로 헤드를 지정
        // 기존에 노드가 있었다면 현재 헤드의 이전 노드로 새로운 노드를 지정
        if (head != null)
            head.prev = newNode;
        head = newNode;    // 헤드로 새로운 노드를 지정
        size++;
        if (head.next == null) {
            tail = head;
        }
    }
 
    public void addLast(Object input) {
        Node newNode = new Node(input);  // 노드를 생성
        // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용
        if (size == 0) {
            addFirst(input);
        } else {
            
            tail.next = newNode;  // tail의 다음 노드로 생성
            newNode.prev = tail;  // 새로운 노드의 이전 노드로 tail을 지정
            tail = newNode;    // 마지막 노드를 갱신시킴
            size++;     // 개수를 1 증가 시킴
        }
    }
 
    Node node(int index) {
        
        if (index < size / 2) { // 노드의 인덱스가 전체 노드 수의 반보다 큰지 작은지 계산
            
            Node x = head;   // head부터 next를 이용해 인덱스에 해당하는 노드를 찾음
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            
            Node x = tail;  // tail부터 prev를 이용해 인덱스에 해당하는 노드를 찾음
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
 
    public void add(int k, Object input) {
        // 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k - 1);
            Node temp2 = temp1.next; // k 번째 노드를 temp2로 지정
            Node newNode = new Node(input); 
            temp1.next = newNode; // temp1의 다음 노드로 새로운 노드를 지정
            newNode.next = temp2; // 새로운 노드의 다음 노드로 temp2를 지정
            if (temp2 != null)
                temp2.prev = newNode; // temp2의 이전 노드로 새로운 노드를 지정
            newNode.prev = temp1; // 새로운 노드의 이전 노드로 temp1을 지정
            size++;
            
            if (newNode.next == null) {
                tail = newNode; // 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정
            }
        }
    }
 
    public String toString() {
        // 노드가 없다면 []를 리턴
        if (head == null) {
            return "[]";
        }
        
        Node temp = head; // 탐색을 시작
        String str = "[";
        // 다음 노드가 없을 때까지 반복문을 실행
        // 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외
        while (temp.next != null) {
            str += temp.data + ",";
            temp = temp.next;
        }
        // 마지막 노드를 출력결과에 포함
        str += temp.data;
        return str + "]";
    }
 
    public Object removeFirst() {
        // 첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경
        Node temp = head;
        head = temp.next;
        // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담아둠
        Object returnData = temp.data;
        temp = null;
        // 리스트 내에 노드가 있다면 head의 이전 노드를 null로 지정
        if (head != null)
            head.prev = null;
        size--;
        return returnData;
    }
 
    public Object remove(int k) {
        if (k == 0)
            return removeFirst();
        
        Node temp = node(k - 1); // k-1번째 노드를 temp로 지정
        
        Node todoDeleted = temp.next; // temp.next를 삭제하기 전에 todoDeleted 변수에 보관
        
        temp.next = temp.next.next; // 삭제 대상 노드를 연결에서 분리
        if (temp.next != null) {
            
            temp.next.prev = temp; // 삭제할 노드의 전후 노드를 연결
        }
        
        Object returnData = todoDeleted.data; // 삭제된 노드의 데이터를 리턴하기 위해서 returnData에 데이터를 저장
        // 삭제된 노드가 tail이었다면 tail을 이전 노드를 tail로 지정
        if (todoDeleted == tail) {
            tail = temp;
        }
        // cur.next를 삭제
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
        
        Node temp = head; // 탐색 대상이 되는 노드를 temp로 지정
        
        int index = 0; // 탐색 대상이 몇번째 엘리먼트에 있는지를 의미하는 변수로 index를 사용
        // 탐색 값과 탐색 대상의 값을 비교
        while (temp.data != data) {
            temp = temp.next;
            index++;
             
            if (temp == null) // temp의 값이 null이라는 것은 더 이상 탐색 대상이 없다는 것을 의미
                return -1;  //이 때 -1을 리턴
        }
        
        return index; // 탐색 대상을 찾았다면 대상의 인덱스 값을 리턴
    }
    

}
	

