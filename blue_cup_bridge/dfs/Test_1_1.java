/*0��1��2�������ֵ�ȫ���������֣�������ĸ���������£�012��021��102��120��201��210
 * ����һ����n ��0~9ʮ������ȫ�����еĵ�n������1��Ϊ0123456789���������ʽ  һ�У�����һ������n �����ʽ  һ�У�����һ��10�����ֵ�ȫ����
 * ��������
 * 1
 * �������
 * 0123456789
 * ���ݹ�ģ��Լ�� 0 < n <= 10! 
 *@author juanjuan
 *@version 2018-3-19
 */
package dfs;

import java.util.Scanner;

public class Test_1_1 {
	static int count = 0;
	static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		sc.close();
		int[] a = {0,1,2,3,4,5,6,7,8,9};
		f(a,0);
	}
	
	public static void f(int[] a,int k) {
		if(k==a.length) {
			count++;
			if(count == n) {
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]);
				}
			}
		}
		for(int i=k;i<a.length;i++) {
			//��̽
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
			
			f(a,k+1);
			
			//����
			temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
	}
}
