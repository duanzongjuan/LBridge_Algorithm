/*��N��ֽ�ƣ���ŷֱ�Ϊ1��2������n��ÿ������������,��ֽ��������Ϊn�ı���.��������һ����ȡ������ֽ��,Ȼ���ƶ������ƵĹ���Ϊ���ڱ��Ϊ1��ȡ��ֽ�ƣ�ֻ���Ƶ����Ϊ2�Ķ��ϣ�
 *�ڱ��Ϊn�Ķ���ȡ��ֽ�ƣ�ֻ���Ƶ����Ϊn-1�Ķ��ϣ���������ȡ��ֽ�ƣ������Ƶ�������߻��ұߵĶ��ϡ�����Ҫ���ҳ�һ���ƶ������������ٵ��ƶ�����ʹÿ����ֽ������һ���ࡣ
 *���磺n=4��4��ֽ�Ʒֱ�Ϊ���� 9 �� 8 �� 17 �� 6 �ƶ����ο��ԴﵽĿ�ģ��Ӣ�ȡ4���Ʒŵ��� �ٴӢ���3�ŷŵ���Ȼ��Ӣ�ȥ1�ŷŵ��١�
 *�������������4
 *9 8 17 6
 *��Ļ��ʾ��3
 *@author juanjuan 
 *@version 2018-3-20
 */

/*˼��:��a[i]Ϊ��I��ֽ�Ƶ�����(0<=I<=n)vΪ���ֺ�ÿ��ֽ�Ƶ�������sΪ��С�ƶ�����.������̰���㷨�����մ����ҵ�˳���ƶ�ֽ�ơ����I�ѵ�ֽ����������ƽ��ֵ��
 *���ƶ�һ�Σ���s��1��������������ƶ���1����a[i]>v����a[i]-v�Ŵӵ�I���ƶ�����I+1�ѣ�2����a[i]<v����v-a[i]�Ŵӵ�I+1���ƶ�����I�ѡ�
 *Ϊ����Ƶķ��㣬���ǰ����������ͳһ�����ǽ�a[i]-v�ӵ�I���ƶ�����I+1�ѣ��ƶ�����a[i]=v; a[I+1]=a[I+1]+a[i]-v.
 */
package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		sc.close();

		int avg = 0;
		int count = 0;

		// ����ƽ��ֵ
		for (int i = 0; i < list.size(); i++) {
			avg += list.get(i);
		}
		avg = avg / list.size();

		// �ƶ����޸�
		for (int i = 0; i < list.size() - 1; i++) {  //list.size()-1,��ֹԽ��
			count++;
			list.set(i + 1, list.get(i + 1) + list.get(i) - avg); //�޸�ָ��������ֵ
		}
		System.out.println(count);
	}
}
