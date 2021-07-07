package D1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class 자릿수더하기2058 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = bf.readLine();
//		int N = Integer.parseInt(bf.readLine());
		int result = 0;
		
		for(int i=0; i<str.length(); i++) {
			result = result+str.charAt(i)-'0';
		}
		bw.write(result+"");
		bw.flush();
		bw.close();
	}

}
