/*
 * 每个正整数都可以表示为至多4个正整数的平方和。如果把0包括进去，就正好可以表示为4个数的平方和。比如：5 = 0^2 + 0^2 + 1^2 + 2^2
 * 7 = 1^2 + 1^2 + 1^2 + 2^2（^符号表示乘方的意思）对于一个给定的正整数，可能存在多种平方和的表示法。要求你对4个数排序：
 * 0 <= a <= b <= c <= d 并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法,程序输入为一个正整数N (N<5000000)
 * 要求输出4个非负整数，按从小到大排序，中间用空格分开 例如，输入：5 则程序应该输出：0 0 1 2 再例如，输入：12 则程序应该输出：0 2 2 2
 * 再例如，输入：773535 则程序应该输出：1 1 267 838 资源约定：峰值内存消耗 < 256M CPU消耗 < 3000ms
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
						break; //break只跳出当前这个循环体,其他嵌套循环不跳出
					}
				}
				if(flag) break; //题目中只要求输出第一个表示法,当找到并输出一种循环后,退出剩下的循环
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
