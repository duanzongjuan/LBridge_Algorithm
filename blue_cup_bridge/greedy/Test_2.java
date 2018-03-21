/*［最大整数］设有n个正整数,将它们连接成一排，组成一个最大的多位整数。例如:n=3时,3个整数13，312，343，连成的最大整数为34331213。又如：n=4时，4个整数7，13，4，246，连成的最大整数为7424613。
 * 输入：n
 * N个数
 * 输出：连成的多位数 
 *@author juanjuan
 *@version 2018-3-20
 */

//先把整数转换成字符串，然后在比较a+b和b+a，如果a+b>=b+a，就把a排在b的前面，反之则把a排在b的后面。
package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		while(n-->0) {
			list.add(sc.next());
		}
		sc.close();
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if((list.get(i)+list.get(j)).compareTo(list.get(j)+list.get(i))<0) { //注意compareTo方法
					String temp = list.get(j);  //与数组交换的区别
					list.set(j, list.get(i));
					list.set(i,temp);
				}
			}
		}
		
		String str = "";
		for(int i=0;i<list.size();i++) {
			str += list.get(i);
		}
		System.out.println(str);
	}
}
