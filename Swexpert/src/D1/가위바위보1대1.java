package D1;

import java.util.Scanner;

public class 가위바위보1대1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		String result = null;
		
		if(A == 1 && B == 2) {
			result = "A";
		}else if( B == 2 && A == 3) {
			result = "A";
		}else if ( B == 1 && A == 3) {
			result = "B";
		}else if (A == 1 && B == 3) {
			result = "A";
		}else if(A== 2 && B == 1) {
		    result = "A";
		}else if (A == 2 && B == 3) {
			result = "B";
		}
		
		System.out.print(result);
		
		
		
		
	}

}
