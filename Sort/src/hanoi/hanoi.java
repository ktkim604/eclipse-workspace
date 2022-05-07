package hanoi;

public class hanoi {
	
	public static void hanoi(int i, char a, char b, char c) {  // A���, B���, C���, i���� ���Ǳ����� �� �Ʒ� ���ǰ� ������ i-1���� ���ݹ���
		if(i == 1) {     //�̵��� ������ ���� 1�����
			System.out.println("����" + i + "��" + a + "����" + c + "�� �ű�");
		}
		else {
			hanoi(i-1,a,c,b);     // ���A���� �� �Ʒ� ������ ������ ������ ��� ������ ���C�� �̿��Ͽ� ���B�� �ű�
			System.out.println("����" + i + "��" + a + "����" + c + "�� �ű�");  // ���A���� ���� 1���� ������ ���C�� �ű�
			hanoi(i-1,b,a,c);     // ���B���� �� �Ʒ� ������ ������ ������ ��� ������ ���A�� �̿��Ͽ� ���C�� �ű�
		}
	}

}
