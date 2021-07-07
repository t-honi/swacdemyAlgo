package D2;

import java.util.Scanner;

public class 날짜계산기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int day = 0; // 날짜 셀 공간
			int SM = sc.nextInt(); // 시작월
			int SD = sc.nextInt(); // 시작일
			int EM = sc.nextInt(); // 끝월
			int ED = sc.nextInt(); // 끝일
			for(int m = SM; m<EM; m++) {
				day += arr[m];
			}
			day += (ED - SD+1);
			
			System.out.println("#" + tc +" " + day);
		}
	}

}
