/**
 *一群海盗(人数不多于20人),拼酒量。打开一瓶酒,所有在场的人平分喝下,有几个人倒下了,再打开一瓶
 *平分,又有倒下的，再重复...直到开了第4瓶,坐着的人所剩无几,船长在其中.当第4瓶平分喝下后,大家都
 * 倒下了。已知,船长正好喝了一瓶。推断开始有多少人,每一轮喝下来还剩多少人.(列出所有答案,每个答案占一行.)
 *格式是:人数,人数.... 例如:20 5 4 2 0
 *@author juanjuan
 *@version 2018-2-11
 */

//关键:每一轮都有人倒下了
//暴力破解

public class Main {
	public static void main(String[] args) {
		for(int a=20; a>0; a--) {
			for(int b=a-1; b>0; b--) {
				for(int c=b-1; c>0; c--) {
					for(int d=c-1; d>0; d--) {
						//if(1.0/a + 1.0/b + 1.0/c + 1.0/d == 1) {
						//if(1/a + 1/b + 1/c + 1/d == 1)
						// 1/a = 0(a != 1)  例如: 1/4 = 0; 
						// 1.0 /a 
						if(b*c*d + a*c*d + a*b*d + a*b*c == a*b*c*d) {
							System.out.println(a + " " + b + " " + c + " " + d + " " + "0");
						}
						//}
					}
				}
			}
		}
	}
}