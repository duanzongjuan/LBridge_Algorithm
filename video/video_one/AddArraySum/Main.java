 public class Main {
	public static void main(String[] args) {
		int[] a = {2,9,15,8,7,6,24};
		int sum1 = AddSum(a);
		int sum2 = f1(a,0);
		int sum3 = f2(a,6);
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

	//普通方法
	public static int AddSum(int[] a) {
		int s = 0;
		for(int i=0; i<a.length;i++) {
			s = s+a[i];
		}
		return s;
	}

	//递归,从a数组中begin(第一个元素)开始
	public static int f1(int[] a,int begin) {
		if(begin == a.length) return 0;
		int s = f1(a,begin+1);
		return a[begin] + s;
	}

	//递归,从a数组中end(最后一个元素)开始
	public static int f2(int[] a,int end) {
		if(end < 0) return 0;
		int s = f2(a,end-1);
		return s + a[end];
	}
}