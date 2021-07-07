package D2;

import java.util.Scanner;

public class RC카 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc<=T; tc++) {
			int N = sc.nextInt();
			int dis =0;
			int rc = 0; // rc카의 속도값을 저장하는 정수 초기속도 0
			for(int i =0; i<N; i++) {
				int num = sc.nextInt(); // 그다음 숫자를 입력받아 실행
				switch(num) {
				case 0 : 
					break;
				case 1 :
					rc +=sc.nextInt();
					break;
				case 2 : 
					rc -=sc.nextInt();
					break;
				}
				if(rc<0) rc=0;
				dis +=rc;
			}
		System.out.println("#"+tc+" "+ dis);
		
	}
	}
}
	


