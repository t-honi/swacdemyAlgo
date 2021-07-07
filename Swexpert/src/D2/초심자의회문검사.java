package D2;

import java.util.Arrays;
import java.util.Scanner;

public class 초심자의회문검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		 
		
		for(int tc = 1; tc<=T; tc++) {
			String s = sc.next();
			boolean check = true;
			String arr[] = new String[s.length()];
			String arr2[] = new String[s.length()];
			for(int i =0; i<s.length(); i++) {	
				arr[i] = s.substring(i, i+1);
			}
			for(int i=0; i<s.length(); i++) {
				arr2[i] = arr[(arr.length-1-i)];
			}
			
			check = Arrays.equals(arr,arr2); // arrays.equls 반환값은 true, false
			if(check) {
				System.out.println("#" + tc + " " + 1);
			}else {
				System.out.println("#" + tc + " " + 0);
			}
		}
	}

}
