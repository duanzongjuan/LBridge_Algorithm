/*一根高筋拉面，中间切一刀，可以得到2根面条。   如果先对折1次，中间切一刀，可以得到3根面条。    如果连续对折2次，中间切一刀，可以得到5根面条。  那么，连续对折10次，中间切一刀，
 *会得到多少面条呢？  答案是个整数，请通过浏览器提交答案。不要填写任何多余的内容。
 *@author juanjuan
 *@version 2018-3-17
 */

//2^1+1 ,2^2+1,2^3+1...

package province_2014;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = (int)Math.pow(2, n)+1;
		System.out.println(sum);
	}
}
