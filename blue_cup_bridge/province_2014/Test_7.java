/*AA223344�� һ��4���˿��ơ�����������ų�һ�С�Ҫ������A�м���1���ƣ�����2֮����2���ƣ�����3֮����3���ƣ�����4֮����4���ơ� 4A3A2432 2342A3A4
 *����д�����з���Ҫ��������У��ֵ�����С���Ǹ���   ���磺22AA3344 �� A2A23344 �ֵ���С����Ȼ�����Ƕ���������Ҫ��Ĵ𰸡�
 *@author juanjuan
 *@version 2018-3-17
 */

//ȫ����
package province_2014;

public class Test_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = "AA223344".toCharArray();
		f(c, 0);
	}

	public static void f(char[] c, int k) {
		if (k == c.length) {
			if (judge(c)) {
				show(c);
			}
		}

		for (int i = k; i < c.length; i++) {
			{
				char temp = c[k];
				c[k] = c[i];
				c[i] = temp;
			}
			f(c, k + 1);
			{
				char temp = c[k];
				c[k] = c[i];
				c[i] = temp;
			}
		}
	}

	public static boolean judge(char[] c) {
		boolean[] b = new boolean[5];
		int size_A = 0, size_2 = 0, size_3 = 0, size_4 = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'A') {
				size_A++;
				if (i + 2 < c.length && c[i] == c[i + 2]) {
					b[0] = true;
				}
			}
			if (c[i] == '2') {
				size_2++;
				if (i + 3 < c.length && c[i] == c[i + 3]) {
					b[1] = true;
				}
			}
			if (c[i] == '3') {
				size_3++;
				if (i + 4 < c.length && c[i] == c[i + 4]) {
					b[2] = true;
				}
			}
			if (c[i] == '4') {
				size_4++;
				if (i + 5 < c.length && c[i] == c[i + 5]) {
					b[3] = true;
				}
			}
		}
		if (size_A == 2 && size_2 == 2 && size_3 == 2 && size_4 == 2) {
			b[4] = true;
		}
		return b[0] && b[1] && b[2] && b[3] && b[4];
	}

	public static void show(char[] c) {
		for (int i = 0; i < c.length; i++) {
				System.out.print(c[i]);
		}
		System.out.println();
	}
}
