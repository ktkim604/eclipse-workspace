package hash;

public class DoubleHashing {
private int hTableSize;
private Entry[] hTable;

public DoubleHashing(int val)
{
   hTableSize = val;
   hTable = new Entry[hTableSize];    // 셀의 번호는 0~10
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
   // 테이블의 모든 셀을 검색하면 정지
   {
       if(hTable[point] == null)
       {
           hTable[point] = entry;
           System.out.print(data + " 삽입 성공\t");
           return 0;
       }

       else if(hTable[point].getValue() == '*')
       {
           hTable[point] = entry;
           System.out.print(data + " 삽입 성공\t");
           return 0;
       }
       else
           point += hFunc2(key); // 탐색 단위

       if (point > hTableSize-1)
           point = point - hTableSize;  // 해시 테이블의 처음으로
   }
   System.out.print(data + " 삽입 실패\t");
   return -1;
}

public int search(int data, int forDel)    
{    // delete 메소드를 위해 자료를 보여주지 않음
   int key, hVal;
   int point;

   key = getKey(data);
   hVal = hFunc1(key);

   point = hVal;
   for(int i=0; i<hTableSize; i++)    
   // 테이블의 모든 셀을 검색하면 정지
   {
       if(hTable[point] == null)
           return -1;    // 빈셀을 만남
       else if(hTable[point].getValue() == data)    
       // 원하는 자료를 찾음
           return point;    // 찾은 자료의 셀의 위치를 반환
       else
           point += hFunc2(key);    // 다음 셀을 검색하기 위해 위치 옮김

       if (point > hTableSize-1)    
       // 해시 테이블의 마지막을 만나면 처음으로 자리 옮김
           point = point - hTableSize;
   }

   System.out.println("탐색 실패");
   return -1;
}

public int search(int data)    
{    // 사용자가 탐색할 때를 위해 찾은 자료를 보여줌
   int key, hVal;
   int point;

   key = getKey(data);
   hVal = hFunc1(key);
   point = hVal;
   for(int i=0; i<hTableSize; i++)    
   // 테이블의 모든 셀을 검색하면 정지
   {
       if(hTable[point] == null)
       {    // 빈셀을 만남
           System.out.print(data + " 탐색 실패\n");
           return -1;
       }
       else if(hTable[point].getValue() == data)
       {    // 원하는 자료를 찾음
           System.out.print(data + " 탐색 성공\n");
           return point;
       }
       else
           point += hFunc2(key);    // 다음 셀을 검색하기 위해 위치 옮김

       if (point > hTableSize-1)
           point = point - hTableSize;    
           // 해시 테이블의 마지막을 만나면 처음으로 자리 옮김
   }

   System.out.println("탐색 실패");
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
       System.out.print(data + " 자료가 존재하지 않습니다.\t");
       return -1;
   }
   else
   {
       entry = hTable[find];
       entry.setValue('*');
       System.out.print(data + " 삭제 성공\t");
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
