package codeup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q_3015_Structure {
	
	// 성적 입력, 출력하기
	// 1. 첫 입력에 입력할 학생 수, 출력할 학생 수를 차례로 입력 
	// 2. 학생들의 이름과 점수를 입력 
	// 3. 앞서 지정한 출력할 학생 수만큼 점수가 큰 순서대로 출력 
	// 예시)
	// 입력 3 2
	//     A 9
	//     B 2
	//     C 7
	// 출력 A C 
	
	
	public static void main(String[] args) {
		
		int inputNum;
		int outputNum;
		List<testResult> list = new ArrayList<testResult>();
		
		Scanner sc = new Scanner(System.in);
		
		inputNum = sc.nextInt();
		outputNum = sc.nextInt();
		
		for(int i = 0; i < inputNum; i++) {
			String StuName = sc.next();
			int score = sc.nextInt();
			
			
			testResult tr = new testResult(score, StuName);
			
			list.add(tr);
			
		}
		sc.close();
		
			Collections.sort(list);
			
			for(int i = 0; i < outputNum; i++) {
				
				System.out.println(list.get(i).StuName);
				
			}
		
		
		
		
		
	}


}

class testResult implements Comparable<testResult>{
	
	int score;
	String StuName;
	
	public testResult(int score, String StuName) {
		
		this.score = score;
		this.StuName = StuName;
		
	}


	@Override
	public int compareTo(testResult o) {
		
		if (score < o.score)
			return 1;
		else if (score > o.score)
			return -1;
		else 
			return 0;
	
	}
	
	
}



