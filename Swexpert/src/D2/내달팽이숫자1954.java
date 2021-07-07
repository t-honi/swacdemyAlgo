package D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 내달팽이숫자1954 {
	static int arr[][]; // 배열공간생성
	static int N; // 배열크기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
			//크기받고
			N = Integer.parseInt(br.readLine());
			//N x N 배열 만들어주고 
			arr = new int[N][N];
			// 내가 가는 방향을 증감 표시, 
			int dir = 1; // dir 1일때는 증가하는 방향으로 더해주고 , dir -1일때는 감소하는 방향으로 더해주기
			int len = N; // len이 갈수 있는 거리를 말함  
			int num = 1; // 배열안에 들어갈 값 증가
			
			int i =0, j=-1;
			while(true){ // 증가하나는쪽으로 더해주기 
				for(int k=0; k<len; k++) {
					j += dir; 
					
					arr[i][j] = num++;
					
				} // 밑으로 내려가는 방향
				len--; 
				if(len <0)break;
				for(int k=0; k<len; k++) {
					i += dir;
					
					arr[i][j] = num++;
				}
				// 왼쪽 으로 가고 위쪽으로 가고 -1 로 감소하는 방향으로 가야하니까
				dir = dir*-1;
			}
			//출력 테케부터
			System.out.println("#"+tc);
			
			for(int n=0; n<N; n++) {
				for(int m=0; m<N; m++) {
					System.out.print(arr[n][m]+" ");
				}
				System.out.println();
		}
		
	}
		
	}

}
