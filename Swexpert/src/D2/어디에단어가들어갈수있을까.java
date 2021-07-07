package D2;

import java.util.Scanner;

public class 어디에단어가들어갈수있을까 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt(); // 집어넣을 길이 
			int ans = 0; //답으로 확인
			int arr[][] = new int[N+2][N+2];
			
			//퍼즐판만들기
			for(int i =1; i<=N; i++) {
				for(int j =1; j<=N; j++) {
					arr[i][j] = sc.nextInt(); // 1이 흰부분 , 0이 검은색 부분 , 1에다가 넣을 수 있다
				}
			}
			 // k길이가 들어갈 수 있는 값
			// 행부터
	
			for(int i =0; i<N+2; i++) {
				int count = 0; // 1의개수확인
				for(int j =0; j<N+1; j++) {
					if(arr[i][j] == 0) {
						//오른쪽값이 1이면 count
						if(arr[i][j+1] != arr[i][j]) 
							count ++;
						}
					else {
							if(arr[i][j+1] == arr[i][j])count++;
							else {
								if(count == K) ans++;
								count =0;
							}
						}
					
				}
				if(count == K) {
					ans++;
				}
			}
			/*
			0 0 1 1 1
			1 1 1 1 0
			0 0 1 0 0
			0 1 1 1 1
			1 1 1 0 1
						 * */
			for(int i=0; i<N+2; i++) {
				int count =0;
				for(int j=0; j<N+1; j++) {
					// 현재 값이 0이라면
					if(arr[j][i] ==  0) {
						//아래값이 1인지 확인하기 
						//이전값과 같지 않다면 1이라는 소리니까
						if(arr[j+1][i]!=arr[j][i])count++;
						
					}
					else {
						// 아래값이 1일경우에 count 1증가 
						if(arr[j+1][i] == arr[j][i])count++;
						//count가 3이면 ans 1증가 
						else {
							if(count == K)ans++;
							count = 0; // 0 으로 초기화 해주고
						}
					}
				}
				if(count == K)ans++;
			}
			
			System.out.printf("#%d %d\n",tc,ans);
			
			
			
		}
	}
}
