package D2;

import java.util.Scanner;

public class 지그재그숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
		int N = sc.nextInt(); // 숫자 입력값
		int result = 0; // 결과값
		for(int i=1; i<=N; i++) {
			if(i%2 == 0) {
				result -= i;
				
			}else {
				result += i;
			}
		}
		System.out.println("#" + tc + " " + result);
		}
	}

}
