/*
 * ÿ�������������Ա�ʾΪ����4����������ƽ���͡������0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡����磺5 = 0^2 + 0^2 + 1^2 + 2^2
 * 7 = 1^2 + 1^2 + 1^2 + 2^2��^���ű�ʾ�˷�����˼������һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����Ҫ�����4��������
 * 0 <= a <= b <= c <= d �������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��,��������Ϊһ��������N (N<5000000)
 * Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ� ���磬���룺5 �����Ӧ�������0 0 1 2 �����磬���룺12 �����Ӧ�������0 2 2 2
 * �����磬���룺773535 �����Ӧ�������1 1 267 838 ��ԴԼ������ֵ�ڴ����� < 256M CPU���� < 3000ms
 *@author juanjuan
 *@version 2018-3-9 
 */
package province_7;

import java.util.Scanner;

public class Test_81 {
	static int n;
	static int[] a = new int[5000010];
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		boolean flag = false;
		init();
		for(int i=0;i*i<=n;i++) {
			for(int j=i;j*j<=n;j++) {
				if(a[n-i*i-j*j] == 0) break; //continue
				for(int k=j;k*k<=n;k++) {
					int temp = n-i*i-j*j-k*k;
					double l = Math.sqrt((double)temp);
					if(l == (int)l) {
						System.out.println(i+" "+ j+" " + k+" " + (int)l);
						flag =  true;
						break; //breakֻ������ǰ���ѭ����,����Ƕ��ѭ��������
					}
				}
				if(flag) break; //��Ŀ��ֻҪ�������һ����ʾ��,���ҵ������һ��ѭ����,�˳�ʣ�µ�ѭ��
			}
			if(flag) break;
		}
		long time1 = System.currentTimeMillis();
		System.out.println(time1-time);
	}
	
	public static void init() {
		for(int i=0; i*i<=n;i++) {
			for(int j=0;j*j<=n;j++) {
				if(i*i+j*j<=n) {
					a[i*i+j*j] = 1;
				}
			}
		}
	}
}
