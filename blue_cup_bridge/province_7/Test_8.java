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

public class Test_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		Scanner sc = new Scanner(System.in);
		long time = System.currentTimeMillis(); 
		int N = sc.nextInt();
		int sq = (int) Math.sqrt(5000000);
		for (int i = 0; i <= sq; i++) {
			//if(i*i>N) break;
			for (int j = i; j <= sq; j++) {
				if(i*i+j*j>N) break;
				for (int k = j; k <= sq; k++) {
					if(i*i+j*j+k*k>N) break;
					int d = (int) Math.sqrt((N - i * i - j * j - k * k));
					if (i * i + j * j + k * k + d * d == N) {
						System.out.print(i + " " + j + " " + k + " " + d +" ");
						long time1 = System.currentTimeMillis();
						System.out.println(time1-time);
						return;
					}
				}
			}
		}
		
	}
}
