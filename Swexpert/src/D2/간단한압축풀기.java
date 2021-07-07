package D2;

import java.util.Scanner;

public class 간단한압축풀기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			// 알파벳 받을 수 
			int N = sc.nextInt();
			// 알파벳 저장
			char [] c = new char[N];
			// 숫자 저장 
			int [] a = new int[N];
			
			for(int i =0; i<N; i++) {
				c[i] = sc.next().charAt(0);
				a[i] = sc.nextInt();
			}
			int cnt = 0; // 출력횟수
			
			System.out.println("#" + tc);
			for(int i =0; i<N; i++) {
				for(int j=0; j<a[i];  j++) {
					System.out.print(c[i]);
					cnt++;
					if( cnt == 10) {
						System.out.println();
						cnt = 0; // 초기화 하고 다시 0부터 시작
					}
				}
			}
			System.out.println();

		}
	}

}
