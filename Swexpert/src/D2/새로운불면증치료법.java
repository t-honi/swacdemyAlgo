package D2;

import java.io.*;

public class 새로운불면증치료법 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<=T; tc++) {
        
        	
			String s = br.readLine(); //입력받은 입력값 받기
			int n = Integer.parseInt(s);// 받은 문자형 정수형으로 형변환
            
            
            //0-9까지의 숫자를 모두 봤는지 확인
			boolean check[] = new boolean[10]; // 10개의 boolean 박스 만들어서 확인
			int count = 0; // 만약 카운트개수가 10개면 전체 검사 완료
			
            
			int x=1; //입력받은 n에 계속 곱해줄 변수 문제에서 확인 가능
			while(true) {
				for(int i=0; i<s.length(); i++) {
                	//한글자씩 정수로 변환하여 확인
					int tmp = Integer.parseInt(s.substring(i,i+1)); //안에 인덱스부터 다음인덱스까지 형변환
					if(check[tmp] == false) { // check 
						count++;
						check[tmp] = true;
					}
				}
				
                //10개를 모두 봤다
				if(count == 10) break;
				
				x++;
				s = Integer.toString(n*x);
			}
			
			System.out.println("#"+tc+" "+s);
			
			
		}
	}

}