package D2;
import java.util.*;
import java.io.*;

public class 달팽이숫자1954 {
	static int[][] arr;
	static int N;
	public static void main(String[] args) throws Exception {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int t = 1; t<=T; t++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			int dir = 1, len = N, num = 1;
			//dir은 1일때는 증가하는 쪽으로 더해주고 -1 일때는 감소하는 쪽으로 더해주기
			//len은 점점 줄어들면서 달팽이가 한쪽으로 갈 수있는거리
			//num은 배열에 숫자를 찍는 변수
			int i=0,j=-1; //코드의 흐름 상 j는 -1에서 시작한다.
			while(true) {
				for(int k=0; k<len; k++) { //증가하는 쪽으로 갈때,
					j += dir; //j가 점점 커짐
					arr[i][j]= num++;
				}
				len--; // 증가하는 쪽으로 가로 이동 후, len은 줄어들어야함
				if(len < 0) break;
				for(int k=0;k<len;k++) { //세로 이동 ?????
					i += dir;
					arr[i][j] = num++;
				}
				dir *= -1;
			}
			System.out.println("#"+t);
			for(int n=0;n<N;n++) {
				for(int m=0;m<N;m++) {
					System.out.print(arr[n][m]+" ");
				}
				System.out.println();
			}
		}
    }

}