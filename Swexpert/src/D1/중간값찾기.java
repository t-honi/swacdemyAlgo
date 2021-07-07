package D1;

import java.util.Scanner;

public class 중간값찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
				int N = sc.nextInt();
				int arr[] = new int[N];
				int count[] = new int[100];
			for(int i=0; i<N; i++) {
				arr[i]  = sc.nextInt(); // arr배열에 담는다
				count[arr[i]]++;
				
			}
			int max =0;
				
			for(int i=0; i<101; i++) {
				if(count[i]>=max)
					max = i;
			}
		}
	}

}
