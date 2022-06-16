package hash;

public class DoubleHashing {
private int hTableSize;
private Entry[] hTable;

public DoubleHashing(int val)
{
   hTableSize = val;
   hTable = new Entry[hTableSize];    // ���� ��ȣ�� 0~10
}

public int hFunc1(int key)
{
   return key % hTableSize;
}

public int hFunc2(int key)
{
   int f2val = 7;
   return f2val - (key % f2val);
}

public int getKey(int data)
{
   return data;
}

public Entry getEntry(int val)
{
   return hTable[val];
}

public int insert(int data)
{
   int key, hVal;
   int point;
   Entry entry;

   key = getKey(data);
   hVal = hFunc1(key);
   
   entry = new Entry();
   entry.setValue(data);

   point = hVal;
   for(int i=0; i<hTableSize; i++)    
   // ���̺��� ��� ���� �˻��ϸ� ����
   {
       if(hTable[point] == null)
       {
           hTable[point] = entry;
           System.out.print(data + " ���� ����\t");
           return 0;
       }

       else if(hTable[point].getValue() == '*')
       {
           hTable[point] = entry;
           System.out.print(data + " ���� ����\t");
           return 0;
       }
       else
           point += hFunc2(key); // Ž�� ����

       if (point > hTableSize-1)
           point = point - hTableSize;  // �ؽ� ���̺��� ó������
   }
   System.out.print(data + " ���� ����\t");
   return -1;
}

public int search(int data, int forDel)    
{    // delete �޼ҵ带 ���� �ڷḦ �������� ����
   int key, hVal;
   int point;

   key = getKey(data);
   hVal = hFunc1(key);

   point = hVal;
   for(int i=0; i<hTableSize; i++)    
   // ���̺��� ��� ���� �˻��ϸ� ����
   {
       if(hTable[point] == null)
           return -1;    // ���� ����
       else if(hTable[point].getValue() == data)    
       // ���ϴ� �ڷḦ ã��
           return point;    // ã�� �ڷ��� ���� ��ġ�� ��ȯ
       else
           point += hFunc2(key);    // ���� ���� �˻��ϱ� ���� ��ġ �ű�

       if (point > hTableSize-1)    
       // �ؽ� ���̺��� �������� ������ ó������ �ڸ� �ű�
           point = point - hTableSize;
   }

   System.out.println("Ž�� ����");
   return -1;
}

public int search(int data)    
{    // ����ڰ� Ž���� ���� ���� ã�� �ڷḦ ������
   int key, hVal;
   int point;

   key = getKey(data);
   hVal = hFunc1(key);
   point = hVal;
   for(int i=0; i<hTableSize; i++)    
   // ���̺��� ��� ���� �˻��ϸ� ����
   {
       if(hTable[point] == null)
       {    // ���� ����
           System.out.print(data + " Ž�� ����\n");
           return -1;
       }
       else if(hTable[point].getValue() == data)
       {    // ���ϴ� �ڷḦ ã��
           System.out.print(data + " Ž�� ����\n");
           return point;
       }
       else
           point += hFunc2(key);    // ���� ���� �˻��ϱ� ���� ��ġ �ű�

       if (point > hTableSize-1)
           point = point - hTableSize;    
           // �ؽ� ���̺��� �������� ������ ó������ �ڸ� �ű�
   }

   System.out.println("Ž�� ����");
   return -1;
}

public int delete(int data)
{
   int key, hVal;
   int find;
   Entry entry;

   key = getKey(data);
   hVal = hFunc1(key);

   if((find = search(data, 1)) == -1)
   {
       System.out.print(data + " �ڷᰡ �������� �ʽ��ϴ�.\t");
       return -1;
   }
   else
   {
       entry = hTable[find];
       entry.setValue('*');
       System.out.print(data + " ���� ����\t");
       return 0;
   }
}

public void showHashTable()
{
   for(int i=0;i<hTableSize;i++)
       if((hTable[i] == null))
           System.out.print("_ ");
       else if(hTable[i].getValue() == '*')
       {
           System.out.print("* ");
       }
       else
           System.out.print(hTable[i].getValue() + " ");
   System.out.println();
}

public static void main(String[] args) {
   System.out.println("This is Double Hashing");
   
   DoubleHashing dh = new DoubleHashing(11);
   
   dh.insert(12);
   dh.showHashTable();
   dh.insert(13);
   dh.showHashTable();
   dh.insert(4);
   dh.showHashTable();
   dh.insert(28);
   dh.showHashTable();
   dh.insert(7);    
   dh.showHashTable();
   dh.insert(23);    
   dh.showHashTable();
   dh.insert(34);    
   dh.showHashTable();
   dh.insert(45);     
   dh.showHashTable();
   dh.search(45);
   dh.delete(45);
   dh.showHashTable();
   dh.search(45);
}
}
