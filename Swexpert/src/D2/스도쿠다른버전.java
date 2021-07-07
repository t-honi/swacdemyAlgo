package D2;

import java.util.Scanner;

// 가로, 세로 , 3X3 전체를 다확인해줘야한다.
// 입력받은 배열에서 순서대로, 행체크, 열체크, 격자체크를 하면된다
// 행체크는 각 줄마다 arr 배열에서 0이 있으면 fasle
// 열체크에서도 각 줄마다 arr 배열에서 0이 있으면 false
// 격자 체크도 마찬가지 
public class 스도쿠다른버전 {
	final static int N=9;
	static int result =1;
	static int test[] = new int[9];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[][] = new int[N][N];
		
		for(int tc =1; tc<=T; tc++) {
			result =1; //?
			
			for(int i=0; i<N; i++) { // 맵만들고
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<N; i++) { //가로
				for(int j=0; j<N; j++) {
					test[arr[i][j]-1]++;
				}
					checkSudoku();
			}
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					test[arr[j][i]-1]++;
				}
				checkSudoku();
			}
			for(int i=0; i<N; i+=3 ) {
				for(int j=0; j<N; j+=3) {
					for(int k=i; k<i+3; k++) {
						for(int s=j; s<j+3; s++) {
							test[arr[k][s]-1]++;
						}
					}
					checkSudoku();
				}
			}
			System.out.println("#"+tc+" " + result);
			
		}
	}
	private static void checkSudoku() {
		for(int i=0; i<test.length; i++) {
			if(test[i]!=1) //1이아니냐? 그럼 안나왔거나 여러개 나왔거나 , 
				result =0; //끝
			test[i]=0; // 아니면 다시쓰게 초기화 시키고 검색 시작!
		}
	}

}
