package codeup;

import java.util.*;

public class Q_3007_DP {
	// ** 기억력 테스트 문제 
	// - 숫자 개수를 불러주고, 물어볼 질문의 개수 역시 입력된다.
	// - 기억해야할 숫자가 차례로 입력 된 후 
	// - x~y 까지의 합을 구해 대답을 하면 된다.
	
	// 입력 > 4(기억할 숫자 개수) 2(질문 개수)
	// 입력 > 2 1 4 2 (기억해야할 숫자들)
	// 입력 > 1 2 (첫번째부터 두번째까지의 숫자)
	// 입력 > 2 3 (두번째부터 세번째까지의 숫자)
	
	// 출력 > 3, 5
	
	// 계속 시간초과. -> 반복문으로 일일히 계산하지 말고 누적합을 저장하고 구간만 따로 구하는 방법으로 해결할
	
	static int [] numArray ; 
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numShoudMemo = sc.nextInt();
		int numQuestion = sc.nextInt();
		int result [] = new int [numQuestion];
		
		numArray = new int[numShoudMemo]; 
		
		for(int i = 0; i < numShoudMemo; i++) {
			
			numArray[i] = sc.nextInt();	
			
		}
		
		for(int i = 0; i < numQuestion; i++) {
			
			result[i] =  MemoDP(sc.nextInt() -1, sc.nextInt() - 1);
			
		}
		
		sc.close();
		
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
		
		
	}
	
	static int MemoDP(int start, int end) {
		
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			
			sum += numArray[i];
			
		}
		
		return sum;
		
	}

}
