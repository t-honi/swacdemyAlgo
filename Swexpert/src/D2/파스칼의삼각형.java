package D2;

import java.util.Scanner;

public class 파스칼의삼각형 {
	static int arr[][] ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc++) {
			int N = sc.nextInt();
			System.out.println("#" + tc);
			arr = new int[N][N];
			arr[0][0] = 1;
			for(int i =1; i<N; i++) {
				arr[i][0] = 1;
				for(int j =1; j<=i; j++) {
					
					arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
					
				}
			}
			for(int i = 0; i<N; i++) {
				for(int j =0; j<=i; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
			
	}
}


// 버전 2
//package D2;
//
//import java.util.Scanner;
//
//public class 파스칼의삼각형 {
//	static int arr[][] ;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int T = sc.nextInt();
//		for(int tc = 1; tc<= T; tc++) {
//			int N = sc.nextInt();
//			System.out.println("#" + tc);
//			arr = new int[N][N];
//			arr[0][0] = 1;
//			for(int i =1; i<N; i++) {
//				for(int j =0; j<=i; j++) {
//					if(j==0 || j==i) {
//						arr[i][j] = 1;
//					}else {
//					arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
//					}
//				}
//			}
//			for(int i = 0; i<N; i++) {
//				for(int j =0; j<=i; j++) {
//					System.out.print(arr[i][j]+" ");
//				}
//				System.out.println();
//			}
//			
//		}
//		
//			
//	}
//}
