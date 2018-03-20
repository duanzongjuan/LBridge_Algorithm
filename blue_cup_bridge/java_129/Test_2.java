/*Excel是最常用的办公软件。每个单元格都有唯一的地址表示。比如：第12行第4列表示为：“D12”，第5行第255列表示为“IU5”.事实上，Excel提供了两种地址表示方法，
 *还有一种表示法叫做RC格式地址。第12行第4列表示为：“R12C4”，第5行第255列表示为“R5C255”。你的任务是：编写程序，实现从RC地址格式到常规地址格式的转换。
 *输入输出格式要求:用户先输入一个整数n(n<100),表示接下来有n行输入数据。接着输入的n行数据是RC格式的Excel单元格地址表示法.程序则输出n行数据，每行是转换后的常规地址表示法。
 *例如：用户输入：2
 *R12C4
 *R5C255
 *则程序应该输出：
 *D12
 *IU5
 *@author juanjuan 
 *@version 2018-3-19
 */
package java_129;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_2 {
	// 将列数转换成26进制的特殊表示
	public static String fun(int c) {
		StringBuilder result = new StringBuilder();
		ArrayList<Character> a = new ArrayList<>();
		while (c != 0) {
			a.add((char) (c % 26 + 64)); // 将余数存入表中，即各位上对应的十进制数大小
			c = c / 26;
		}
		// 倒序将各位上的数值转换成相应的字母
		for (int i = a.size() - 1; i >= 0; i--) {
			result.append(a.get(i));
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] strs = new String[n];
		for (int i = 0; i < n; i++) {
			strs[i] = scan.next();
		}
		scan.close();

		for (int i = 0; i < strs.length; i++) {
			String[] t = strs[i].split("R");
			String[] f = t[1].split("C");

			int r = Integer.parseInt(f[0]);
			int c = Integer.parseInt(f[1]);

			System.out.println(fun(c) + r);
		}
	}
}
