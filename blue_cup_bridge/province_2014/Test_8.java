/*��n��С����Χ����һȦ����ʦ��ÿ��С���������ż�����ǹ���Ȼ������������Ϸ��ÿ��С���Ѷ����Լ����ǹ���һ������ֱߵĺ��ӡ�һ�ַ��Ǻ�ӵ���������ǵĺ�������ʦ����1���ǹ���
 *�Ӷ����ż�����������������Ϸ��ֱ������С���ѵ��ǹ�������ͬΪֹ�����������Ԥ������֪�ĳ�ʼ�ǹ������£���ʦһ����Ҫ�������ٸ��ǹ���
 *�������ȶ���һ������N(2<N<100)����ʾС���ѵ������� ������һ���ÿո�ֿ���N��ż��(ÿ��ż��������1000����С��2) Ҫ��������һ����������ʾ��ʦ��Ҫ�������ǹ�����
 *���磺����
 *3
 *2 2 4
 *����Ӧ�������
 *4
 *@author juanjuan
 *@version 2018-3-17
 */
package province_2014;

import java.util.Scanner;

public class Test_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp, i, count = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while (true) {
			int x = 0;// x���ڼ�¼��������ͬԪ�صĸ���
			for (i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					a[i]++;
					count++;
				}
			}
			for (i = 0; i < n; i++) {
				a[i] = a[i] / 2;
			}

			temp = a[0]; // temp�����һ��С���������һ����ǹ�
			for (i = 0; i < n - 1; i++) {
				a[i] = a[i] + a[i + 1];
			}
			a[n - 1] = a[n - 1] + temp; // ����һ��С���ӵ��ǹ������һ��С����

			for (i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1]) {
					++x;
				}
			}
			if (x == n - 1) {
				System.out.print(count);
				break;
			}
		}
	}
}
