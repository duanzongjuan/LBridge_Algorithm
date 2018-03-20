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

//visit数组先要全部定义为false，然后判断是否被访问了，如果没被访问，则访问。然后设置visit数组为true，然后进行下一位的搜索，然后再设置为false，重新设置未访问。
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
		//递归的出口
		if(pos == 10) { //全排列到了长度为10，要进行判别 
			count++;
			if(count == n) {
				for(int i=0; i<a.length;i++) {
					System.out.print(a[i]);
				}
			}
		}
		
		for(int i=0;i<10;i++) { //首位为i
			if(!hasvisited[i]) { //如果还没被访问才可以继续搜索
				a[pos] = i; 
				hasvisited[i] = true; //第i个进行访问，则设置已访问  
				dfs(pos+1); //一位一位地搜索
				//回溯
				hasvisited[i] = false; //重新设置未访问，因为它有可能出现在下一次全排列当中
			}
		}
	}
}
