public class Main {
	static final int N = 1000 * 100;

	static void f(int a,int b) {
		int[] da = new int[N]; //int类型java默认值为0
		for(int i=0; i<=N/a; i++) {
			for(int j=0; j<=(N-i*a)/b; j++) {
				if(i*a + j*b < N) 
					da[i*a + b*j] = 1;
			}
		}

		System.out.println(se(da,a));
	}

	static int se(int[] da, int a) {
		int count = 0;
		for(int i=0; i<da.length; i++) {
			if(da[i] == 1) {
				count ++;
				if(count >= a) {
					return i-a;
				}
			} else {
				count = 0;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		f(3,5);
		f(4,7);
		f(30,41);
		f(257,191);
	}
}