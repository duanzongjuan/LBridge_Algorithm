/*
 *���÷�  �ҹ��ż�����ͼ����� 
 *2 9 4
 *7 5 3
 *6 1 8 ����һ�����׻÷���ÿ��ÿ���Լ��Խ����ϵ�������Ӷ���ȡ����濼��һ���෴�����⡣�ɲ������� 1~9 ����������Ź���ʹ�ã�ÿ��ÿ��ÿ���Խ����ϵ����ֺͶ���������أ���Ӧ����������
 *���磺9 1 2
 *    8 4 3
 *    7 5 6
 *����������������е����׷��÷�����ͳ�Ƴ�һ���ж����֡���ת������ͬһ�֡����磺
 *9 1 2
 *8 4 3
 *7 5 6
 *
 *7 8 9
 *5 4 1
 *6 3 2
 *
 *2 1 9
 *3 4 8
 *6 5 7 �ȶ�����ͬһ�������
 */
package final_7;

public class Test_2 {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char[] a="123456789".toCharArray();
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		f(a, 0);
		System.out.println(count / 2 / 4);
	}

	public static void f(int[] a, int k) {
		if (k >= a.length) {
			if (check(a)) {
				count++;
			}
		}
		for (int i = k; i < a.length; i++) {
			// ��̽
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
			f(a, k + 1);
			// ����
			{
				int temp = a[k];
				a[k] = a[i];
				a[i] = temp;
			}
		}
	}

	//�����������
	public static boolean check(int[] a) {
		if (a[0] + a[1] + a[2] != a[3] + a[4] + a[5] && a[0] + a[1] + a[2] != a[6] + a[7] + a[8]
				&& a[0] + a[1] + a[2] != a[0] + a[3] + a[6] && a[0] + a[1] + a[2] != a[1] + a[4] + a[7]
				&& a[0] + a[1] + a[2] != a[2] + a[5] + a[8] && a[0] + a[1] + a[2] != a[2] + a[4] + a[6]
				&& a[0] + a[1] + a[2] != a[0] + a[4] + a[8] && a[3] + a[4] + a[5] != a[6] + a[7] + a[8]
				&& a[3] + a[4] + a[5] != a[0] + a[3] + a[6] && a[3] + a[4] + a[5] != a[1] + a[4] + a[7]
				&& a[3] + a[4] + a[5] != a[2] + a[5] + a[8] && a[3] + a[4] + a[5] != a[2] + a[4] + a[6]
				&& a[3] + a[4] + a[5] != a[0] + a[4] + a[8] && a[6] + a[7] + a[8] != a[0] + a[3] + a[6]
				&& a[6] + a[7] + a[8] != a[1] + a[4] + a[7] && a[6] + a[7] + a[8] != a[2] + a[5] + a[8]
				&& a[6] + a[7] + a[8] != a[2] + a[4] + a[6] && a[6] + a[7] + a[8] != a[0] + a[4] + a[8]
				&& a[0] + a[3] + a[6] != a[1] + a[4] + a[7] && a[0] + a[3] + a[6] != a[2] + a[5] + a[8]
				&& a[0] + a[3] + a[6] != a[0] + a[4] + a[8] && a[0] + a[3] + a[6] != a[2] + a[4] + a[6]
				&& a[1] + a[4] + a[7] != a[2] + a[5] + a[8] && a[1] + a[4] + a[7] != a[0] + a[4] + a[8]
				&& a[1] + a[4] + a[7] != a[2] + a[4] + a[6] && a[2] + a[5] + a[8] != a[0] + a[4] + a[8]
				&& a[2] + a[5] + a[8] != a[2] + a[4] + a[6] && a[0] + a[4] + a[8] != a[2] + a[4] + a[6]) {
			return true;
		}
		return false;
	}
}