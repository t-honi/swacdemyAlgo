package D2;

import java.util.Scanner;

public class 스도쿠검정3버전 {
	final static int N=9; 
	static int result =1;
	static int test[] = new int[9];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[][] = new int[9][9];
		
		for(int tc =1; tc<=T; tc++) {
			result = 1;
			
			for(int i =0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				} // 배열만들고 
			}
			
			//가로 확인 
			for(int i =0; i<N; i++) {
				for(int j=0; j<N; j++) {
					test[arr[i][j]-1]++; //test배열에 1~9숫자이니까 -1빼주고 넣어준다
				}
				checkSudoku();
			}
			//세로 확인
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					test[arr[j][i]-1]++;
				}
				checkSudoku();
			}
			
			//3X3행렬확인
			for(int i =0; i<N; i+=3) {
				for(int j=0; j<N; j+=3) {
					for(int k=i; k<i+3; k++) {
						for(int s=j; s<j+3; s++) {
							test[arr[k][s]-1]++;
						}
					}
					checkSudoku();
				}
			}
			System.out.println("#" + tc +" " + result);
		
		}
	}
	private static void checkSudoku() {
		for(int i =0; i<test.length; i++) {
			if(test[i]!=1) //1이아니야? , 2개가 들어가있으면 오류
				result = 0; // 틀린거니까 0을 출력해주고 
			test[i]=0; //다시 초기화 
		}
	}

}
