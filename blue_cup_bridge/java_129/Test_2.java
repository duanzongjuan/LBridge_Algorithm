/*Excel����õİ칫�����ÿ����Ԫ����Ψһ�ĵ�ַ��ʾ�����磺��12�е�4�б�ʾΪ����D12������5�е�255�б�ʾΪ��IU5��.��ʵ�ϣ�Excel�ṩ�����ֵ�ַ��ʾ������
 *����һ�ֱ�ʾ������RC��ʽ��ַ����12�е�4�б�ʾΪ����R12C4������5�е�255�б�ʾΪ��R5C255������������ǣ���д����ʵ�ִ�RC��ַ��ʽ�������ַ��ʽ��ת����
 *���������ʽҪ��:�û�������һ������n(n<100),��ʾ��������n���������ݡ����������n��������RC��ʽ��Excel��Ԫ���ַ��ʾ��.���������n�����ݣ�ÿ����ת����ĳ����ַ��ʾ����
 *���磺�û����룺2
 *R12C4
 *R5C255
 *�����Ӧ�������
 *D12
 *IU5
 *@author juanjuan 
 *@version 2018-3-19
 */
package java_129;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_2 {
	// ������ת����26���Ƶ������ʾ
	public static String fun(int c) {
		StringBuilder result = new StringBuilder();
		ArrayList<Character> a = new ArrayList<>();
		while (c != 0) {
			a.add((char) (c % 26 + 64)); // ������������У�����λ�϶�Ӧ��ʮ��������С
			c = c / 26;
		}
		// ���򽫸�λ�ϵ���ֵת������Ӧ����ĸ
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
