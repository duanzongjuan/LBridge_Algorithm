package province_7;

import java.util.Scanner;

public class Test_91 {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int ans = 0;
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		int flag[] = new int[n+1];
		for (i = 1; i <= n; i++)
			arr[i] = sc.nextInt();
		for (i = 1; i <= n; i++)
			flag[arr[i]] = i;
		for (i = 1; i <= n; i++) {
			if (i != arr[i]) {
				int x = arr[i];
				arr[i] ^= arr[flag[i]] ^= arr[i] ^= arr[flag[i]]; // ������λ�õ�������Ӧ��������ֲ�ͬ����ô�ͽ��н�������������������Ӧ�÷����λ�õ�����
				flag[i] ^= flag[x] ^= flag[i] ^= flag[x]; // ��Ӧ��ҲҪ��
				ans++;
			}
		}
		System.out.println(ans);
		long time1 = System.currentTimeMillis();
		System.out.println(time1 - time);
	}
}
