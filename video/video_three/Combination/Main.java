/**
 *m个A和n个B可以组合多少种不同排列.
 * @author juanjuan
 * @version 2018-2-9
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(f(m,n));
	}

	public static int f(int m,int n) {
		if(m == 0 || n == 0) return 1;
		return f(m-1,n) + f(m,n-1);
	}
}