/*һ���߽����棬�м���һ�������Եõ�2��������   ����ȶ���1�Σ��м���һ�������Եõ�3��������    �����������2�Σ��м���һ�������Եõ�5��������  ��ô����������10�Σ��м���һ����
 *��õ����������أ�  ���Ǹ���������ͨ��������ύ�𰸡���Ҫ��д�κζ�������ݡ�
 *@author juanjuan
 *@version 2018-3-17
 */

//2^1+1 ,2^2+1,2^3+1...

package province_2014;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = (int)Math.pow(2, n)+1;
		System.out.println(sum);
	}
}
