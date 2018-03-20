/*0、1、2三个数字的全排列有六种，按照字母序排列如下：012、021、102、120、201、210
 * 输入一个数n 求0~9十个数的全排列中的第n个（第1个为0123456789）。输入格式  一行，包含一个整数n 输出格式  一行，包含一组10个数字的全排列
 * 样例输入
 * 1
 * 样例输出
 * 0123456789
 * 数据规模和约定 0 < n <= 10! 
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
			//试探
			int temp = a[k];
			a[k] = a[i];
			a[i] = temp;
			
			f(a,k+1);
			
			//回溯
			temp = a[k];
			a[k] = a[i];
			a[i] = temp;
		}
	}
}
