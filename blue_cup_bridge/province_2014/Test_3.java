/*
 *把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串.接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母.
 *得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。   答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容 
 *@author juanjuan
 *@version 2018-3-17
 */

//StringBuffer用于可以变的字符串

package province_2014;

import java.util.ArrayList;

public class Test_3 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 19; i++) {
			str += (char) (96 + i);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 106; i++) {
			sb.append(str);
		}
		while (sb.length() > 1) {
			for (int i = 0; i < sb.length(); i++) {
				sb.delete(i, i + 1);
			}
		}
		System.out.println(sb);
	}
}
