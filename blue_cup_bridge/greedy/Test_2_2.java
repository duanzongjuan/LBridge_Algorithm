/*���������������n��������,���������ӳ�һ�ţ����һ�����Ķ�λ����������:n=3ʱ,3������13��312��343�����ɵ��������Ϊ34331213�����磺n=4ʱ��4������7��13��4��246�����ɵ��������Ϊ7424613��
 * ����:n
 * N����
 * ��������ɵĶ�λ�� 
 *@author juanjuan
 *@version 2018-3-20
 */

//�Ȱ�����ת�����ַ�����Ȼ���ڱȽ�a+b��b+a�����a+b>=b+a���Ͱ�a����b��ǰ�棬��֮���a����b�ĺ��档
package greedy;

import java.util.Scanner;

public class Test_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		sc.close();

		//�Ƚϡ��������ƶ�
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((a[i] + a[j]).compareTo(a[j] + a[j]) < 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		String str = "";
		for(int i=0;i<n;i++) {
			str += a[i];
		}
		System.out.println(str);
	}

	//�Ƚ��㷨
	public static int compareTo(String s1, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		if (i1 - i2 >= 0)
			return 1;
		else
			return -1;
	}
}
