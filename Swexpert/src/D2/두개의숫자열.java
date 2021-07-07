package D2;

import java.util.Scanner;

public class 두개의숫자열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테케 수값
		for(int tc =1; tc<= T; tc++) {
			int N = sc.nextInt(); // arr1 배열에 넣어줄 값
			int M = sc.nextInt(); // arr2 배열에 넣어줄 값
			int arr [] = new int[N];
			int arr2 [] = new int [M];
			
			//arr배열에 입력
			for(int i =0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			//arr2배열에 입력
			for(int i =0; i<M; i++) {
				arr2[i] = sc.nextInt();
			}
			
			int max = 0; //최대값
			
			if(M>N) {
			for(int i =0; i<M-N+1; i++) { // N=3 M= 5 , N=7 M=6
				int result = 0; // 초기화해주기!
				for(int j =0; j<N; j++) {
					result += arr[j] * arr2[i+j];
				}
				max=Math.max(result,max);
			}
		}
			if(N>M) {
				for(int i =0; i<N-M+1; i++) { // N=3 M= 5 , N=7 M=6
				int result = 0;
				for(int j =0; j<M; j++) {
					 
					result += arr[j+i] * arr2[j];
				}
				max=Math.max(max,result);
			}
			}
			if(N==M) {
				
					int result =0;
					for(int j =0; j<N; j++) {
						result += arr[j] * arr2[j];
					}
					max=Math.max(result, max);
				
			}
			System.out.println("#" + tc + " " +max);
		}
	
		}
	}


