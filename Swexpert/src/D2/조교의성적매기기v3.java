package D2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 조교의성적매기기v3 {
	static String grade[] = {"A+","A0","A-","B+","B","B-","C+","C0","C-","D0"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N =sc.nextInt();
			int K =sc.nextInt();
			double find_score = 0.0;
			Double arr[] = new Double[N];
			
			
			
			for(int i =0; i<N; i++) {
				int mid = sc.nextInt();
				int fin = sc.nextInt();
				int sub = sc.nextInt();
				
				double sum  = mid *0.35 + fin*0.45 + sub*0.2;
				arr[i] = sum;
				if(i+1 == K) find_score = sum;
			}
			Arrays.sort(arr, Collections.reverseOrder());
			int index = 0;
			for(int i =0; i<arr.length; i++) {
				if(arr[i] == find_score) {
					index = i;
				}
			}
			index = index / (N/10);
			
			System.out.printf("#%d %s\n" ,tc , grade[index] );
			
			
		}
		
	}

}
