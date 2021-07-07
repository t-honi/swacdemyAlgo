package D2;

import java.util.Scanner;

public class 수도요금경쟁 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int P = sc.nextInt(); //1리터당 내는돈
			int Q = sc.nextInt(); // 기본요금
			int R = sc.nextInt(); // 월간 R리터 이하
			int S = sc.nextInt(); // B사의 1리터요금
			int W = sc.nextInt(); // 물 사용량 
			int A = 0; // a사 결과값
			int B = 0; // b사 결과값 
			A = P * W;
			if(W<=R) {
				B = Q;
			}else {
				B = Q + (W-R)*S;
			}
			
			if(A>B) {
				System.out.println("#"+tc+" "+B);
			}else {
				System.out.println("#"+tc+" "+A);
			}
			
		}
	}

}
