/*���������ʽ�� ���� x ���� = ���� x ������ ����ʾ��������λ����˵���һ����λ������һ����λ���� ���û���޶����������������Ӻܶࡣ ��Ŀǰ���޶��ǣ���9�����飬��ʾ1~9��9�����֣�������0�� 
 *����ʽ��1��9��ÿ�����ֳ�����ֻ����һ�Σ� ���磺 
 *46 x 79 = 23 x 158 
 *54 x 69 = 27 x 138 
 *54 x 93 = 27 x 186 
 *.....  
 *���̣�������п��ܵ������ 
 *ע�⣺ 
 *��ߵ���������������ͬһ��������Ҫ�ظ������ 
 *��ͬ���������˳����Ҫ  
 *@author juanjuan 
 *@version 2018-3-19
 */
package java_129;

import java.util.HashSet;
import java.util.Set;

public class Test_1 {
	static Set<Integer> set = new HashSet<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		f(a, 0);
	}

	public static void f(int[] a, int k) {
		if (k == a.length) {
			int a1 = 10 * a[0] + a[1];
			int a2 = 10 * a[2] + a[3];
			int a3 = 10 * a[4] + a[5];
			int a4 = 100 * a[6] + 10 * a[7] + a[8];
			if (a1 * a2 == a3 * a4) {
				if (!set.contains(a1 * a2)) {
					set.add(a1 * a2);
					System.out.println(a1 + "*" + a2 + "=" + a3 + "*" + a4);
				}
			}
		}
		for (int i = k; i < a.length; i++) {
			//��̽
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
			
			f(a, k + 1);
			
			//����
			temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
	}
}
