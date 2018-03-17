/*AA223344， 一共4对扑克牌。请你把它们排成一行。要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。 4A3A2432 2342A3A4
 *请填写出所有符合要求的排列中，字典序最小的那个。   例如：22AA3344 比 A2A23344 字典序小。当然，它们都不是满足要求的答案。
 *@author juanjuan
 *@version 2018-3-17
 */

//全排列
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
