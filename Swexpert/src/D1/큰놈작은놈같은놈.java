package D1;
import java.util.Scanner;
import java.util.Arrays;

public class 큰놈작은놈같은놈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		int [] arr = new int[2];
		for(int i = 1 ; i<testcase+1; i++) {
			
			int a = 0;
			int b = 0;
			for(int j= 0; j<arr.length; j++) {
				if(arr[j]>=0 && arr[j]<=10000) {
				arr[j] = sc.nextInt();
				a = arr[0];
				b = arr[1];
				
			}
			}
			if ( a>b ) {
				System.out.print("#" + i + ">" + "\n");
			}else if (a<b) {
				System.out.print("#" + i + "<" + "\n");
			}else{
				System.out.print("#" + i + "=" + "\n");
			}
				
		}
		
		
	}

}
