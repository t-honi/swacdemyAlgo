package D2;

import java.util.Scanner;

public class 파리퇴치다시 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt(); 
			int arr[][] = new int[N][N]; // 전체 맵
			
			for(int i =0; i<N; i++) {
				for(int j =0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int die, max =0;
			 
			for(int i = 0; i<=N-M; i++) {
				for(int j =0; j<=N-M; j++) {
					die=0;
					for(int k =0; k<M; k++) {
						for(int l = 0; l<M; l++) {
							die += arr[i+k][j+l];
						}
					}
					if(die>max ) {
						max = die;
					}
					
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}
