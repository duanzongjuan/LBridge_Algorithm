/*����ƿ��  ��N��ƿ�ӣ���� 1 ~ N�����ڼ����ϡ�������5��ƿ�ӣ�2 1 3 5 4 Ҫ��ÿ������2��ƿ�ӣ��������ǵ�λ�á��������ɴκ�ʹ��ƿ�ӵ����Ϊ��1 2 3 4 5 ������ô�򵥵������
 * ��Ȼ��������Ҫ����2�ξͿ��Ը�λ�����ƿ�Ӹ����أ������ͨ�����������������ʽΪ���У���һ��: һ��������N��N<10000��, ��ʾƿ�ӵ���Ŀ  �ڶ��У�N�����������ÿո�ֿ���
 * ��ʾƿ��Ŀǰ������������������Ϊһ��һ������������ʾ���ٽ������ٴΣ������������
 * ���磬���룺5
 * 3 1 2 5 4 ����Ӧ�������3
 * �����磬���룺
 * 5
 * 5 4 3 2 1
 * ����Ӧ�������
 * 2
 * @author juanjuan
 * @version 2018-3-10
 */
package province_7;

import java.util.Scanner;

public class Test_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		for(int i=1; i<=N;i++) {
			a[i] = sc.nextInt();
		}
		
		long count = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=i) {
				int temp = a[i];
				for(int j=i; j<a.length;j++) {
					if(a[j] == i) {
						a[i] = a[j];
						a[j] = temp;
						count++;
					}
				}
			}
		}
		System.out.println(count);
		long time1 = System.currentTimeMillis();
		System.out.println(time1-time);
	}
}
