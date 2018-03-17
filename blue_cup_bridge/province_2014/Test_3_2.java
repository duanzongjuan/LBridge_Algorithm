/*
 *把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串. 接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母.
 * 得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。 
 *@author juanjuan
 *@version 2018-3-17
 */
package province_2014;

public class Test_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghigklmnopqrs";
		String s1="";
		for(int i=0;i<106;i++) {
			s1 += s;
		}
		boolean[] a = new boolean[s1.length()];
		for(int i=0;i<a.length;i++) {
			a[i] = true;
		}
		int leftCount = s1.length();
		int countNum = 0;
		int index = 0;
		while(leftCount>1) {
			if(a[index] == true) {
				if(countNum%2==0) {
					a[index] = false;
					leftCount--;
				}
				countNum++;
			}
			index++;
			if(index==s1.length()) {
				index = 0;
				countNum = 0;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==true) {
				System.out.println(i); //输出结果表示下标为1023(第1024个)的字母,即：q 
			}
		}
	}
}
