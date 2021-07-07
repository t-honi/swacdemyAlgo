package D2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 조교의성적매기기다른버전 {
	public static void main(String[] args) {
		final String grades[] = {"A+","A","A-","B+","B","B-","C+","C0","C-","D0"};
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Integer a [] = new Integer[n]; // 10명 애들의 점수를 저장할 공간
			for(int i =0; i<n; i++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int hom = sc.nextInt();
				a[i] = mid*35 + fin*45 + hom*20;
			}
			int k_score = a[k] ;// k번째 사람의 점수를 따로 저장하고 
			Arrays.sort(a, Collections.reverseOrder());
			int k_rank = Arrays.asList(a).indexOf(k_score);
			System.out.format("#%d %s\n", tc, grades[10*k_rank/n]);
		}
	}

}
