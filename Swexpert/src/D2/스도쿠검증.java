package D2;

import java.util.Scanner;

public class 스도쿠검증 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		int arr[][] =new int[9][9];
		int checkgaro[] = new int[10];
		int checksero[] = new int[10];
		int checksam[] = new int[10];
		for(int tc =1; tc<=T; tc++) {
			
			for(int i=0;i<9; i++) {
				for(int j=0; j<9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 가로검사 
			for(int i =0; i<9; i++) {
				for(int j=0; j<9; j++) {
					checkgaro[arr[i][j]]++;
				}
			}
			// 세로검사 
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					checksero[arr[j][i]]++;
				}
			}
			// 3x3배열검사 
			for(int i =0; i<3; i++) {
				for(int j = i; j<i+3)
			}
			
		}
	}

}
