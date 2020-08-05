package dynamicProgramming;

import java.util.Scanner;

public class DPRodCutting {
	// ** DP 막대기 자르기 문제 
	// - 막대기의 길이가 주어지고 이 막대기를 길이 1부터 1씩 늘려가며 자른다고 가정 (3일경우 1, 2, 3 세가지 방법으로 재단 가능) 
	//   자른 막대기는 각기 다른 가격으로 판매가 됨. 이 때 가장 비싸게 팔 수 있는 경우의 수를 생각해
	//   막대기를 판매했을 때 받을 수 있는 가장 비싼 값을 도출해낸다. 
	
	// - 막대의 총길이가 1일때부터 순차적으로 최고로 비싼 값을 dp에 메모 
	// - 막대의 길이가 n일때 n - i (이때 i는 조각의 길이) 길이의 최대 가격에 i의 가격을 더해줌.
	// - (n-i) + (i길이 가격) <- 해당 식을 i++ 하며 반복시켜 이들 중 최데값을 dp[n]에 기록
	// - 이 과정을 반복해 최대 가격을 dp[n]에 기록한다. 
	
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
