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

//visit������Ҫȫ������Ϊfalse��Ȼ���ж��Ƿ񱻷����ˣ����û�����ʣ�����ʡ�Ȼ������visit����Ϊtrue��Ȼ�������һλ��������Ȼ��������Ϊfalse����������δ���ʡ�
package dfs;

import java.util.Scanner;

public class Test_1 {
	static int[] a = new int[10];
	static boolean[] hasvisited = new boolean[10];
	static int n;
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		dfs(0);
	}
	
	public static void dfs(int pos) {
		//�ݹ�ĳ���
		if(pos == 10) { //ȫ���е��˳���Ϊ10��Ҫ�����б� 
			count++;
			if(count == n) {
				for(int i=0; i<a.length;i++) {
					System.out.print(a[i]);
				}
			}
		}
		
		for(int i=0;i<10;i++) { //��λΪi
			if(!hasvisited[i]) { //�����û�����ʲſ��Լ�������
				a[pos] = i; 
				hasvisited[i] = true; //��i�����з��ʣ��������ѷ���  
				dfs(pos+1); //һλһλ������
				//����
				hasvisited[i] = false; //��������δ���ʣ���Ϊ���п��ܳ�������һ��ȫ���е���
			}
		}
	}
}
