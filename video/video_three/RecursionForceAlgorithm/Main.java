/**
 *已知账目明细,编程找出漏掉的1笔或几笔.如果有多种可能,则输出所有可能情况.
 *用户输入第一行时:有错的金额,接下来是一个整数n，表示下面将要输入的明细账目的数目.
 *再接下来是n行整数,分别表示每笔账目的金额.
 *要求程序输出:所有可能漏掉的金额组合。每个情况一行.金额从小到大排序,中间用空格隔开.
 *例:用户输入:
 *6
 *5
 *3
 *2k
 *4
 *3
 *1
 *表明:有错的金额是6,明细有5笔
 *1 3 3
 *1 2 4
 *@author juanjuan
 *@version 2018-2-10
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int err_sum = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean[] b = new boolean[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}

		f(err_sum,a,0,0,b);
	}

	//err_sum：有错误的和
	//a:存储账目明细的数组
	//k:当前处理的位置
	//cur_sum：当前累加的金额的和
	//b:记录当前账目是否加入cur_sum中
	public static void f(int err_sum,int[] a,int k,int cur_sum,boolean[] b) {
		if(err_sum < cur_sum) return;

		if(err_sum == cur_sum)  {
			int[] c = new int[a.length];  //定义数组,存取未取的数字
			for(int i=0; i<b.length; i++) {
				if(b[i] == false) {
					c[i] = a[i];
				}
			}

			Arrays.sort(c);

			for(int i=0; i<a.length; i++) {
				if(c[i] != 0) {
					System.out.print(c[i] + " ");
				}
			}
			System.out.println();
			return;
		}

		if(k >= a.length) return;

		b[k] = false;
		f(err_sum,a,k+1,cur_sum,b);

		cur_sum += a[k];
		b[k] = true;
		f(err_sum,a,k+1,cur_sum,b);
		
		b[k] = false;   //回溯!!!!!(切记)
	}
}