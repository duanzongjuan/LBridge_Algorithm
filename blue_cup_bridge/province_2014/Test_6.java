/*上小学的时候，小明经常自己发明新算法。一次，老师出的题目是：1/4乘以 8/5小明居然把分子拼接在一起，分母拼接在一起，答案是：18/45 老师刚想批评他，转念一想，这个答案凑巧也对啊，
 *真是见鬼！对于分子、分母都是 1~9 中的一位数的情况,还有哪些算式可以这样计算呢？  请写出所有不同算式的个数（包括题中举例的）。  显然，交换分子分母后，例如：4/1 乘以 5/8 
 *是满足要求的，这算做不同的算式. 但对于分子分母相同的情况，2/2 乘以 3/3 这样的类型太多了，不在计数之列!注意：答案是个整数（考虑对称性，肯定是偶数）。
 *@author juanjuan
 *@version 2018-3-17
 *
 */

//除法注意double,int  1/2=0
package province_2014;

public class Test_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				//if(a!=b) {
				for (int c = 1; c <= 9; c++) {
					for (int d = 1; d <= 9; d++) {
						//if(c!=d) {
						if (a != b && c != d && (double)(b * 10 + d) / (a * 10 + c) == (double)(b * d) / (a * c)) { //double
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
