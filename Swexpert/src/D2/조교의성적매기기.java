package D2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 조교의성적매기기 {
	static class Student implements Comparable<Student>{
		double grade;
		int num; 
		
		public Student(double grade, int num) {
			this.grade = grade;
			this.num = num;
		}

		@Override
		public int compareTo(Student s) {
			if(this.grade>s.grade)
				return -1; 
			else
			return 1;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alpa = {"A+","A","A-","B+","B","B-","C+","C0","C-","D0"};
		int T = sc.nextInt();
		
		for(int t= 1; t<=T; t++ ) {
			ArrayList<Student> a = new ArrayList();
			int n = sc.nextInt();
			int target = sc.nextInt();
			
			for(int i =0; i<=n; i++) {
				double tmp1 = sc.nextDouble()*35/100;
				double tmp2 = sc.nextDouble()*45/100;
				double tmp3 = sc.nextDouble()*20/100;
				
				a.add(new Student(tmp1+tmp2+tmp3,i));
			}
			Collections.sort(a);
			for(int i =0; i<a.size(); i++) {
				Student tmp = (Student)a.get(i);
				if(tmp.num == target) {
					double idx = (double)i / a.size();
					
					System.out.println("#" + t +  " " + alpa[(int)(idx*10)]);
				}			
			}
		
		}
	}
}
