/**
 *求字符串的反转串.
 * @author juanjuan
 * @version 2018-2-9
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(f("abcdef"));
	}

	public static String f(String s) {
		if(s == null || s.length() < 2) return s;
		return f(s.substring(1)) + s.charAt(0);
	}
}