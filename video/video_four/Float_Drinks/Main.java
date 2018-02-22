/**
 *啤酒每罐2.3元,饮料1.9元。买了若干啤酒和饮料,共82.3,啤酒比饮料数量少,计算买了几罐啤酒.(答案是一个整数)
 *@author juanjuan
 *@version 2018-2-11
 * 
 */
//暴力破解
//浮点数:足够接近|a-b|<seta; (Math.abs(0.2+0.1-0.3) < 1E-10)

public class Main {
	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(i * 23 + j * 19 == 823 && i < j) //扩大10倍,化为整数
				System.out.println(i + "," + j); 
			}
		}
		System.out.println(0.2+0.1);
		System.out.println(0.2+0.1 == 0.3);
		System.out.println(Math.abs(0.2+0.1-0.3) < 1E-10);

	/*	for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(i * 2.3 + j * 1.9 == 82.3 && i < j) //可能有误差
				System.out.println(i + "," + j); 
			}
		}
	*/

	}
}