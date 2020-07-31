package dynamicProgramming;

import java.util.Scanner;

public class DPCoinExchange {
	
	static int coin[];
	static int dp[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// n = 동전의 종류 
		System.out.print("거슬러줄 수 있는 동전의 가지수 : ");int n = sc.nextInt();
		// k = 거슬러줘야 할 금액 
		System.out.print("거스름돈 금액 : ");int k = sc.nextInt();
		
		
		coin = new int[n]; // 동전의 종류를 입력받을 배열
		dp = new int[k+1]; // 거스름돈 금액별 최소 동전 갯수를 memoization할 DP 배열 
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("동전종류 : ");coin[i] = sc.nextInt();
		}
		
		sc.close();
		
		
		for(int i = 1; i <= k; i++) {// 1원부터 k원까지 작은단위로 나눠 최소 동전 갯수를 기록한다. 
			for(int j = 0; j < n; j++) { // 동전 종류별로 비교를 한다. 	
				
				if(i >= coin[j]) { // 만일 거슬러줘야할 금액이 n번째 코인보다 크거나 같으면 
					dp[i] = dp[i - coin[j]] + 1; 
					// 예를 들어 3원 만큼 거슬러줘야하고 동전의 종류는 1 2 라고 해보자.
					// 1원일 때는 dp[1] = dp[1 - coin[i](1)] + 1 즉 0 + 1 이다.
					// 2원일 때는 dp[2] = dp [2 - 1] + 1, 2개
					//                  dp [2 - 2] + 1. 1개 가 되므로 1이 된다.
					// 결국 3원일 때 dp[3 - 2] + 1 이므로 2개가 된다. 
				}							
			}			
		}
		
		System.out.println(dp[k]);
		
		
		
	}// end main() 

}
