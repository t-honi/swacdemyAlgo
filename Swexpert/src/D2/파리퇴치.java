package D2;

import java.util.Scanner;

public class 파리퇴치안됨... {
	static int dr[] = {0,1,1};
	static int dc[] = {1,0,1};
	static int die ;
	static int arr[] ; // 최대수 뽑기위한 배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		for(int tc=0; tc<T;tc++) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[][] = new int[N][N];
		int arr2[][] = new int[M][M]; // 파리채 
		// 최대한 많은 파리를 죽여야한다. 
		// 맵 만들고 
		for(int i =0; i<N; i++) {
			for(int j =0; j<N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		die = 0; 
		for(int i =0; i<N-1; i++) {
			for(int j =0; j<N-1; j++) {
				chae(i,j);
			}
		}
		
		
		}
	}
	static void chae(int r, int c) {
	  
		 for(int i =0; i<3; i++) {
			int nr = r+dr[i];
			int nc = c+dc[i];
		 }
	}

}
