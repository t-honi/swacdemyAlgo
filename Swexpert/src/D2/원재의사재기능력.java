package D2;

import java.util.Scanner;

public class 원재의사재기능력 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			// 들어오는 입력의 수 
			int N = sc.nextInt();
			// 매매가 저장
			int arr[] = new int[N];
			
			// 숫자를 담자 
			for(int i =0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			 
			long sum = 0; // 이익
			int max = arr[N-1]; // 인덱스 값
			for(int i =N-2; i>=0; i--) {
				//밖에 나가는 범위와, 뒤에서부터 검사, 그리고 앞에 값이 자신보다 작으면 구매
				if(arr[i]>max) {
					 max = arr[i];
				}else {
					sum += max - arr[i];
				}
			}
			System.out.println("#" + tc + " " +sum);
			
		}
	}

}
