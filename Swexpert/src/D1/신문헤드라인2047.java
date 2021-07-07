package D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 신문헤드라인2047 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = ""; // 받을 입력값
		String output= ""; // 출력해줄 출력값
		int tmp;
		input = bf.readLine(); // input에 저장해주고 
		for(int i =0; i<input.length(); i++) {
			tmp = (int)input.charAt(i); // 빈공간에 인티저값을 저장해주고 
			// 반복을 돌려야지 if로 확인을해야지 
			if ((97 <= tmp) &&(tmp <= 122) ) {
				//만약 이 사이이면 , -32빼서 대문자로 변환
				output += (char)(tmp-32);
			}else 
				output += (char)tmp;
		}
		System.out.println(output);
	}

}
