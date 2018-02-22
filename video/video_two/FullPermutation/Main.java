/**
 *求n个元素的全排列
 *@author juanjuan
 *@version 2018-2-9
 */
public class Main {
	public static void main(String[] args) {
		char[] data = "ABC".toCharArray();
		f(data,0);
	}

	/**
	 * K:当前的交换位置(关注点),与其后的元素交换
	 */
	public static void f(char[] data,int k) {
		if(k == data.length) {
			for(int i=0; i<data.length; i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println();
		}

		for(int i=k; i<data.length; i++) {
			//试探
			{
				char temp = data[k];
				data[k] = data[i];
				data[i] = temp;
			}
			f(data,k+1);
			//回溯
			{
				char temp = data[k];
				data[k] = data[i];
				data[i] = temp;
			}
		}
	}
}