package codeup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Q_2016_Stack {
	
	// ** 천자리 숫자 구분하기
	// 입력한 수를 천 단위로 구분하여 콤마를 찍는다 예) 100000 -> 100,000
	
	// 1. 자릿수 n을 입력받는다.
	// 2. 숫자를 입력받는다.
	// 3. 천 자릿수를 구분하여 콤마를 찍는다. 

	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<String>();
		
		Scanner sc = new Scanner(System.in);
	
		

		int a = sc.nextInt();
		String number = sc.next();
		
		String [] numStr = number.split("");
		
		for(int i = 0; i < numStr.length; i++) {
			
			q.offer(numStr[i]);
			
			
		}
		
		
		
		while(!q.isEmpty()) {
			
			if(q.size() % 3 == 0 && q.size() != a)
				System.out.print(",");
	
			System.out.print(q.poll());
			
		
			
		}
		
		
		
		
	}
	
	
	
}
