/*��ʾ�������У�����1~12�����֡�ʹ��ÿ��ֱ���ϵ�����֮�Ͷ���ͬ�� ͼ�У��Ѿ����������3�����֣���������Ǻ�λ��������������Ƕ��٣�
 *@author juanjuan
 *@version 2018-3-19
 */
package dfs;

public class Test_2_2 {
	static int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
	}

	public static void f(int k) {
		if (k == a.length) {
			if (a[0] == 1 && a[1] == 8 && a[11] == 3) {
				//sum�ĺ�Ϊ26,��Ϊÿ�ζ��������,(1+2+...+12)*2/6
				if (a[0] + a[2] + a[5] + a[7] == 26 && a[0] + a[3] + a[6] + a[10] == 26
						&& a[1] + a[5] + a[8] + a[11] == 26 && a[1] + a[2] + a[3] + a[4] == 26
						&& a[4] + a[6] + a[9] + a[11] == 26 && a[7] + a[8] + a[9] + a[10] == 26) {
					System.out.print(a[5]);
				}
			}
		}

		for (int i = k; i < a.length; i++) {
			//��̽
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;

			f(k + 1);

			//����
			temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
	}
}
