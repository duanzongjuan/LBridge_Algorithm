/*
 *���⣺ ���ɿ���   ��ͯ��������KλС���ѵ�С�������͡�С��һ����N���ɿ��������е�i����Hi x Wi�ķ�����ɵĳ����Ρ� Ϊ�˹�ƽ�����С����Ҫ���� N ���ɿ������г�K���ɿ����ָ�С�����ǡ�
 *�г����ɿ�����Ҫ���㣺1. ��״�������Σ��߳�������  2. ��С��ͬ   ����һ��6x5���ɿ��������г�6��2x2���ɿ�������2��3x3���ɿ�������ȻС�����Ƕ�ϣ���õ����ɿ��������ܴ�
 *���ܰ�СHi��������ı߳��Ƕ���ô������ ��һ�а�����������N��K��(1 <= N, K <= 100000)  ����N��ÿ�а�����������Hi��Wi��(1 <= Hi, Wi <= 100000) 
 *���뱣֤ÿλС���������ܻ��һ��1x1���ɿ�����    ���   ����г����������ɿ��������ܵı߳���
 *�������룺
 *2 10  
 *6 5  
 *5 6  
 *���������
 *2
 *@author juanjuan
 *@version 2018-3-13
 */
//��ʱ
package province_8;

import java.util.Scanner;

public class Test_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[][] qkl = new long[N][2]; // ע����Ŀ�����ִ�С,��ȷ����Χ
		for (int i = 0; i < N; i++) {
			qkl[i][0] = sc.nextLong();
			qkl[i][1] = sc.nextLong();
		}

		System.out.println(fun(qkl, K));
	}

	public static int fun(long[][] b, int k) {
		int max = 0;
		for (int i = 2;; i++) {
			int x = 0;
			for (int j = 0; j < b.length; j++) {
				if (b[j][0] / i > 0 && b[j][1] / i > 0) {
					x += (b[j][0] / i) * (b[j][1] / i); // �ܿ���
				}
			}
			if (x < k) { // ��С��K��
				max = i - 1;
				break;
			}
		}
		return max;
	}

}
