package D2;

import java.util.Scanner;

public class 시각덧셈 {
	
	static int hour[] ;
	static int min[] ;
	
	static int timeH ;
	static int timeM;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			hour = new int [T];
			min = new int[T];
			for(int i =0; i<2; i++) {
				hour[i] = sc.nextInt(); // 시간
				min[i] = sc.nextInt();
			}

				timeH = hour[0] + hour[1];
				timeM = min[0] + min[1];
				
				if(timeM>=60) {
					timeH = timeH +1;
					timeM = timeM - 60;
				}
				
				if(timeH>12) {
					timeH = timeH-12;
				}
			
			
			System.out.print("#" + tc + " " + timeH + " " + timeM +"\n");
			
		}
		
	}
}
