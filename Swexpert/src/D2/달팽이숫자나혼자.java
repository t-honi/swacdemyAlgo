package D2;

import java.util.Scanner;

public class 달팽이숫자나혼자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++) {
		int N =sc.nextInt();
		int arr[][] = new int[N][N];
		
		int len = N; // 길이 지정해주고 
		int dir = 1; // 방향전환값
		int num = 1; // 넣어줄 숫자 
		
		int i = 0, j=-1; 
		
		while(true) {
			for(int k=0; k<len; k++) {
				// -> 방향 처음 채워줘야하니까
				// N=3 일때 0,0 0,1 0,2 채워야하니까
				j += dir;
				//증가시키면서 배열에 담기
				arr[i][j] = num++; 
			}
			// 밑 , <- 방향 
			len--;
			if(len<0)break;
			for(int k = 0; k<len ; k++) {
				//밑으로 이동 
				i+= dir;
				arr[i][j] = num++;
			}
			//한바퀴 돌면 지금 현재 i =2 이다 , N이 3이라고 했을경우에
			dir *= -1; // 다시 방향 전환 
			
		}
		System.out.println("#" + tc);
		
		for(int m = 0; m<N; m++) {
			for(int x= 0; x<N; x++) {
				System.out.print(arr[m][x] + " ");
			}
			System.out.println();
		}
		
		}
	}

}
