package D2;

import java.util.Scanner;

public class 달팽이숫자1954내버전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		
		
		int dir = 1;  // 방향
		int len = N;  // 길이
		int num = 1; // 안에 넣어줄 숫자
		
		int i =0, j=-1;
		while(true) {
			for(int k=0; k<len; k++) {
				j += dir;
				arr[i][j] = num++;
			}
			len --;
			if(len<0) break;
			
			for(int k =0; k<len; k++) {
				i += dir;
				arr[i][j] = num++;
			}
			dir *= -1; // 다시 방향전환
		}
		System.out.println("#" + tc);
		for(int n=0; n<N; n++) {
			for(int m = 0; m<N; m++) {
				System.out.print(arr[n][m]+ " ");
			}
			System.out.println();
		}
		}
	}

}
