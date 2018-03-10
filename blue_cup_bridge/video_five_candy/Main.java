package video_five_candy;

public class Main {
	static final int N = 1000 * 100;
	
	//搜索连续能够买到的糖果数
	static int se(int[] da,int a) {
		int n = 0;
		for(int i=0; i<da.length; i++) { //i<N也可以.效率低
			if(da[i] == 1) {
				n++;
				if(n >= a) 
					return i-a;
			} else {
				n = 0;
			}
		}
		return -1;
	}
	
	static void f(int a, int b) {
		int[] da = new int[N];
		
		//查找a的倍数,b的倍数,a和b的倍数.如(1*a+2*b等)
		for(int i=0; i<=N/a; i++) {
			for(int j=0; j<=(N-i*a)/b; j++) {
				if(i*a + b*j < N) da[i*a + b*j] = 1;
			}
		}
		System.out.println(se(da,a));
	}
	
	public static void main(String[] args) {
		f(3,5);
		f(4,7);
		f(10,13);
		f(30,41);
		f(257,191);
	}
}
