/*把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串.接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母.得到的新串再进行删除
 * 奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母.
 *@author juanjuan
 *@version 2018-3-17
 */

//ArrayList长度可变的数组
package province_2014;

import java.util.ArrayList;

public class Test_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefghijklmnopqrs";
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<106;i++) {
			for(int j=0;j<s.length();j++) {
				list.add(s.charAt(j)+" ");
			}
		}
		boolean flag = true;
		while(flag) {
			if(list.size()==1) {
				flag = false;
				continue;
			}
			for(int i=0;i<list.size();i++) {
				if(i%2==0) {
					list.set(i, "0");
				}
			}
			for(int i=0;i<list.size();i++) {
				if(list.get(i) == "0") {
					list.remove(i);
				}
			}
		}
		System.out.println(list.get(0));
	}
}
