package D2;

import java.util.Scanner;

public class 쉬운거스름돈 {
	public static void main(String[] args) {
		int money[] = {50000,10000,5000,1000,500,100,50,10};
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			int N = sc.nextInt();
			System.out.format("#%d\n" , tc);
			for(int u : money) {
				System.out.print( N/u + " ");
				N%=u;
			}
			System.out.println();
			
			 
		}
	}

}
