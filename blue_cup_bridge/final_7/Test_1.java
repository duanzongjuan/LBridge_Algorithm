/*
 * X星球愤怒的小鸟喜欢撞火车！一根平直的铁轨上两火车间相距 1000米,两火车 （不妨称A和B） 以时速 10米/秒 相对行驶。愤怒的小鸟从A车出发，时速50米/秒，撞向B车，然后返回去撞A车，
 * 再返回去撞B车，如此往复....两火车在相距1米处停车。问：这期间愤怒的小鸟撞 B 车多少次？
 *@author juanjuan
 *@version 2018-3-10
 */
package final_7;

public class Test_1 {
	// 递归
	static int time = 0;
	static int i = 0;

	public static void main(String[] args) {
		f(1000);
		System.out.println(time);
	}

	//长度递归
	public static double f(double length) {
		double t = length / 60; //50t+10t=1000;
		length = length - (10 + 10) * t;
		if (length <= 1)
			return 0;
		if (i % 2 == 0) { //偶数撞B,奇数撞A
			time++;
		}
		i++;
		return f(length);
	}
}
