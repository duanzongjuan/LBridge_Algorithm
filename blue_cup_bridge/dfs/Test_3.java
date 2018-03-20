package dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test_3 {
	static ArrayList<String> ret = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		Permutation(str);
		System.out.println(ret);
	}

	public static ArrayList<String> Permutation(String str) {
		
		Set<String> hel = new HashSet<>();
		StringBuilder sb = new StringBuilder(str);

		f(hel, sb, 0);
		ret = new ArrayList<>(hel);
		Collections.sort(ret);
		return ret;
	}

	private static void f(Set<String> hel, StringBuilder sb, int step) {
		if (step == sb.length() - 1) {
			hel.add(sb.toString());
			return;
		}
		for (int i = step; i < sb.length(); i++) {
			swap(sb, step, i);
			f(hel, sb, step + 1);
			swap(sb, step, i);
			// while(i+1<sb.length() && sb.charAt(i+1) == sb.charAt(i))i++;
		}

	}

	private static void swap(StringBuilder sb, int a, int b) {
		char tc = sb.charAt(a);
		sb.setCharAt(a, sb.charAt(b));
		sb.setCharAt(b, tc);
	}
}
