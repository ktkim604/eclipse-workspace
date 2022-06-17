package two_way_chaining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class ChainHash { //chaining Ŭ����
    class Node {
        private int key;
        private int value;
        private Node next;

        public Node(int key, int value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        int getKey() {
            return key;
        }
        int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }

    private int size = 13;       //  �ؽ� ���̺� ������
    private Node[] table;   //  �ؽ� ���̺�

    public ChainHash() {
        table = new Node[size];
        this.size = size;
    }


    public int hashValue(int key) { //�ؽ� �� ���ϴ� �Լ� h(x) = x % 13
        int hashcode = key;
        return hashcode % size;
    }
    public int hashValue2(int key) { //�ι� ° �ؽ� �� ���ϴ� �Լ� g(x) = 7- x % 7
        int hashcode = key;
        return 7-hashcode %7 ;
    }



    public int search(int key) { // key�� �̿��Ͽ� value �˻�
        int hash = hashValue(key);
        int hash2 = hashValue2(key);
        Node p = table[hash];

        while (p != null) {
            if (p.getKey() == key ) //������ �����ϰ� ����
                return p.getValue();
            p = p.next;
        } //������ �� ã�Ҵµ� ������ -1 ����
        p = table[hash2];
        while (p != null) {
            if (p.getKey() == key) //������ �����ϰ� ����
                return p.getValue();
            p = p.next;
        } //������ �� ã�Ҵµ� ������ -1 ����

        return -1;
    }


    public int count(int hash){ //�� hash�� �󸶳� ����ִ��� Ȯ���ϴ� �Լ�
        int cnt =0;
        Node p = table[hash];

        while (p != null) { //����ִٸ� �׳� 0 return ,�ƴ϶��
            p = p.next; //p�� �Ű� ���鼭 ī��Ʈ�� 1 �ø��� ���̻� ����Ű�� ��尡 ���°�� ����
            cnt++;
        }
        return cnt;
    }

    public void add(int key, int value) { //��� �߰��ϴ� ���
        if( search(key)!=-1) return; // �߰��ϱ� ���� Ž���ϰ� ����ֱ� //���� ��� -1�� ����ϹǷ� -1�� �ƴϸ� �����ϴϱ� �߰� x
        int hash = hashValue(key);  //h(x)�� ȣ���ϰ�
        int hash2 = hashValue2(key); //g(x)�� ȣ����

        if(count(hash)>count(hash2)) hash=hash2;  //count�Լ��� ���� �ؽ� ���̺� ���� �� ���� �� �����ؼ� hash���� ����.

        Node p = table[hash]; //hash ���� head�κ��� ����Ű�� ��带 p�� ����

        while (p != null) { //����Ű�� ��尡 ���� ��� �ݺ��� ���� �� �� ��� ����
            if (p.getKey()==(key)) { // ������ ���� �ִٸ� value ���� �����ϰ� ����ֱ�. �̹� ��쿣 Ű���� value���� ���� ������ �ʿ� x
                return; //���� �ְ� ���� �����Ƿ� �Լ� ����.
            }
            if(p.next ==null){  // p�� ����Ű�� ��尡 ������ �����
                Node tmp = new Node(key, value, null); //��带 �����ϰ�
                p.next = tmp; // ����Ű�� ����� ���� ��带 ���� ������ ���� ����
                return; //�̰�� ������ �Ϸ� �����Ƿ� ����
            }
            p = p.next; //�ƴϸ� ��� ���� ������, ��� Ž��
        }
        Node tmp = new Node(key, value, null);  //����ִ� ���,
        table[hash] = tmp; // �ٷ� ��忡�� ����
    }


    public void remove(int key) {  // �����ϴ� ���
        int hash = hashValue(key);
        Node p = table[hash];
        Node pp = null;     // �ٷ� �� ���

        while (p != null) {
            if (p.getKey()==(key)) {
                if (pp == null)
                    table[hash] = p.next;
                else
                    pp.next = p.next;
                return;
            }

            pp = p;
            p = p.next;
        }
    }


    public void print_all() { //��ü �ؽ� ���̺� ����ϴ� �Լ�
        for (int i = 0; i < size; i++) {  //�� �ؽ� ���̺��� �ؽ� Ű���� �ݺ��� ���� ���
            Node p = table[i];
            System.out.printf("%02d  ", i);  //�ؽ� Ű���� �����
            while (p != null) {  // ��ũ�� ����Ʈ ���
                System.out.printf("->  %d  ", p.getKey());
                p = p.next;
            }
            System.out.println();
        }
    }

    public void print_one(int key) { //key ���� ���� �ؽ����̺��� ���� ���
        int hash = hashValue(key);
        int hash2 = hashValue2(key);
        if(count(hash)>count(hash2)) hash=hash2;

        Node p = table[hash];
        System.out.printf("%02d  ", hash);
        while (p != null) {
            System.out.printf("->  %d  ", p.getKey());
            p = p.next;
        }
        System.out.println();
    }


    public static void main(String[] args) throws IOException {
        ChainHash ch = new ChainHash();  //ũ�Ⱑ 13�� �ؽ����̺� ����
        Random rand =new Random();
        int arr[] =new int[20];
        for(int i=0;i<20;i++){
            arr[i] = rand.nextInt(20);  //ũ�Ⱑ 20 ������ ���� ���� ����
            System.out.print(arr[i]+" "); //����ؼ� �����ְ�
            ch.add(arr[i],arr[i]); // �ؽ����̺� �߰� �̶� Ű���� value���� �����ϰ� ����.
        }
        System.out.println();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ch.print_all(); // ��ü ���̺� �����ֱ�
        int num;
        while(true){
            System.out.print("���� �Է��ϼ���: ");
            num = Integer.parseInt(br.readLine()); //���� �Է���
            int hash = ch.hashValue(num);  //h(x)�� ȣ���ؼ� hash ���� �ϳ� ���ѵ�
            int hash2 = ch.hashValue2(num); //g(x)�� ȣ���� ������ ���� ���ؼ�
            if(ch.count(hash)>ch.count(hash2)) hash=hash2; //�� ���� ���� ����ִ� ���� ã�� ��

            if(ch.count(hash)==0){ //���̺��� ����ִٸ� �߰��ϴ� ���
                ch.add(num,num);
                ch.print_all(); // ��ü ���̺� �����ֱ�
            }
            else break; //������� �ʴٸ� ���߰�
        }
        ch.print_one(num); //�ش� key���� �ش��ϴ� �ؽ� ���� �����ֱ�
        System.out.println();


    }

}
