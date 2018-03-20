/*看下面的算式： □□ x □□ = □□ x □□□ 它表示：两个两位数相乘等于一个两位数乘以一个三位数。 如果没有限定条件，这样的例子很多。 但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。 
 *该算式中1至9的每个数字出现且只出现一次！ 比如： 
 *46 x 79 = 23 x 158 
 *54 x 69 = 27 x 138 
 *54 x 93 = 27 x 186 
 *.....  
 *请编程，输出所有可能的情况！ 
 *注意： 
 *左边的两个乘数交换算同一方案，不要重复输出！ 
 *不同方案的输出顺序不重要  
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
			//试探
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
			
			f(a, k + 1);
			
			//回溯
			temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
	}
}
