package D2;

import java.util.Scanner;

public class 패턴마디의길이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); 
		// 마디의 개수가 아니라 마디의 길이를 구하기....
		for(int tc= 1; tc<=T; tc++) {
			String str = sc.next();
			for(int i=1; i<=10; i++) {
				String pre = str.substring(0,i); // 차근차근 비교하기 이전값과 다음값을 늘려가면서 검사하기 
				String next = str.substring(i,i+i); // 받은 입력값 배열에 넣어주기 
				if(pre.equals(next)) {
					System.out.println("#" + tc + " " + pre.length());
					break;
				}
				
				
				if(i == 1) {
					 pre = str.substring(0,1);
					 next = str.substring(1,2);
					 if(pre.equals(next)) {
						 System.out.println("#" + tc + " " + 1);
						 break;
					 }
				}
			}
			
		}
		sc.close();
		
	}

}
