package D2;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자를정렬하자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			int N = sc.nextInt(); //몇개의 문자열을 받을건지
			int arr[] = new int[N];
			
			for(int i =0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int arr2[] = new int[N];
			for(int i =0; i<N; i++) {
				arr2[i] = arr[i];
				
			}
			System.out.print("#" + tc );
			for(int i =0; i<N; i++) {
				System.out.print(" "+arr[i] );
				
			}
			System.out.println(" ");
		}
	}

}
