/**
 * 最大公因数,最小公倍数,a的n次幂,a的n次幂对p取模
 *@author juanjuan
 *@version 2018-2-12
 *
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a = m;
		int b = n;
		gcd(m,n,a,b);
		f(m,n);
		System.out.println(f1(3,5));
		System.out.println(f2(3,5000,17));
	}

	//暴力破解法
	public static void f(int m, int n) {
		if(m < n) {
			int t = m;
			m = n;
			n = t;
		}

		for(int i=n; i>=1; i--) {
			if(n % i == 0 && m % i == 0) {
				System.out.println(i + " " + m * n / i);
				break;
			}
		}
	}

	//辗转相除法
	//a=ka*i+a1 ,b=kb*i+b1
	//(a+b)%i=(ka+kb)*i+(a1+b1)%i
	//a=ka*i,b=kb*i
	//[a,b]---->[b-a-a-a..,a]==[b%a,a]
	public static void gcd(int m, int n,int a,int b) {
		for(;;) {
			if(n == 0) {
				System.out.println(m + " " + a*b/m);
				break;
			}
			int t = n;
			n = m % n;
			m = t;
		}
	}

	//a的n次幂
	public static int f1(int a, int n) {
		int x = 1;
		for(int i=0; i<n; i++) {
			x = x* a;
		}
		return x;
	}

	//a的n次幂对p取模(取模一般模取一个素数)
	//a=ka*p+a1,b=kb*p+b1,
	//a%p   b%p (a+b)%p=(a%p + b%p)%p   (a*b)%p=(a%p)*(b%p)%p
	public static int f2(int a, int n, int p) {
		int x = 1;
		for(int i=0; i<n; i++) {
			x = (x*a)%p;
		}
		return x;
	}
}