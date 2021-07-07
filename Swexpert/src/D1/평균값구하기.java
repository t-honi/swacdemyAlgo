package D1;import java.util.Scanner;
import java.util.Arrays;

public class 평균값구하기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("테스트케이스 입력!");
		int testcase = Integer.parseInt(scan.nextLine()); // Integer.parseInt , valueof 차이점 한번 써보기
		int [] numbers = new int[10];
		for(int i = 1; i<testcase + 1; i++) {
			//System.out.println("정수 10개선언");
			double sum =0;
			double average =0;
			for(int j = 0; j<numbers.length; j++) {
				if(j>=0 && j<=10000) {
					numbers[j] = scan.nextInt(); // nextInt, Integer.parseInt(nextLine());
					sum += numbers[j];
					average = Math.round(sum / numbers.length); // math round 만약에 9.8이라는 값이 나오면 long,int에서 가장 가까운값의 정수를 출력해준다
				}
			}
			//System.out.println((int)sum);
			System.out.print("#" + i + " " + (int)average + "\n");
		}
	}
}
