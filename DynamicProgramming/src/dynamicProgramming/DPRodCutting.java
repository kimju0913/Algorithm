package dynamicProgramming;

import java.util.Scanner;

public class DPRodCutting {
	
	static int rodCost[];
	static int dp[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("막대기의 길이는 : ");int length = sc.nextInt();
		
		System.out.print("자른 막대기의 길이는 몇까지? : "); int cutLength = sc.nextInt();
		
		dp = new int[length + 1];
		rodCost = new int[cutLength + 1];
		
		for(int i = 1; i < rodCost.length; i++) {
			System.out.print("길이 " + i + " 의 가격은 ? : "); rodCost[i] = sc.nextInt();
		}
		
		sc.close();
		
		for(int i = 1; i < rodCost.length; i++) {
			
			for(int j = 1; j < dp.length; j++) {
			 if(j >= i)	// 막대기의 길이가 자른 막대기의 길이보다 길거나 같은 경우
				if(dp[j - i] + rodCost[i] >= dp[j]) { // 만일 [(전체길이 - 막대기길이)의 최대값 + i의 가격]의 값이 현재 최대값 보다 크면  
					dp[j] = dp[j - i] + rodCost[i]; // 현재 최대값을 갱신한다.
					// 즉 이전의 최댓값에서 더했을때 현재의 최댓값보다 크면 갱신하고 기록한다. 
				}
				
			}
	
		}
		
		System.out.println(dp[length]);
		
		
	}

}
