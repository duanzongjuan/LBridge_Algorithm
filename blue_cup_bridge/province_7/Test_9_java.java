/*ȡ����    ��������ȡ�����Ϸ��һ����N����ÿ������ȡ��ÿ�ο�ȡ����{n1,n2,n3}�е��κ�һ����Ŀ������޷�����ȡ������Ϸ��������ʱ���������������һ����ʤ��������˶�
 *����������Ϊƽ�֡�����˫���������������ȡ������һ��ȡ�����һ����Ӯ���Ա�̽��������⡣�����ʽ����һ��3��������n1 n2 n3���ո�ֿ�����ʾÿ�ο�ȡ����Ŀ 
 *(0<n1,n2,n3<100) �ڶ���5��������x1 x2 ... x5���ո�ֿ�����ʾ5�ֵĳ�ʼ����(0<xi<1000)
 *�����ʽ��һ��5���ַ����ո�ֿ����ֱ��ʾÿ����ȡ������ܷ��ʤ���ܻ�ʤ�����+����֮�����а취��ƽ���֣����0��������ζ����䣬�����-
 *���磬���룺
 *1 2 3
 *1 2 3 4 5
 *����Ӧ�������+ 0 + 0 -
 *�����磬���룺
 *1 4 5
 *10 11 12 13 15
 *����Ӧ�������0 - 0 + +
 *�����磬���룺
 *2 3 5
 *7 8 9 10 11
 *����Ӧ�������
 *+ 0 0 0 0
 *@author juanjuan
 *@version 2018-3-15
 */

/*����˼·:�ڻ���������������£��ö��ֵ�ѡ��Χ������С�������ڱ�֤����������ʱ��ѡ��ϴ�����������״̬�£��ö���ѡ������������̵Ļ����Խ�����Ա���ѡż������ʱѡ��
 *��С�ġ�(��ż����ʱ��,ѡ����������,���ȫ����ż��,ѡ����С��ż��,��������ʱ��,ѡ������)
 */
package province_7;

import java.util.Arrays;
import java.util.Scanner;

public class Test_9_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] f = new int[3];
		for (int i = 0; i < 3; i++)
			f[i] = sc.nextInt();
		Arrays.sort(f);
		for (int i = 0; i < 5; i++) {
			int sum = sc.nextInt();
			int a = 0, b = 0; // a��ʾ��һ��ѡ���е������Ŀ����ż,0��ʾż��,1��ʾ����
			while (sum >= f[0]) {
				if (a == 0) {
					if (sum >= f[2] && f[2] % 2 == 1) {
						a = 1;
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 1) {
						a = 1;
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 1) {
						a = 1;
						sum -= f[0];
					} else if (sum >= f[0]) {
						sum -= f[0];
					}
				} else if (a == 1) {
					if (sum >= f[2] && f[2] % 2 == 0) {
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 0) {
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 0) {
						sum -= f[0];
					} else if (sum >= f[0]) {
						a = 0;
						sum -= f[0];
					}
				}

				if (b == 0) {
					if (sum >= f[2] && f[2] % 2 == 1) {
						b = 1;
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 1) {
						b = 1;
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 1) {
						b = 1;
						sum -= f[0];
					} else if (sum >= f[0]) {
						sum -= f[0];
					}
				} else if (b == 1) {
					if (sum >= f[2] && f[2] % 2 == 0) {
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 0) {
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 0) {
						sum -= f[0];
					} else if (sum >= f[0]) {
						b = 0;
						sum -= f[0];
					}
				}
			}
			if (a == b) {
				System.out.print("0");
			} else if (a < b) {
				System.out.print("-");
			} else {
				System.out.print("+");
			}
			if (i != 4) {
				System.out.print(" ");
			}
		}
	}
}
