/**
 *求两个串的最大公共子序列的长度
 * 算法:可解,优化
 * @author juanjuan
 * @version 2018-2-9
 */
public class Main {
	public static void main(String[] args) {
		int k = f("abc","dbfbcfk");
		System.out.println(k);
	}

	public static int f(String s1,String s2) {
		if(s1.length() == 0 || s2.length() == 0) 
			return 0;
		if(s1.charAt(0) == s2.charAt(0))
			return f(s1.substring(1),s2.substring(1)) + 1;
		else 
			return Math.max(f(s1.substring(1),s2),f(s1,s2.substring(1)));
	}
}