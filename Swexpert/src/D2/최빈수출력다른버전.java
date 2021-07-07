package D2;

import java.util.Scanner;

public class 최빈수출력다른버전 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			System.out.println("#"+tc+" ");
			int a = sc.nextInt();
			int [] arr= new int[101];
			
			for(int i =0; i<1000; i++) {
				//입력받은값 저장
				arr[sc.nextInt()]++; //입력값을 받고 arr 증가
			}
			int max =0;
			int index =0;
			for(int i =100; i>0; i--) {
				if(max<arr[i]) {
					index = i; //100부터 차례대로 1까지 , index를알려주고
					max =arr[i]; // 최대값에 arr[i] 번째 값을 넣어주고 다시 반복
				}
			}
			System.out.println(index);
		}
	}

}
