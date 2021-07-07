package D2;

import java.util.Scanner;

public class 간단한소인수분해 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i =1; i<=T; i++) {
			int N = sc.nextInt(); // 주어지는 수 
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;
			while( N%2 == 0) {N/=2; a++;}
			while( N%3 == 0) {N/=3; b++;}
			while( N%5 == 0) {N/=5; c++;}
			while( N%7 == 0) {N/=7; d++;}
			while( N%11 == 0) {N/=11; e++;}
			
			System.out.println("#" + i+ " " + a + " " + b+ " "+ c+ " "+ d+ " "+ e+ " ");
				
		}
	}

}
