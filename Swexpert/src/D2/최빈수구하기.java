package D2;

import java.util.Scanner;

public class 최빈수구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			// 테스트케이스 번호 
			int N = sc.nextInt();
			int arr[] = new int [102];
			
			// 학생의 수 천명 
			for(int i =1; i<=1000; i++) {
				int score = sc.nextInt();
				arr[score]++;
			}
			int max = 0;
			int ans =0;
			for(int i =0; i<102; i++) {
				if(arr[i] >= max) {
					max = arr[i];
					ans = i;
				}
			}
			System.out.print("#" + tc + " " + ans);
			System.out.println();
		}
	}

}
