/*
 *小明到X山洞探险，捡到一本有破损的武功秘籍（2000多页！当然是伪造的）。他 意识到：书的第10页和第11页在同一张纸上，但第11页和第12页不在同一张纸上。     小明只想练习该书的
 *第81页到第92页的武功，又不想带着整本书。请问他至少要撕下多少张纸带走？  这是个整数，请通过浏览器提交该数字，不要填写任何多余的内容。 
 *@author juanjuan
 *@version 2018-3-16
 */
package province_2014;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a =  sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				count ++;
			}
		}
		System.out.println(count+1); //一开始81,(80,81)是一页
	}

}
