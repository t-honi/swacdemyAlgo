package D1;

import java.util.Scanner;

public class N줄덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		int sum = 0;
		for(int i=0; i<a; i++) {
			count = (i*1+1);
			sum +=count;
		}
		System.out.print(sum);
	}

}
